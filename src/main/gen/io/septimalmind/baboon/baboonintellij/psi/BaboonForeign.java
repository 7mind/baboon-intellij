// This is a generated file. Not intended for manual editing.
package io.septimalmind.baboon.baboonintellij.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BaboonForeign extends PsiElement {

  @NotNull
  List<BaboonForeignMember> getForeignMemberList();

  @NotNull
  PsiElement getIdentifier();

}
