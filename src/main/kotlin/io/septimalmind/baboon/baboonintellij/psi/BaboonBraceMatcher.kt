package io.septimalmind.baboon.baboonintellij.psi

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType

class BaboonBraceMatcher: PairedBraceMatcher {

    private val pairs = listOf(
        BracePair(BaboonTypes.LBRACE, BaboonTypes.RBRACE, true),
        BracePair(BaboonTypes.LBRACK, BaboonTypes.RBRACK, false),
        BracePair(BaboonTypes.LPAREN, BaboonTypes.RPAREN, false)

    )

    override fun getPairs(): Array<out BracePair?> = pairs.toTypedArray()

    override fun isPairedBracesAllowedBeforeType(
        p0: IElementType,
        p1: IElementType?
    ): Boolean = true

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int {
        return openingBraceOffset
    }
}