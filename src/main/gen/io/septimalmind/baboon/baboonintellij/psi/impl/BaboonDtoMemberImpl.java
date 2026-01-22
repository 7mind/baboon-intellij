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

public class BaboonDtoMemberImpl extends ASTWrapperPsiElement implements BaboonDtoMember {

  public BaboonDtoMemberImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BaboonVisitor visitor) {
    visitor.visitDtoMember(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BaboonVisitor) accept((BaboonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BaboonExtendedContractDef getExtendedContractDef() {
    return PsiTreeUtil.getChildOfType(this, BaboonExtendedContractDef.class);
  }

  @Override
  @Nullable
  public BaboonFieldDef getFieldDef() {
    return PsiTreeUtil.getChildOfType(this, BaboonFieldDef.class);
  }

  @Override
  @Nullable
  public BaboonIntersectionDef getIntersectionDef() {
    return PsiTreeUtil.getChildOfType(this, BaboonIntersectionDef.class);
  }

  @Override
  @Nullable
  public BaboonParentDef getParentDef() {
    return PsiTreeUtil.getChildOfType(this, BaboonParentDef.class);
  }

  @Override
  @Nullable
  public BaboonUnfieldDef getUnfieldDef() {
    return PsiTreeUtil.getChildOfType(this, BaboonUnfieldDef.class);
  }

  @Override
  @Nullable
  public BaboonUnparentDef getUnparentDef() {
    return PsiTreeUtil.getChildOfType(this, BaboonUnparentDef.class);
  }

}
