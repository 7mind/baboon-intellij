// This is a generated file. Not intended for manual editing.
package io.septimalmind.baboon.baboonintellij.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.septimalmind.baboon.baboonintellij.psi.BaboonTypes.*;
import io.septimalmind.baboon.baboonintellij.psi.*;
import io.septimalmind.baboon.baboonintellij.psi.stubs.BaboonClassNameStub;
import com.intellij.psi.stubs.IStubElementType;

public class BaboonClassNameImpl extends BaboonClassNameMixin implements BaboonClassName {

  public BaboonClassNameImpl(@NotNull ASTNode node) {
    super(node);
  }

  public BaboonClassNameImpl(@NotNull BaboonClassNameStub stub, @NotNull IStubElementType<?, ?> type) {
    super(stub, type);
  }

  public void accept(@NotNull BaboonVisitor visitor) {
    visitor.visitClassName(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BaboonVisitor) accept((BaboonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return notNullChild(findChildByType(IDENTIFIER));
  }

}
