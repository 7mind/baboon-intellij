package io.septimalmind.baboon.baboonintellij.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import io.septimalmind.baboon.baboonintellij.language.BaboonFileType
import io.septimalmind.baboon.baboonintellij.language.BaboonLanguage

class BaboonFile(viewProvider: FileViewProvider): PsiFileBase(viewProvider, BaboonLanguage) {
    override fun getFileType(): FileType = BaboonFileType
    override fun toString(): String = "Baboon File"
}