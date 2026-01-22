package io.septimalmind.baboon.baboonintellij.psi.stubs

import com.intellij.openapi.project.Project
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.stubs.StringStubIndexExtension
import com.intellij.psi.stubs.StubIndex
import com.intellij.psi.stubs.StubIndexKey
import io.septimalmind.baboon.baboonintellij.psi.BaboonClassName

class BaboonClassNameIndex : StringStubIndexExtension<BaboonClassName>() {

    companion object {
        @JvmField
        val KEY: StubIndexKey<String, BaboonClassName> =
            StubIndexKey.createIndexKey("baboon.className")

        fun findClassNames(
            project: Project,
            name: String,
            scope: GlobalSearchScope
        ): Collection<BaboonClassName> {
            return StubIndex.getElements(KEY, name, project, scope, BaboonClassName::class.java)
        }

        fun findAllClassNames(
            project: Project,
            scope: GlobalSearchScope
        ): Collection<BaboonClassName> {
            val result = mutableListOf<BaboonClassName>()
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

    override fun getKey(): StubIndexKey<String, BaboonClassName> = KEY
}
