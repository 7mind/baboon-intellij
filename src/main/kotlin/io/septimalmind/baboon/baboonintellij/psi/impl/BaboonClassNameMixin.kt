package io.septimalmind.baboon.baboonintellij.psi.impl

import com.intellij.extapi.psi.StubBasedPsiElementBase
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.util.NlsSafe
import com.intellij.psi.PsiElement
import com.intellij.psi.stubs.IStubElementType
import io.septimalmind.baboon.baboonintellij.language.BaboonIcon
import io.septimalmind.baboon.baboonintellij.psi.BaboonClassName
import io.septimalmind.baboon.baboonintellij.psi.BaboonElementFactory
import io.septimalmind.baboon.baboonintellij.psi.BaboonTypes
import io.septimalmind.baboon.baboonintellij.psi.stubs.BaboonClassNameStub
import io.septimalmind.baboon.baboonintellij.psi.stubs.BaboonStubElementTypes
import io.septimalmind.utils.PluginUtils
import javax.swing.Icon

abstract class BaboonClassNameMixin : StubBasedPsiElementBase<BaboonClassNameStub>, BaboonClassName {

    constructor(node: ASTNode) : super(node)

    constructor(stub: BaboonClassNameStub, nodeType: IStubElementType<*, *>) : super(stub, nodeType)

    override fun getName(): String? {
        val stub = greenStub
        if (stub != null) {
            return stub.name
        }
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
        val fileLocation = PluginUtils.getRelativePath(project.basePath.orEmpty(), containingFile.virtualFile.path)
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
