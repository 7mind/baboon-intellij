package io.septimalmind.baboon.baboonintellij.psi.stubs

import com.intellij.psi.stubs.StubElement
import io.septimalmind.baboon.baboonintellij.psi.BaboonClassName

interface BaboonClassNameStub : StubElement<BaboonClassName> {
    val name: String?
}
