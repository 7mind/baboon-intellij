package io.septimalmind.idealingua.idealinguaintellij.language

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object IdealinguaFileType : LanguageFileType(IdealinguaLanguage) {
    private const val DEFAULT_EXTENSION = "model"

    override fun getName(): String = "Idealingua"

    override fun getDescription(): String = "Idealingua File"

    override fun getDefaultExtension(): String = DEFAULT_EXTENSION

    override fun getIcon(): Icon = IdealinguaIcon.FILE
}