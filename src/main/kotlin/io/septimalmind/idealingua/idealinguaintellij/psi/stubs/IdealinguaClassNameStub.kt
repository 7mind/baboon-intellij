package io.septimalmind.idealingua.idealinguaintellij.psi.stubs

import com.intellij.psi.stubs.StubElement
import io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaClassName

interface IdealinguaClassNameStub : StubElement<IdealinguaClassName> {
    val name: String?
}
