package io.septimalmind.idealingua.idealinguaintellij.psi.stubs

import com.intellij.psi.stubs.*
import io.septimalmind.idealingua.idealinguaintellij.language.IdealinguaLanguage
import io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaClassName
import io.septimalmind.idealingua.idealinguaintellij.psi.impl.IdealinguaClassNameImpl

class IdealinguaClassNameElementType : IStubElementType<IdealinguaClassNameStub, IdealinguaClassName>("CLASS_NAME", IdealinguaLanguage) {

    override fun getExternalId(): String = "idealingua.CLASS_NAME"

    override fun createStub(psi: IdealinguaClassName, parentStub: StubElement<*>?): IdealinguaClassNameStub {
        return IdealinguaClassNameStubImpl(parentStub, psi.name)
    }

    override fun createPsi(stub: IdealinguaClassNameStub): IdealinguaClassName {
        return IdealinguaClassNameImpl(stub, this)
    }

    override fun serialize(stub: IdealinguaClassNameStub, dataStream: StubOutputStream) {
        dataStream.writeName(stub.name)
    }

    override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<*>?): IdealinguaClassNameStub {
        val name = dataStream.readNameString()
        return IdealinguaClassNameStubImpl(parentStub, name)
    }

    override fun indexStub(stub: IdealinguaClassNameStub, sink: IndexSink) {
        val name = stub.name
        if (!name.isNullOrEmpty()) {
            sink.occurrence(IdealinguaClassNameIndex.KEY, name)
        }
    }
}
