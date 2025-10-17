package io.septimalmind.utils

object PluginUtils {
    fun getRelativePath(projectPath: String, filePath: String): String {
        val relativePath = filePath.removePrefix("$projectPath/")
        val parts = relativePath.split("/")
        return when {
            parts.size <= 1 -> parts.last()
            parts.size == 2 -> parts.joinToString("/")
            else -> {
                "../" + parts.takeLast(3).joinToString("/")
            }
        }
    }
}