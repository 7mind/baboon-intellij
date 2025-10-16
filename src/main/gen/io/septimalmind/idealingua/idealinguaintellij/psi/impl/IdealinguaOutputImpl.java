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

public class IdealinguaOutputImpl extends ASTWrapperPsiElement implements IdealinguaOutput {

  public IdealinguaOutputImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdealinguaVisitor visitor) {
    visitor.visitOutput(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdealinguaVisitor) accept((IdealinguaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdealinguaOutputAdt getOutputAdt() {
    return findChildByClass(IdealinguaOutputAdt.class);
  }

  @Override
  @Nullable
  public IdealinguaOutputSingular getOutputSingular() {
    return findChildByClass(IdealinguaOutputSingular.class);
  }

  @Override
  @Nullable
  public IdealinguaOutputStruct getOutputStruct() {
    return findChildByClass(IdealinguaOutputStruct.class);
  }

  @Override
  @Nullable
  public IdealinguaOutputVoid getOutputVoid() {
    return findChildByClass(IdealinguaOutputVoid.class);
  }

}
