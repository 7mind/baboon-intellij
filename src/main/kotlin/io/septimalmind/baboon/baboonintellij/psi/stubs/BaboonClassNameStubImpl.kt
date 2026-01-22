package io.septimalmind.baboon.baboonintellij.psi.stubs

import com.intellij.psi.stubs.StubBase
import com.intellij.psi.stubs.StubElement
import io.septimalmind.baboon.baboonintellij.psi.BaboonClassName

class BaboonClassNameStubImpl(
    parent: StubElement<*>?,
    override val name: String?
) : StubBase<BaboonClassName>(parent, BaboonStubElementTypes.CLASS_NAME), BaboonClassNameStub
