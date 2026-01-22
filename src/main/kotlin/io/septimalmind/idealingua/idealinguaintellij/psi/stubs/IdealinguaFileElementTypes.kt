package io.septimalmind.idealingua.idealinguaintellij.psi.stubs

import com.intellij.psi.tree.IStubFileElementType
import io.septimalmind.idealingua.idealinguaintellij.language.IdealinguaLanguage


object IdealinguaFileElementType {
    @JvmField
    val INSTANCE: IStubFileElementType<IdealinguaFileStub> = IdealinguaStubFileElementType()
}

class IdealinguaStubFileElementType : IStubFileElementType<IdealinguaFileStub>("IDEALINGUA_FILE", IdealinguaLanguage) {

    companion object {
        const val STUB_VERSION = 1
    }

    override fun getStubVersion(): Int = STUB_VERSION

    override fun getExternalId(): String = "idealingua.FILE"
}
