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

public class IdealinguaStructMembersImpl extends ASTWrapperPsiElement implements IdealinguaStructMembers {

  public IdealinguaStructMembersImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdealinguaVisitor visitor) {
    visitor.visitStructMembers(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdealinguaVisitor) accept((IdealinguaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<IdealinguaSeparatorStruct> getSeparatorStructList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, IdealinguaSeparatorStruct.class);
  }

  @Override
  @NotNull
  public List<IdealinguaStructMember> getStructMemberList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, IdealinguaStructMember.class);
  }

}
