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

public class IdealinguaBaseTypeMemberImpl extends ASTWrapperPsiElement implements IdealinguaBaseTypeMember {

  public IdealinguaBaseTypeMemberImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdealinguaVisitor visitor) {
    visitor.visitBaseTypeMember(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdealinguaVisitor) accept((IdealinguaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdealinguaAdt getAdt() {
    return PsiTreeUtil.getChildOfType(this, IdealinguaAdt.class);
  }

  @Override
  @Nullable
  public IdealinguaAlias getAlias() {
    return PsiTreeUtil.getChildOfType(this, IdealinguaAlias.class);
  }

  @Override
  @Nullable
  public IdealinguaDto getDto() {
    return PsiTreeUtil.getChildOfType(this, IdealinguaDto.class);
  }

  @Override
  @Nullable
  public IdealinguaEnum getEnum() {
    return PsiTreeUtil.getChildOfType(this, IdealinguaEnum.class);
  }

  @Override
  @Nullable
  public IdealinguaId getId() {
    return PsiTreeUtil.getChildOfType(this, IdealinguaId.class);
  }

  @Override
  @Nullable
  public IdealinguaMixin getMixin() {
    return PsiTreeUtil.getChildOfType(this, IdealinguaMixin.class);
  }

}
