package io.septimalmind.idealingua.idealinguaintellij.language.highlight

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey

object IdealinguaColors {
    val LINE_COMMENT = createTextAttributesKey("IDEALINGUA_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
    val BLOCK_COMMENT = createTextAttributesKey("IDEALINGUA_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)
    val DOC_COMMENT = createTextAttributesKey("IDEALINGUA_DOC_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT)
    val DOC_LINK = createTextAttributesKey("IDEALINGUA_DOC_LINK", DefaultLanguageHighlighterColors.DOC_COMMENT_MARKUP)
    val KEYWORD = createTextAttributesKey("IDEALINGUA_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
    val STRING = createTextAttributesKey("IDEALINGUA_STRING", DefaultLanguageHighlighterColors.STRING)
    val STRING_ESCAPE = createTextAttributesKey("IDEALINGUA_STRING_ESCAPE", DefaultLanguageHighlighterColors.VALID_STRING_ESCAPE)
    val IDENTIFIER = createTextAttributesKey("IDEALINGUA_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)
    val PARAMETER = createTextAttributesKey("IDEALINGUA_PARAMETER", DefaultLanguageHighlighterColors.PARAMETER)
    val BI_TYPE = createTextAttributesKey("IDEALINGUA_BI_TYPE", DefaultLanguageHighlighterColors.CLASS_REFERENCE)
    val CLASS_NAME = createTextAttributesKey("IDEALINGUA_CLASS_NAME", DefaultLanguageHighlighterColors.CLASS_REFERENCE)
    val STRUCT_NAME = createTextAttributesKey("IDEALINGUA_STRUCT_NAME", DefaultLanguageHighlighterColors.INSTANCE_FIELD)
}