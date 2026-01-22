package io.septimalmind.idealingua.idealinguaintellij.psi

import com.intellij.openapi.project.DumbService
import com.intellij.openapi.project.Project
import com.intellij.psi.search.GlobalSearchScope
import io.septimalmind.idealingua.idealinguaintellij.psi.stubs.IdealinguaClassNameIndex

object IdealinguaUtils {

    fun findClassNames(project: Project, key: String): List<IdealinguaClassName> {
        if (DumbService.isDumb(project)) {
            return emptyList()
        }

        val searchScope = GlobalSearchScope.projectScope(project)

        return if (key.isEmpty()) {
            IdealinguaClassNameIndex.findAllClassNames(project, searchScope).toList()
        } else {
            IdealinguaClassNameIndex.findClassNames(project, key, searchScope).toList()
        }
    }
}