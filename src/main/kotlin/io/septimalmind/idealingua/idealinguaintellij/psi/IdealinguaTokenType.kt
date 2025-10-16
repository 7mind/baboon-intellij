package io.septimalmind.idealingua.idealinguaintellij.psi

import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import io.septimalmind.idealingua.idealinguaintellij.language.IdealinguaLanguage
import io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaTypes.*

class IdealinguaTokenType(debugName: String) : IElementType(debugName, IdealinguaLanguage)

val IDEALINGUA_COMMENTS = TokenSet.create(LINE_COMMENT, BLOCK_COMMENT, DOC_COMMENT)

val IDEALINGUA_KEYWORDS = TokenSet.create(
    KW_ADT, KW_ALIAS, KW_CHOICE, KW_DATA, KW_DEF, KW_DOMAIN, KW_DTO, KW_ENUM, KW_FN, KW_FUN,
    KW_FUNC, KW_ID, KW_IMPORT, KW_INCLUDE, KW_INTERFACE, KW_MIXIN, KW_NAMESPACE, KW_PACKAGE,
    KW_SERVICE, KW_SERVER, KW_STRUCT, KW_TYPE, KW_USING, KW_FOREIGN, KW_CLONE, KW_NEWTYPE,
    KW_COPY, KW_DECLARED, KW_INTO, KW_OR, KW_BUZZER, KW_SENDER, KW_LINE, KW_EVENT, KW_STREAMS,
    KW_TUNNEL, KW_PUMP, KW_UPSTREAM, KW_UP, KW_TOSERVER, KW_DOWNSTREAM, KW_DOWN, KW_TOCLIENT,
    KW_CONST, KW_VALUES
)

val OPERATION_SIGNS = TokenSet.create(
    CARET, PLUS, MINUS, AMPERSAND
)

val IDEALINGUA_STRINGS = TokenSet.create(QUOTE, TRIPLE_QUOTE, STRING_CONTENT)
val IDEALINGUA_ESCAPE = TokenSet.create(SYMBOL_ESCAPE, UNICODE_ESCAPE, NUMBER_ESCAPE)
