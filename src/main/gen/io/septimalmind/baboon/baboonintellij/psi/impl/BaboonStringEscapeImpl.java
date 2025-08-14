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

public class BaboonStringEscapeImpl extends ASTWrapperPsiElement implements BaboonStringEscape {

  public BaboonStringEscapeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BaboonVisitor visitor) {
    visitor.visitStringEscape(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BaboonVisitor) accept((BaboonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getNumberEscape() {
    return findChildByType(NUMBER_ESCAPE);
  }

  @Override
  @Nullable
  public PsiElement getSymbolEscape() {
    return findChildByType(SYMBOL_ESCAPE);
  }

  @Override
  @Nullable
  public PsiElement getUnicodeEscape() {
    return findChildByType(UNICODE_ESCAPE);
  }

}
