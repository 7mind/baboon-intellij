package io.septimalmind.idealingua.idealinguaintellij.language

import com.intellij.lexer.FlexAdapter

class IdealinguaLexerAdapter: FlexAdapter(IdealinguaLexer(null)) {
}