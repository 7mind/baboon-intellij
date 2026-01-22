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

public class BaboonAdtMemberImpl extends ASTWrapperPsiElement implements BaboonAdtMember {

  public BaboonAdtMemberImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BaboonVisitor visitor) {
    visitor.visitAdtMember(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BaboonVisitor) accept((BaboonVisitor)visitor);
    else super.accept(visitor);
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
  public BaboonExtendedContractDef getExtendedContractDef() {
    return PsiTreeUtil.getChildOfType(this, BaboonExtendedContractDef.class);
  }

}
