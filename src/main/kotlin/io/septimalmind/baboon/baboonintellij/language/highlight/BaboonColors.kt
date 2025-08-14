package io.septimalmind.baboon.baboonintellij.language.highlight

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey

object BaboonColors {
    val LINE_COMMENT = createTextAttributesKey("BABOON_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
    val BLOCK_COMMENT = createTextAttributesKey("BABOON_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)
    val DOC_COMMENT = createTextAttributesKey("BABOON_DOC_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT)
    val DOC_LINK = createTextAttributesKey("BABOON_DOC_LINK", DefaultLanguageHighlighterColors.DOC_COMMENT_MARKUP)
    val KEYWORD = createTextAttributesKey("BABOON_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
    val STRING = createTextAttributesKey("BABOON_STRING", DefaultLanguageHighlighterColors.STRING)
    val STRING_ESCAPE = createTextAttributesKey("BABOON_STRING_ESCAPE", DefaultLanguageHighlighterColors.VALID_STRING_ESCAPE)
    val IDENTIFIER = createTextAttributesKey("BABOON_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)
    val PARAMETER = createTextAttributesKey("BABOON_PARAMETER", DefaultLanguageHighlighterColors.PARAMETER)
    val BI_TYPE = createTextAttributesKey("BABOON_BI_TYPE", DefaultLanguageHighlighterColors.CONSTANT)
}