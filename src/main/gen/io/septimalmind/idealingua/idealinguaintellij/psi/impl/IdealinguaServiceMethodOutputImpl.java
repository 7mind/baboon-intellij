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

public class IdealinguaServiceMethodOutputImpl extends ASTWrapperPsiElement implements IdealinguaServiceMethodOutput {

  public IdealinguaServiceMethodOutputImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdealinguaVisitor visitor) {
    visitor.visitServiceMethodOutput(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdealinguaVisitor) accept((IdealinguaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<IdealinguaOutput> getOutputList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, IdealinguaOutput.class);
  }

  @Override
  @Nullable
  public IdealinguaSeparatorErr getSeparatorErr() {
    return findChildByClass(IdealinguaSeparatorErr.class);
  }

  @Override
  @Nullable
  public IdealinguaSeparatorSignature getSeparatorSignature() {
    return findChildByClass(IdealinguaSeparatorSignature.class);
  }

}
