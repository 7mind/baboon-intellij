package io.septimalmind.baboon.baboonintellij.language

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object BaboonFileType : LanguageFileType(BaboonLanguage) {
    private const val DEFAULT_EXTENSION = "baboon"

    override fun getName(): String = "Baboon"

    override fun getDescription(): String = "Baboon DML File"

    override fun getDefaultExtension(): String = DEFAULT_EXTENSION

    override fun getIcon(): Icon = BaboonIcon.FILE
}