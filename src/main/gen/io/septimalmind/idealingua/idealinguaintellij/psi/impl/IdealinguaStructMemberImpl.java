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

public class IdealinguaStructMemberImpl extends ASTWrapperPsiElement implements IdealinguaStructMember {

  public IdealinguaStructMemberImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdealinguaVisitor visitor) {
    visitor.visitStructMember(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdealinguaVisitor) accept((IdealinguaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdealinguaStructDef getStructDef() {
    return findChildByClass(IdealinguaStructDef.class);
  }

  @Override
  @Nullable
  public IdealinguaStructEmbedValue getStructEmbedValue() {
    return findChildByClass(IdealinguaStructEmbedValue.class);
  }

  @Override
  @Nullable
  public IdealinguaStructMinusValue getStructMinusValue() {
    return findChildByClass(IdealinguaStructMinusValue.class);
  }

  @Override
  @Nullable
  public IdealinguaStructPlusValue getStructPlusValue() {
    return findChildByClass(IdealinguaStructPlusValue.class);
  }

}
