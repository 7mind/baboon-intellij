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

public class IdealinguaServiceMethodImpl extends ASTWrapperPsiElement implements IdealinguaServiceMethod {

  public IdealinguaServiceMethodImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdealinguaVisitor visitor) {
    visitor.visitServiceMethod(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdealinguaVisitor) accept((IdealinguaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public IdealinguaServiceMethodName getServiceMethodName() {
    return findNotNullChildByClass(IdealinguaServiceMethodName.class);
  }

  @Override
  @NotNull
  public IdealinguaServiceMethodOutput getServiceMethodOutput() {
    return findNotNullChildByClass(IdealinguaServiceMethodOutput.class);
  }

  @Override
  @NotNull
  public IdealinguaServiceMethods getServiceMethods() {
    return findNotNullChildByClass(IdealinguaServiceMethods.class);
  }

}
