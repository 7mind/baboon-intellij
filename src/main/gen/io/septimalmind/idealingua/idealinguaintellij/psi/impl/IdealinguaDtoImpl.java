// This is a generated file. Not intended for manual editing.
package io.septimalmind.idealingua.idealinguaintellij.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.septimalmind.idealingua.idealinguaintellij.psi.*;

public class IdealinguaDtoImpl extends ASTWrapperPsiElement implements IdealinguaDto {

  public IdealinguaDtoImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdealinguaVisitor visitor) {
    visitor.visitDto(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdealinguaVisitor) accept((IdealinguaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public IdealinguaClassName getClassName() {
    return findNotNullChildByClass(IdealinguaClassName.class);
  }

  @Override
  @NotNull
  public List<IdealinguaStructMember> getStructMemberList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, IdealinguaStructMember.class);
  }

}
