package io.septimalmind.idealingua.idealinguaintellij.psi

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
import io.septimalmind.idealingua.idealinguaintellij.language.IdealinguaLanguage
import io.septimalmind.idealingua.idealinguaintellij.language.IdealinguaLexerAdapter
import io.septimalmind.idealingua.idealinguaintellij.language.IdealinguaParser

class IdealinguaParserDefinition: ParserDefinition {
    companion object {
        val FILE_NODE_TYPE: IFileElementType = IFileElementType(IdealinguaLanguage)
    }

    override fun createLexer(project: Project?): Lexer = IdealinguaLexerAdapter()

    override fun createParser(project: Project?): PsiParser = IdealinguaParser()

    override fun getFileNodeType(): IFileElementType = FILE_NODE_TYPE

    override fun getCommentTokens(): TokenSet = IDEALINGUA_COMMENTS

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun createElement(astNode: ASTNode?): PsiElement = IdealinguaTypes.Factory.createElement(astNode)

    override fun createFile(fvp: FileViewProvider): PsiFile = IdealinguaFile(fvp)
}