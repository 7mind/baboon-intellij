package io.septimalmind.baboon.baboonintellij.ide.actions

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.NlsContexts
import com.intellij.psi.PsiDirectory
import io.septimalmind.baboon.baboonintellij.language.BaboonIcon
import org.jetbrains.annotations.NonNls

class CreateNewBaboonFileAction: CreateFileFromTemplateAction("Baboon file", "", BaboonIcon.FILE) {
    override fun buildDialog(
        project: Project,
        directory: PsiDirectory,
        builder: CreateFileFromTemplateDialog.Builder
    ) {
        builder.setTitle("New Baboon File")
            .addKind("Baboon File", null, "Baboon File")
            .addKind("Baboon Model File", null, "Baboon Model File")
    }

    override fun getActionName(
        directory: PsiDirectory?,
        newName: @NonNls String,
        templateName: @NonNls String?
    ): @NlsContexts.Command String? = "Create Baboon file"

}