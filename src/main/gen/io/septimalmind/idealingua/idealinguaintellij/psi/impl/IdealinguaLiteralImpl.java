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

public class IdealinguaLiteralImpl extends ASTWrapperPsiElement implements IdealinguaLiteral {

  public IdealinguaLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdealinguaVisitor visitor) {
    visitor.visitLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdealinguaVisitor) accept((IdealinguaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdealinguaBoolLiteral getBoolLiteral() {
    return findChildByClass(IdealinguaBoolLiteral.class);
  }

  @Override
  @Nullable
  public IdealinguaFloatLiteral getFloatLiteral() {
    return findChildByClass(IdealinguaFloatLiteral.class);
  }

  @Override
  @Nullable
  public IdealinguaIntLiteral getIntLiteral() {
    return findChildByClass(IdealinguaIntLiteral.class);
  }

  @Override
  @Nullable
  public IdealinguaStringLiteral getStringLiteral() {
    return findChildByClass(IdealinguaStringLiteral.class);
  }

}
