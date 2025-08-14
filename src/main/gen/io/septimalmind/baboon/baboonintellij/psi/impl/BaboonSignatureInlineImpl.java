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

public class BaboonSignatureInlineImpl extends ASTWrapperPsiElement implements BaboonSignatureInline {

  public BaboonSignatureInlineImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BaboonVisitor visitor) {
    visitor.visitSignatureInline(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BaboonVisitor) accept((BaboonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BaboonAdtInService getAdtInService() {
    return findChildByClass(BaboonAdtInService.class);
  }

  @Override
  @Nullable
  public BaboonChoiceInService getChoiceInService() {
    return findChildByClass(BaboonChoiceInService.class);
  }

  @Override
  @Nullable
  public BaboonDtoInService getDtoInService() {
    return findChildByClass(BaboonDtoInService.class);
  }

}
