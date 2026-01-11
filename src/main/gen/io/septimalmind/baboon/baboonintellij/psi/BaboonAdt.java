// This is a generated file. Not intended for manual editing.
package io.septimalmind.baboon.baboonintellij.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BaboonAdt extends PsiElement {

  @NotNull
  List<BaboonAdtMember> getAdtMemberList();

  @NotNull
  BaboonClassName getClassName();

  @Nullable
  BaboonMemberMeta getMemberMeta();

}
