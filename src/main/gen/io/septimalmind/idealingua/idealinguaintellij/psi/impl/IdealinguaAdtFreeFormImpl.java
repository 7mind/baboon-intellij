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

public class IdealinguaAdtFreeFormImpl extends ASTWrapperPsiElement implements IdealinguaAdtFreeForm {

  public IdealinguaAdtFreeFormImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdealinguaVisitor visitor) {
    visitor.visitAdtFreeForm(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdealinguaVisitor) accept((IdealinguaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<IdealinguaAdtValue> getAdtValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, IdealinguaAdtValue.class);
  }

  @Override
  @NotNull
  public List<IdealinguaSeparatorEnum> getSeparatorEnumList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, IdealinguaSeparatorEnum.class);
  }

}
