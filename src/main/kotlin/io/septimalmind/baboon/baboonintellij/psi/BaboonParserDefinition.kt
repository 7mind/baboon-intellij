package io.septimalmind.baboon.baboonintellij.psi

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import io.septimalmind.baboon.baboonintellij.language.BaboonLanguage
import io.septimalmind.baboon.baboonintellij.language.BaboonLexerAdapter
import io.septimalmind.baboon.baboonintellij.language.BaboonParser

class BaboonParserDefinition: ParserDefinition {
    companion object {
        val FILE_NODE_TYPE: IFileElementType = IFileElementType(BaboonLanguage)
    }

    override fun createLexer(project: Project?): Lexer = BaboonLexerAdapter()

    override fun createParser(project: Project?): PsiParser = BaboonParser()

    override fun getFileNodeType(): IFileElementType = FILE_NODE_TYPE

    override fun getCommentTokens(): TokenSet = BABOON_COMMENTS

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun createElement(astNode: ASTNode?): PsiElement = BaboonTypes.Factory.createElement(astNode)

    override fun createFile(fvp: FileViewProvider): PsiFile = BaboonFile(fvp)
}