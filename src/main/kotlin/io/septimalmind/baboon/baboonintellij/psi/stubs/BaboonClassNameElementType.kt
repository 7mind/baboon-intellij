package io.septimalmind.baboon.baboonintellij.psi.stubs

import com.intellij.psi.stubs.*
import io.septimalmind.baboon.baboonintellij.language.BaboonLanguage
import io.septimalmind.baboon.baboonintellij.psi.BaboonClassName
import io.septimalmind.baboon.baboonintellij.psi.impl.BaboonClassNameImpl

class BaboonClassNameElementType : IStubElementType<BaboonClassNameStub, BaboonClassName>("CLASS_NAME", BaboonLanguage) {

    override fun getExternalId(): String = "baboon.CLASS_NAME"

    override fun createStub(psi: BaboonClassName, parentStub: StubElement<*>?): BaboonClassNameStub {
        return BaboonClassNameStubImpl(parentStub, psi.name)
    }

    override fun createPsi(stub: BaboonClassNameStub): BaboonClassName {
        return BaboonClassNameImpl(stub, this)
    }

    override fun serialize(stub: BaboonClassNameStub, dataStream: StubOutputStream) {
        dataStream.writeName(stub.name)
    }

    override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<*>?): BaboonClassNameStub {
        val name = dataStream.readNameString()
        return BaboonClassNameStubImpl(parentStub, name)
    }

    override fun indexStub(stub: BaboonClassNameStub, sink: IndexSink) {
        val name = stub.name
        if (!name.isNullOrEmpty()) {
            sink.occurrence(BaboonClassNameIndex.KEY, name)
        }
    }
}
