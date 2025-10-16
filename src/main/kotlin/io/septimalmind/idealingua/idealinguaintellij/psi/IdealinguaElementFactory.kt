package io.septimalmind.idealingua.idealinguaintellij.psi

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFileFactory
import com.intellij.psi.util.PsiTreeUtil
import io.septimalmind.idealingua.idealinguaintellij.language.IdealinguaFileType

object IdealinguaElementFactory {

    fun createClassName(project: Project, name: String): IdealinguaClassName {
        val file: IdealinguaFile = createFile(project, """data $name {}""")
        return PsiTreeUtil.findChildOfType(file, IdealinguaClassName::class.java)!!
    }

    fun createFile(project: Project, text: String): IdealinguaFile {
        val name = "dummy.model"
        return PsiFileFactory.getInstance(project).createFileFromText(name, IdealinguaFileType, text) as IdealinguaFile
    }
}