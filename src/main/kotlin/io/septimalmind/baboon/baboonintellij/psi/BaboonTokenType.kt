package io.septimalmind.baboon.baboonintellij.psi

import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import io.septimalmind.baboon.baboonintellij.language.BaboonLanguage
import io.septimalmind.baboon.baboonintellij.psi.BaboonTypes.*

class BaboonTokenType(debugName: String) : IElementType(debugName, BaboonLanguage)

val BABOON_COMMENTS = TokenSet.create(LINE_COMMENT, BLOCK_COMMENT, DOC_COMMENT)

val BABOON_KEYWORDS = TokenSet.create(
    KW_DATA, KW_STRUCT, KW_ROOT, KW_MODEL, KW_CONTRACT, KW_SERVICE, KW_CHOICE,
    KW_ADT, KW_FOREIGN, KW_VERSION, KW_INCLUDE, KW_NAMESPACE, KW_WITH,
    KW_IS, KW_IN, KW_OUT, KW_ERR, KW_DEF, KW_DERIVED, KW_IMPORT, KW_WITHOUT,
    KW_WAS
)

val OPERATION_SIGNS = TokenSet.create(
    CARET, PLUS, MINUS
)

val BABOON_STRINGS = TokenSet.create(QUOTE, TRIPLE_QUOTE, STRING_CONTENT)
val BABOON_ESCAPE = TokenSet.create(SYMBOL_ESCAPE, UNICODE_ESCAPE, NUMBER_ESCAPE)