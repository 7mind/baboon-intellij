package io.septimalmind.baboon.baboonintellij.psi

import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementResolveResult
import com.intellij.psi.PsiPolyVariantReferenceBase
import com.intellij.psi.ResolveResult
import io.septimalmind.baboon.baboonintellij.language.BaboonIcon
import io.septimalmind.utils.PluginUtils

class BaboonReference(element: PsiElement, textRange: TextRange): PsiPolyVariantReferenceBase<PsiElement?>(element, textRange) {

    private val key = element.text.substring(textRange.startOffset, textRange.endOffset)

    override fun multiResolve(p0: Boolean): Array<out ResolveResult?> {
        val project: Project = myElement!!.project
        val elementDirectory = element.containingFile.originalFile.parent
        val properties = BaboonUtils.findClassNames(project, elementDirectory, key)
        val results = ArrayList<ResolveResult>()
        for (property in properties) {
            results.add(PsiElementResolveResult(property))
        }
        return results.toTypedArray()
    }

    override fun getVariants(): Array<out Any?> {
        val project: Project = myElement!!.project
        val elementDirectory = element.containingFile.originalFile.parent
        val classNames = BaboonUtils.findClassNames(project, elementDirectory,"")
        val variants = ArrayList<LookupElement>()
        for (name in classNames) {
            if (name.name != null) {
                val fileLocation = PluginUtils.getRelativePath(project.basePath.orEmpty(), name.containingFile.virtualFile.path)
                variants.add(
                    LookupElementBuilder
                        .create(name).withIcon(BaboonIcon.FILE)
                        .withTypeText(fileLocation)
                )
            }
        }
        return variants.toTypedArray()
    }
}