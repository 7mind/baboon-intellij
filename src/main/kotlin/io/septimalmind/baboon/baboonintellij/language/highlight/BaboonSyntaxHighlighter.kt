package io.septimalmind.baboon.baboonintellij.language.highlight

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import io.septimalmind.baboon.baboonintellij.language.BaboonLexerAdapter
import io.septimalmind.baboon.baboonintellij.psi.*
import io.septimalmind.baboon.baboonintellij.psi.BaboonTypes

class BaboonSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = BaboonLexerAdapter()

    override fun getTokenHighlights(elementType: IElementType?): Array<out TextAttributesKey?> {
        return pack(ATTRIBUTES[elementType])
    }
}

val ATTRIBUTES = buildMap<IElementType, TextAttributesKey> {
    put(BaboonTypes.LINE_COMMENT, BaboonColors.LINE_COMMENT)
    put(BaboonTypes.BLOCK_COMMENT, BaboonColors.BLOCK_COMMENT)
    put(BaboonTypes.DOC_COMMENT, BaboonColors.DOC_COMMENT)
    put(BaboonTypes.DOC_LINK, BaboonColors.DOC_LINK)
    put(BaboonTypes.MODEL, BaboonColors.KEYWORD)
    put(BaboonTypes.IDENTIFIER, BaboonColors.IDENTIFIER)

    SyntaxHighlighterBase.fillMap(this, BABOON_STRINGS, BaboonColors.STRING)
    SyntaxHighlighterBase.fillMap(this, BABOON_ESCAPE, BaboonColors.STRING_ESCAPE)
    SyntaxHighlighterBase.fillMap(this, BABOON_KEYWORDS, BaboonColors.KEYWORD)
    SyntaxHighlighterBase.fillMap(this, OPERATION_SIGNS, BaboonColors.KEYWORD)
}