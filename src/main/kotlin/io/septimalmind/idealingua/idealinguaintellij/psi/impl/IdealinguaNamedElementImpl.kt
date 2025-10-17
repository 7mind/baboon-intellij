package io.septimalmind.idealingua.idealinguaintellij.psi.impl

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.util.NlsSafe
import com.intellij.psi.PsiElement
import io.septimalmind.idealingua.idealinguaintellij.language.IdealinguaIcon
import io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaElementFactory
import io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaNamedElement
import io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaTypes
import io.septimalmind.utils.PluginUtils
import javax.swing.Icon

abstract class IdealinguaNamedElementImpl(node: ASTNode): ASTWrapperPsiElement(node), IdealinguaNamedElement {

    override fun getName(): String? {
        return node.findChildByType(IdealinguaTypes.IDENTIFIER)?.text
    }

    override fun setName(name: String): PsiElement? {
        val nameNode: ASTNode? = node.findChildByType(IdealinguaTypes.IDENTIFIER)
        if (nameNode != null) {
            val className = IdealinguaElementFactory.createClassName(project, name)
            val newNameNode: ASTNode = className.node.findChildByType(IdealinguaTypes.IDENTIFIER)!!
            node.replaceChild(nameNode, newNameNode)
        }
        return this
    }

    override fun getNameIdentifier(): PsiElement? {
        return node.findChildByType(IdealinguaTypes.IDENTIFIER)?.psi
    }

    override fun getPresentation(): ItemPresentation? {
        val fileLocation = PluginUtils.getRelativePath(project.basePath.orEmpty(), containingFile.virtualFile.path)
        return object : ItemPresentation {
            override fun getPresentableText(): @NlsSafe String? {
                return getName()
            }

            override fun getLocationString(): @NlsSafe String? {
                return fileLocation
            }

            override fun getIcon(p0: Boolean): Icon? {
               return IdealinguaIcon.FILE
            }
        }
    }
}