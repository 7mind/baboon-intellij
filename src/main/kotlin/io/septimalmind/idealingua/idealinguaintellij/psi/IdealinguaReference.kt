package io.septimalmind.idealingua.idealinguaintellij.psi

import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.project.DumbService
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementResolveResult
import com.intellij.psi.PsiPolyVariantReferenceBase
import com.intellij.psi.ResolveResult
import io.septimalmind.idealingua.idealinguaintellij.language.IdealinguaIcon
import io.septimalmind.utils.PluginUtils

class IdealinguaReference(element: PsiElement, textRange: TextRange): PsiPolyVariantReferenceBase<PsiElement?>(element, textRange) {

    private val key = element.text.substring(textRange.startOffset, textRange.endOffset)

    override fun multiResolve(incompleteCode: Boolean): Array<out ResolveResult?> {
        val project: Project = myElement?.project ?: return emptyArray()

        if (DumbService.isDumb(project)) {
            return emptyArray()
        }

        val properties = IdealinguaUtils.findClassNames(project, key)
        return properties.map { PsiElementResolveResult(it) }.toTypedArray()
    }

    override fun getVariants(): Array<out Any?> {
        val project: Project = myElement?.project ?: return emptyArray()

        if (DumbService.isDumb(project)) {
            return emptyArray()
        }

        val classNames = IdealinguaUtils.findClassNames(project, "")
        val variants = ArrayList<LookupElement>()
        for (name in classNames) {
            val className = name.name
            if (className != null) {
                val fileLocation = PluginUtils.getRelativePath(
                    project.basePath.orEmpty(),
                    name.containingFile.virtualFile.path
                )
                variants.add(
                    LookupElementBuilder
                        .create(name)
                        .withIcon(IdealinguaIcon.FILE)
                        .withTypeText(fileLocation)
                )
            }
        }
        return variants.toTypedArray()
    }
}