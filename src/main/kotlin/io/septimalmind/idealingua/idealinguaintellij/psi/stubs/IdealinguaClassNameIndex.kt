package io.septimalmind.idealingua.idealinguaintellij.psi.stubs

import com.intellij.openapi.project.Project
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.stubs.StringStubIndexExtension
import com.intellij.psi.stubs.StubIndex
import com.intellij.psi.stubs.StubIndexKey
import io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaClassName

class IdealinguaClassNameIndex : StringStubIndexExtension<IdealinguaClassName>() {

    companion object {
        @JvmField
        val KEY: StubIndexKey<String, IdealinguaClassName> =
            StubIndexKey.createIndexKey("idealingua.className")

        fun findClassNames(
            project: Project,
            name: String,
            scope: GlobalSearchScope
        ): Collection<IdealinguaClassName> {
            return StubIndex.getElements(KEY, name, project, scope, IdealinguaClassName::class.java)
        }

        fun findAllClassNames(
            project: Project,
            scope: GlobalSearchScope
        ): Collection<IdealinguaClassName> {
            val result = mutableListOf<IdealinguaClassName>()
            StubIndex.getInstance().processAllKeys(KEY, project) { name ->
                result.addAll(findClassNames(project, name, scope))
                true
            }
            return result
        }

        fun getAllKeys(project: Project): Collection<String> {
            return StubIndex.getInstance().getAllKeys(KEY, project)
        }
    }

    override fun getKey(): StubIndexKey<String, IdealinguaClassName> = KEY
}
