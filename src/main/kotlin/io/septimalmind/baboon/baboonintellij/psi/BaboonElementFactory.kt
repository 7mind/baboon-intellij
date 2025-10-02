package io.septimalmind.baboon.baboonintellij.psi

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFileFactory
import com.intellij.psi.util.PsiTreeUtil
import io.septimalmind.baboon.baboonintellij.language.BaboonFileType

object BaboonElementFactory {

    fun createClassName(project: Project, name: String): BaboonClassName {
        val file: BaboonFile = createFile(project, """data $name {}""")
        return PsiTreeUtil.findChildOfType(file, BaboonClassName::class.java)!!
    }

    fun createFile(project: Project, text: String): BaboonFile {
        val name = "dummy.baboon"
        return PsiFileFactory.getInstance(project).createFileFromText(name, BaboonFileType, text) as BaboonFile
    }
}