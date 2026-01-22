package io.septimalmind.baboon.baboonintellij.psi

import com.intellij.openapi.project.DumbService
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.search.GlobalSearchScopesCore
import io.septimalmind.baboon.baboonintellij.psi.stubs.BaboonClassNameIndex

object BaboonUtils {
    fun findClassNames(project: Project, elementDirectory: PsiDirectory?, key: String): List<BaboonClassName> {
        if (DumbService.isDumb(project)) {
            return emptyList()
        }

        val directoryScope = elementDirectory?.let {
            GlobalSearchScopesCore.directoryScope(project, it.virtualFile, true)
        }
        val projectScope = GlobalSearchScope.projectScope(project)
        val searchScope = directoryScope?.intersectWith(projectScope) ?: projectScope

        return if (key.isEmpty()) {
            BaboonClassNameIndex.findAllClassNames(project, searchScope).toList()
        } else {
            BaboonClassNameIndex.findClassNames(project, key, searchScope).toList()
        }
    }
}