package io.septimalmind.baboon.baboonintellij.psi.stubs

import com.intellij.psi.stubs.PsiFileStubImpl
import io.septimalmind.baboon.baboonintellij.psi.BaboonFile

class BaboonFileStub(file: BaboonFile?) : PsiFileStubImpl<BaboonFile>(file)
