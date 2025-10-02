package io.septimalmind.baboon.baboonintellij.psi.impl

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiReference
import io.septimalmind.baboon.baboonintellij.psi.BaboonClassType
import io.septimalmind.baboon.baboonintellij.psi.BaboonReference

abstract class BaboonClassTypeMixin(node: ASTNode): ASTWrapperPsiElement(node), BaboonClassType {

    override fun getReference(): PsiReference? {
        return BaboonReference(this, textRangeInParent)
    }
}