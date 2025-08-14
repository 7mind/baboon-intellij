package io.septimalmind.baboon.baboonintellij.psi

import com.intellij.psi.tree.IElementType
import io.septimalmind.baboon.baboonintellij.language.BaboonLanguage

class BaboonElementType(debugName: String) : IElementType(debugName, BaboonLanguage)