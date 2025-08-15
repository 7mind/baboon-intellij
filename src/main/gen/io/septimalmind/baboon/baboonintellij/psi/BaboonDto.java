// This is a generated file. Not intended for manual editing.
package io.septimalmind.baboon.baboonintellij.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BaboonDto extends PsiElement {

  @Nullable
  BaboonDerived getDerived();

  @NotNull
  List<BaboonDtoMember> getDtoMemberList();

  @NotNull
  PsiElement getIdentifier();

}
