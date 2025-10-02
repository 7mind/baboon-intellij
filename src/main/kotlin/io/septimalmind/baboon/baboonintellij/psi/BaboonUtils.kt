package io.septimalmind.baboon.baboonintellij.psi

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.util.PsiTreeUtil
import io.septimalmind.baboon.baboonintellij.language.BaboonFileType

object BaboonUtils {
    fun findClassNames(project: Project, key: String): List<BaboonClassName> {
        val result = ArrayList<BaboonClassName>()
        val virtualFiles = FileTypeIndex.getFiles(BaboonFileType, GlobalSearchScope.allScope(project))
        for (virtualFile in virtualFiles) {
            val baboonFile = PsiManager.getInstance(project).findFile(
                virtualFile!!
            ) as BaboonFile?
            if (baboonFile != null) {
                val classNames = PsiTreeUtil.findChildrenOfType(
                    baboonFile,
                    BaboonClassName::class.java
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