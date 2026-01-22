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

public class IdealinguaForeignMemberImpl extends ASTWrapperPsiElement implements IdealinguaForeignMember {

  public IdealinguaForeignMemberImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdealinguaVisitor visitor) {
    visitor.visitForeignMember(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdealinguaVisitor) accept((IdealinguaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public IdealinguaForeignType getForeignType() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, IdealinguaForeignType.class));
  }

  @Override
  @NotNull
  public IdealinguaStringLiteral getStringLiteral() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, IdealinguaStringLiteral.class));
  }

}
