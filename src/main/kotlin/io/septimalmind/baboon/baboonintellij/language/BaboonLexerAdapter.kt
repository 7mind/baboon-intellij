package io.septimalmind.baboon.baboonintellij.language

import com.intellij.lexer.FlexAdapter

class BaboonLexerAdapter: FlexAdapter(BaboonLexer(null)) {
}