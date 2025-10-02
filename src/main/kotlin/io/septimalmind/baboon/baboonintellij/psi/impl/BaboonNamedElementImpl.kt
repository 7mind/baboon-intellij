package io.septimalmind.baboon.baboonintellij.psi.impl

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.util.NlsSafe
import com.intellij.psi.PsiElement
import io.septimalmind.baboon.baboonintellij.language.BaboonIcon
import io.septimalmind.baboon.baboonintellij.psi.BaboonElementFactory
import io.septimalmind.baboon.baboonintellij.psi.BaboonNamedElement
import io.septimalmind.baboon.baboonintellij.psi.BaboonTypes
import javax.swing.Icon

abstract class BaboonNamedElementImpl(node: ASTNode): ASTWrapperPsiElement(node), BaboonNamedElement {

    override fun getName(): String? {
        return node.findChildByType(BaboonTypes.IDENTIFIER)?.text
    }

    override fun setName(name: String): PsiElement? {
        val nameNode: ASTNode? = node.findChildByType(BaboonTypes.IDENTIFIER)
        if (nameNode != null) {
            val className = BaboonElementFactory.createClassName(project, name)
            val newNameNode: ASTNode = className.node.findChildByType(BaboonTypes.IDENTIFIER)!!
            node.replaceChild(nameNode, newNameNode)
        }
        return this
    }

    override fun getNameIdentifier(): PsiElement? {
        return node.findChildByType(BaboonTypes.IDENTIFIER)?.psi
    }

    override fun getPresentation(): ItemPresentation? {
        val fileLocation = containingFile.name
        return object : ItemPresentation {
            override fun getPresentableText(): @NlsSafe String? {
                return getName()
            }

            override fun getLocationString(): @NlsSafe String? {
                return fileLocation
            }

            override fun getIcon(p0: Boolean): Icon? {
               return BaboonIcon.FILE
            }
        }
    }
}