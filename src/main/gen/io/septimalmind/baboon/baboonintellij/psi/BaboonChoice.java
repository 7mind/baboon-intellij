// This is a generated file. Not intended for manual editing.
package io.septimalmind.baboon.baboonintellij.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BaboonChoice extends PsiElement {

  @NotNull
  List<BaboonChoiceMember> getChoiceMemberList();

  @Nullable
  BaboonDerived getDerived();

  @NotNull
  PsiElement getIdentifier();

}
