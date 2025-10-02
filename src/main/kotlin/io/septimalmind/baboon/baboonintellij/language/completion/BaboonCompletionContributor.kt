package io.septimalmind.baboon.baboonintellij.language.completion

import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.util.ProcessingContext
import io.septimalmind.baboon.baboonintellij.language.BaboonLanguage
import io.septimalmind.baboon.baboonintellij.psi.BABOON_KEYWORDS
import io.septimalmind.baboon.baboonintellij.psi.BaboonTypes

class BaboonCompletionContributor: CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement().afterLeaf(PlatformPatterns.or(
                PlatformPatterns.psiElement(BaboonTypes.COLON),
                PlatformPatterns.psiElement(BaboonTypes.LBRACK),
                PlatformPatterns.psiElement(BaboonTypes.COMMA)
            )),
            BaboonBITypesCompletionProvider()
        )

        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement().withLanguage(BaboonLanguage),
            BaboonKeywordsCompletionProvider()
        )
    }
}

class BaboonBITypesCompletionProvider: CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
        params: CompletionParameters,
        context: ProcessingContext,
        resultSet: CompletionResultSet
    ) {
        val biTypes = listOf(
            "bit", "i08", "i16", "i32", "i64", "u08", "u16", "u32", "u64", "f32",
            "f64", "f128", "str", "uid", "tsu", "tso", "map", "opt", "lst", "set"
        )
        resultSet.addAllElements(biTypes.map { t ->
            PrioritizedLookupElement.withPriority(
            LookupElementBuilder.create(t)
                .withTypeText("type", true),
                10.0
            )
        })
    }
}

class BaboonKeywordsCompletionProvider: CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
        params: CompletionParameters,
        context: ProcessingContext,
        resultSet: CompletionResultSet
    ) {
        val keywords = BABOON_KEYWORDS.types.map { keyword ->
            LookupElementBuilder.create(keyword.toString().lowercase())
                .withBoldness(true)
                .withTypeText("keyword", true)
        }
        resultSet.addAllElements(keywords)
    }
}