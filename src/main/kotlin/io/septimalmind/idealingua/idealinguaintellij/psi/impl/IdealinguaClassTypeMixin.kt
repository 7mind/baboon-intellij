//package io.septimalmind.idealingua.idealinguaintellij.psi.impl
//
//import com.intellij.extapi.psi.ASTWrapperPsiElement
//import com.intellij.lang.ASTNode
//import com.intellij.psi.PsiReference
//import io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaClassType
//import io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaReference
//
//abstract class IdealinguaClassTypeMixin(node: ASTNode): ASTWrapperPsiElement(node), IdealinguaClassType {
//
//    override fun getReference(): PsiReference? {
//        return IdealinguaReference(this, textRangeInParent)
//    }
//}