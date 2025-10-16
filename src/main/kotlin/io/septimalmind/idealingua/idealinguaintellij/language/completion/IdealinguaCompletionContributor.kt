package io.septimalmind.idealingua.idealinguaintellij.language.completion

import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.util.ProcessingContext
import io.septimalmind.idealingua.idealinguaintellij.language.IdealinguaLanguage
import io.septimalmind.idealingua.idealinguaintellij.psi.IDEALINGUA_KEYWORDS
import io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaTypes

class IdealinguaCompletionContributor: CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement().afterLeaf(PlatformPatterns.or(
                PlatformPatterns.psiElement(IdealinguaTypes.COLON),
                PlatformPatterns.psiElement(IdealinguaTypes.LBRACK),
                PlatformPatterns.psiElement(IdealinguaTypes.COMMA)
            )),
            IdealinguaBITypesCompletionProvider()
        )

        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement().withLanguage(IdealinguaLanguage),
            IdealinguaKeywordsCompletionProvider()
        )
    }
}

class IdealinguaBITypesCompletionProvider: CompletionProvider<CompletionParameters>() {
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

class IdealinguaKeywordsCompletionProvider: CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
        params: CompletionParameters,
        context: ProcessingContext,
        resultSet: CompletionResultSet
    ) {
        val keywords = IDEALINGUA_KEYWORDS.types.map { keyword ->
            LookupElementBuilder.create(keyword.toString().lowercase())
                .withBoldness(true)
                .withTypeText("keyword", true)
        }
        resultSet.addAllElements(keywords)
    }
}