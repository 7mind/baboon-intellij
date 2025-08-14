// This is a generated file. Not intended for manual editing.
package io.septimalmind.baboon.baboonintellij.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BaboonMainMember extends PsiElement {

  @Nullable
  BaboonAdt getAdt();

  @Nullable
  BaboonChoice getChoice();

  @Nullable
  BaboonContract getContract();

  @Nullable
  BaboonDto getDto();

  @Nullable
  BaboonForeign getForeign();

  @Nullable
  BaboonService getService();

}
