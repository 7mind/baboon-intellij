package io.septimalmind.idealingua.idealinguaintellij.language.annotator

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import io.septimalmind.idealingua.idealinguaintellij.language.highlight.IdealinguaColors
import io.septimalmind.idealingua.idealinguaintellij.psi.*

class IdealinguaHighlightsAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        val elementType = element.node?.elementType ?: return
        when (elementType) {
            IdealinguaTypes.CLASS_NAME -> newAnnotation(holder, element, IdealinguaColors.CLASS_NAME)
            IdealinguaTypes.STRUCT_NAME -> newAnnotation(holder, element, IdealinguaColors.STRUCT_NAME)
            IdealinguaTypes.GENERIC_ID -> newAnnotation(holder, element, IdealinguaColors.PARAMETER)
            IdealinguaTypes.BI_TYPE -> newAnnotation(holder, element, IdealinguaColors.BI_TYPE)
            IdealinguaTypes.FOREIGN_TYPE -> newAnnotation(holder, element, IdealinguaColors.STRING)
            IdealinguaTypes.PACKAGE_NAME -> newAnnotation(holder, element, IdealinguaColors.IDENTIFIER)
            IdealinguaTypes.ADT_ALIAS -> newAnnotation(holder, element, IdealinguaColors.IDENTIFIER)
            IdealinguaTypes.DOC_COMMENT -> highlightDocCommentLinks(holder, element, IdealinguaColors.KEYWORD)
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