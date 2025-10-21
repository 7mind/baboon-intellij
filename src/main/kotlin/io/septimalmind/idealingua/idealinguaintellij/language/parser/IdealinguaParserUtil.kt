package io.septimalmind.idealingua.idealinguaintellij.language.parser

import com.intellij.lang.PsiBuilder
import com.intellij.lang.parser.GeneratedParserUtilBase
import io.septimalmind.idealingua.idealinguaintellij.psi.IDEALINGUA_KEYWORDS
import io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaTypes

object IdealinguaParserUtil: GeneratedParserUtilBase() {
    @JvmStatic
    fun remapIfKeywordOrBiType(builder: PsiBuilder, level: Int): Boolean {
        if (builder.tokenType in IDEALINGUA_KEYWORDS.types || builder.tokenType == IdealinguaTypes.BI_TYPE) {
            builder.remapCurrentToken(IdealinguaTypes.IDENTIFIER)
            return true
        }
        return true
    }
}