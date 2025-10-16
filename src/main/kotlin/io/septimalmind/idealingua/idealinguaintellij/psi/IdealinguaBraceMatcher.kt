package io.septimalmind.idealingua.idealinguaintellij.psi

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType

class IdealinguaBraceMatcher: PairedBraceMatcher {

    private val pairs = listOf(
        BracePair(IdealinguaTypes.LBRACE, IdealinguaTypes.RBRACE, true),
        BracePair(IdealinguaTypes.LBRACK, IdealinguaTypes.RBRACK, false),
        BracePair(IdealinguaTypes.LPAREN, IdealinguaTypes.RPAREN, false)

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