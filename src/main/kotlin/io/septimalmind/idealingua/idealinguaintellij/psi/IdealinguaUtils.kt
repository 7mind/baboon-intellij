package io.septimalmind.idealingua.idealinguaintellij.psi

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.util.PsiTreeUtil
import io.septimalmind.idealingua.idealinguaintellij.language.IdealinguaFileType

object IdealinguaUtils {
    fun findClassNames(project: Project, key: String): List<IdealinguaClassName> {
        val result = ArrayList<IdealinguaClassName>()
        val virtualFiles = FileTypeIndex.getFiles(IdealinguaFileType, GlobalSearchScope.projectScope(project))
        for (virtualFile in virtualFiles) {
            val idealinguaFile = PsiManager.getInstance(project).findFile(
                virtualFile!!
            ) as IdealinguaFile?
            if (idealinguaFile != null) {
                val classNames = PsiTreeUtil.findChildrenOfType(
                    idealinguaFile,
                    IdealinguaClassName::class.java
                )
                for (name in classNames) {
                    if (key.isEmpty() || key == name.name) {
                        result.add(name)
                    }
                }
            }
        }
        return result
    }
}