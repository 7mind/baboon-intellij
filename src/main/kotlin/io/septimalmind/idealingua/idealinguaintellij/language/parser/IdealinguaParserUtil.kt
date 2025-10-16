package io.septimalmind.idealingua.idealinguaintellij.language.parser

import com.intellij.lang.PsiBuilder
import com.intellij.lang.parser.GeneratedParserUtilBase
import io.septimalmind.idealingua.idealinguaintellij.psi.IDEALINGUA_KEYWORDS
import io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaTypes

object IdealinguaParserUtil: GeneratedParserUtilBase() {
    @JvmStatic
    fun remapIfKeyword(builder: PsiBuilder, level: Int): Boolean {
        val next = builder.lookAhead(1)
        if (builder.tokenType in IDEALINGUA_KEYWORDS.types && listOf(IdealinguaTypes.COLON, IdealinguaTypes.LPAREN, IdealinguaTypes.LBRACE).contains(next)) {
            builder.remapCurrentToken(IdealinguaTypes.IDENTIFIER)
            return true
        }
        return true
    }
}