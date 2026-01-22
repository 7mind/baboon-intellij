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

public class IdealinguaOtherMemberImpl extends ASTWrapperPsiElement implements IdealinguaOtherMember {

  public IdealinguaOtherMemberImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdealinguaVisitor visitor) {
    visitor.visitOtherMember(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdealinguaVisitor) accept((IdealinguaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdealinguaBuzzer getBuzzer() {
    return PsiTreeUtil.getChildOfType(this, IdealinguaBuzzer.class);
  }

  @Override
  @Nullable
  public IdealinguaConst getConst() {
    return PsiTreeUtil.getChildOfType(this, IdealinguaConst.class);
  }

  @Override
  @Nullable
  public IdealinguaService getService() {
    return PsiTreeUtil.getChildOfType(this, IdealinguaService.class);
  }

  @Override
  @Nullable
  public IdealinguaStreams getStreams() {
    return PsiTreeUtil.getChildOfType(this, IdealinguaStreams.class);
  }

}
