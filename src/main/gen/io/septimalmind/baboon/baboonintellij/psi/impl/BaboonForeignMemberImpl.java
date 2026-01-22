// This is a generated file. Not intended for manual editing.
package io.septimalmind.baboon.baboonintellij.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.septimalmind.baboon.baboonintellij.psi.BaboonTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.septimalmind.baboon.baboonintellij.psi.*;

public class BaboonForeignMemberImpl extends ASTWrapperPsiElement implements BaboonForeignMember {

  public BaboonForeignMemberImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BaboonVisitor visitor) {
    visitor.visitForeignMember(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BaboonVisitor) accept((BaboonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BaboonForeignAttrs getForeignAttrs() {
    return PsiTreeUtil.getChildOfType(this, BaboonForeignAttrs.class);
  }

  @Override
  @NotNull
  public BaboonStringLiteral getStringLiteral() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, BaboonStringLiteral.class));
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return notNullChild(findChildByType(IDENTIFIER));
  }

}
