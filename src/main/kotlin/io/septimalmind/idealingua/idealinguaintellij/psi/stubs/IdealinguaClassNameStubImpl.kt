package io.septimalmind.idealingua.idealinguaintellij.psi.stubs

import com.intellij.psi.stubs.StubBase
import com.intellij.psi.stubs.StubElement
import io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaClassName

class IdealinguaClassNameStubImpl(
    parent: StubElement<*>?,
    override val name: String?
) : StubBase<IdealinguaClassName>(parent, IdealinguaStubElementTypes.CLASS_NAME), IdealinguaClassNameStub
