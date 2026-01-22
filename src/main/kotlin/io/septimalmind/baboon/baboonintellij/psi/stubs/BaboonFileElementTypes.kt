package io.septimalmind.baboon.baboonintellij.psi.stubs

import com.intellij.psi.tree.IStubFileElementType
import io.septimalmind.baboon.baboonintellij.language.BaboonLanguage


object BaboonFileElementType {
    @JvmField
    val INSTANCE: IStubFileElementType<BaboonFileStub> = BaboonStubFileElementType()
}

class BaboonStubFileElementType : IStubFileElementType<BaboonFileStub>("BABOON_FILE", BaboonLanguage) {

    companion object {
        const val STUB_VERSION = 1
    }

    override fun getStubVersion(): Int = STUB_VERSION

    override fun getExternalId(): String = "baboon.FILE"
}
