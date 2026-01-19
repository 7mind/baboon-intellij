package io.septimalmind.baboon.baboonintellij.psi

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.search.GlobalSearchScopesCore
import com.intellij.psi.util.PsiTreeUtil
import io.septimalmind.baboon.baboonintellij.language.BaboonFileType

object BaboonUtils {
    fun findClassNames(project: Project, elementDirectory: PsiDirectory?, key: String): List<BaboonClassName> {
        val result = ArrayList<BaboonClassName>()
        val directoryScope = elementDirectory?.let { GlobalSearchScopesCore.directoryScope(project, it.virtualFile, true) } ?: GlobalSearchScope.EMPTY_SCOPE
        val searchScope = directoryScope.intersectWith(GlobalSearchScope.projectScope(project))
        val virtualFiles = FileTypeIndex.getFiles(BaboonFileType, searchScope)
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