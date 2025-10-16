package io.septimalmind.idealingua.idealinguaintellij.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import io.septimalmind.idealingua.idealinguaintellij.language.IdealinguaFileType
import io.septimalmind.idealingua.idealinguaintellij.language.IdealinguaLanguage

class IdealinguaFile(viewProvider: FileViewProvider): PsiFileBase(viewProvider, IdealinguaLanguage) {
    override fun getFileType(): FileType = IdealinguaFileType
    override fun toString(): String = "Idealingua File"
}