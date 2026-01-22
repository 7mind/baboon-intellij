package io.septimalmind.idealingua.idealinguaintellij.psi.impl

import com.intellij.extapi.psi.StubBasedPsiElementBase
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.util.NlsSafe
import com.intellij.psi.PsiElement
import com.intellij.psi.stubs.IStubElementType
import io.septimalmind.idealingua.idealinguaintellij.language.IdealinguaIcon
import io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaClassName
import io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaElementFactory
import io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaTypes
import io.septimalmind.idealingua.idealinguaintellij.psi.stubs.IdealinguaClassNameStub
import io.septimalmind.idealingua.idealinguaintellij.psi.stubs.IdealinguaStubElementTypes
import io.septimalmind.utils.PluginUtils
import javax.swing.Icon

abstract class IdealinguaClassNameMixin : StubBasedPsiElementBase<IdealinguaClassNameStub>, IdealinguaClassName {

    constructor(node: ASTNode) : super(node)

    constructor(stub: IdealinguaClassNameStub, nodeType: IStubElementType<*, *>) : super(stub, nodeType)

    override fun getName(): String? {
        val stub = greenStub
        if (stub != null) {
            return stub.name
        }
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
