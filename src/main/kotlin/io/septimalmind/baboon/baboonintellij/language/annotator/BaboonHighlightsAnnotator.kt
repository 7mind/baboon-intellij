package io.septimalmind.baboon.baboonintellij.language.annotator

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType
import io.septimalmind.baboon.baboonintellij.language.highlight.BaboonColors
import io.septimalmind.baboon.baboonintellij.psi.*

class BaboonHighlightsAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        when (element.elementType) {
            BaboonTypes.MODEL -> newAnnotation(holder, element, BaboonColors.KEYWORD)
            BaboonTypes.FIELD_NAME -> newAnnotation(holder, element, BaboonColors.PARAMETER)
            BaboonTypes.TYPE_REF -> newAnnotation(holder, element, BaboonColors.PARAMETER)
            BaboonTypes.BI_TYPE -> newAnnotation(holder, element, BaboonColors.BI_TYPE)
            BaboonTypes.DOC_COMMENT -> highlightDocCommentLinks(holder, element, BaboonColors.KEYWORD)
        }
    }

    private fun newAnnotation(
        holder: AnnotationHolder, element: PsiElement, textAttributesKey: TextAttributesKey
    ) {
        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
            .textAttributes(textAttributesKey)
            .range(element)
            .create()
    }

    private fun highlightDocCommentLinks(holder: AnnotationHolder, element: PsiElement, textAttributesKey: TextAttributesKey) {
        val linkRegex = Regex("""\[\[([^\]]+?)]]""")
        linkRegex.findAll(element.text).forEach {
            match ->
                val startOffset = element.textRange.startOffset + match.range.first + 2
                val endOffset = element.textRange.startOffset + match.range.last - 2
                holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                    .textAttributes(textAttributesKey)
                    .range(TextRange(startOffset, endOffset))
                    .create()
        }
    }
}