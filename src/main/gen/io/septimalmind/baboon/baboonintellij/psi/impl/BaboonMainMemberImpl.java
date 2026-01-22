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

public class BaboonMainMemberImpl extends ASTWrapperPsiElement implements BaboonMainMember {

  public BaboonMainMemberImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BaboonVisitor visitor) {
    visitor.visitMainMember(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BaboonVisitor) accept((BaboonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BaboonAdt getAdt() {
    return PsiTreeUtil.getChildOfType(this, BaboonAdt.class);
  }

  @Override
  @Nullable
  public BaboonChoice getChoice() {
    return PsiTreeUtil.getChildOfType(this, BaboonChoice.class);
  }

  @Override
  @Nullable
  public BaboonContract getContract() {
    return PsiTreeUtil.getChildOfType(this, BaboonContract.class);
  }

  @Override
  @Nullable
  public BaboonDto getDto() {
    return PsiTreeUtil.getChildOfType(this, BaboonDto.class);
  }

  @Override
  @Nullable
  public BaboonForeign getForeign() {
    return PsiTreeUtil.getChildOfType(this, BaboonForeign.class);
  }

  @Override
  @Nullable
  public BaboonService getService() {
    return PsiTreeUtil.getChildOfType(this, BaboonService.class);
  }

}
