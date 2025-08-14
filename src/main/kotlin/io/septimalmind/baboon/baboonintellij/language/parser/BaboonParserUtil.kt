package io.septimalmind.baboon.baboonintellij.language.parser

import com.intellij.lang.PsiBuilder
import com.intellij.lang.parser.GeneratedParserUtilBase
import io.septimalmind.baboon.baboonintellij.psi.BABOON_KEYWORDS
import io.septimalmind.baboon.baboonintellij.psi.BaboonTypes

object BaboonParserUtil: GeneratedParserUtilBase() {
    @JvmStatic
    fun remapIfKeyword(builder: PsiBuilder, level: Int): Boolean {
        val next = builder.lookAhead(1)
        if (builder.tokenType in BABOON_KEYWORDS.types && next == BaboonTypes.COLON) {
            builder.remapCurrentToken(BaboonTypes.IDENTIFIER)
            builder.advanceLexer()
            return true
        }
        return true
    }
}