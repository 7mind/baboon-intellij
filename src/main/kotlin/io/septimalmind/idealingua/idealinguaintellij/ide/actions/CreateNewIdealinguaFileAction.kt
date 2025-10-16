package io.septimalmind.idealingua.idealinguaintellij.ide.actions

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.NlsContexts
import com.intellij.psi.PsiDirectory
import io.septimalmind.idealingua.idealinguaintellij.language.IdealinguaIcon
import org.jetbrains.annotations.NonNls

class CreateNewIdealinguaFileAction: CreateFileFromTemplateAction("IdeaLingua file", "", IdealinguaIcon.FILE) {
    override fun buildDialog(
        project: Project,
        directory: PsiDirectory,
        builder: CreateFileFromTemplateDialog.Builder
    ) {
        builder.setTitle("New IdeaLingua File")
            .addKind("IdeaLingua Domain File", null, "IdeaLingua Domain File")
            .addKind("IdeaLingua Model File", null, "IdeaLingua Model File")
    }

    override fun getActionName(
        directory: PsiDirectory?,
        newName: @NonNls String,
        templateName: @NonNls String?
    ): @NlsContexts.Command String? = "Create IdeaLingua file"

}