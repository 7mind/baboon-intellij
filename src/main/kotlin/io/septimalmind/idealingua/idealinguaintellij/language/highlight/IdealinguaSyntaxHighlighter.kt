package io.septimalmind.idealingua.idealinguaintellij.language.highlight

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import io.septimalmind.idealingua.idealinguaintellij.language.IdealinguaLexerAdapter
import io.septimalmind.idealingua.idealinguaintellij.psi.*
import io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaTypes

class IdealinguaSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = IdealinguaLexerAdapter()

    override fun getTokenHighlights(elementType: IElementType?): Array<out TextAttributesKey?> {
        return pack(ATTRIBUTES[elementType])
    }
}

val ATTRIBUTES = buildMap<IElementType, TextAttributesKey> {
    put(IdealinguaTypes.LINE_COMMENT, IdealinguaColors.LINE_COMMENT)
    put(IdealinguaTypes.BLOCK_COMMENT, IdealinguaColors.BLOCK_COMMENT)
    put(IdealinguaTypes.DOC_COMMENT, IdealinguaColors.DOC_COMMENT)
    put(IdealinguaTypes.DOC_LINK, IdealinguaColors.DOC_LINK)
    put(IdealinguaTypes.IDENTIFIER, IdealinguaColors.IDENTIFIER)

    SyntaxHighlighterBase.fillMap(this, IDEALINGUA_STRINGS, IdealinguaColors.STRING)
    SyntaxHighlighterBase.fillMap(this, IDEALINGUA_ESCAPE, IdealinguaColors.STRING_ESCAPE)
    SyntaxHighlighterBase.fillMap(this, IDEALINGUA_KEYWORDS, IdealinguaColors.KEYWORD)
    SyntaxHighlighterBase.fillMap(this, OPERATION_SIGNS, IdealinguaColors.KEYWORD)
}