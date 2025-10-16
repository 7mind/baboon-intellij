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

public class IdealinguaEnumFreeFormImpl extends ASTWrapperPsiElement implements IdealinguaEnumFreeForm {

  public IdealinguaEnumFreeFormImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdealinguaVisitor visitor) {
    visitor.visitEnumFreeForm(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdealinguaVisitor) accept((IdealinguaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<IdealinguaEnumValue> getEnumValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, IdealinguaEnumValue.class);
  }

  @Override
  @NotNull
  public List<IdealinguaSeparatorEnum> getSeparatorEnumList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, IdealinguaSeparatorEnum.class);
  }

}
