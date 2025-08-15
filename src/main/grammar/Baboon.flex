package io.septimalmind.baboon.baboonintellij.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import io.septimalmind.baboon.baboonintellij.psi.BaboonTypes;
import com.intellij.psi.TokenType;

%%

%class BaboonLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

// states
%state IN_STRING
%state IN_TRIPLE_STRING
%state IN_MODEL_NAME

NEW_LINE = \r|\n|\r\n
WHITE_SPACE = {NEW_LINE} | [ \t\f]
DECIMAL = [0-9]+
NEGATIVE_DECIMAL = "-"[1-9]+
IDENTIFIER = [a-zA-Z_][a-zA-Z0-9_]*

LINE_COMMENT = "//"[^\n]*
DOC_COMMENT = "/**"([^*]|\*+[^*/])*\*+"/"
BLOCK_COMMENT = "/*"([^*]|\*+[^*/])*\*+"/"

BI_TYPE = "bit"|"i08"|"i16"|"i32"|"i64"|"u08"|"u16"|"u32"|"u64"|"f32"|"f64"|"f128"|"str"|"uid"|"tsu"|"tso"|"map"|"opt"|"lst"|"set"

%%

<YYINITIAL> {
  "data"         { return BaboonTypes.KW_DATA; }
  "struct"       { return BaboonTypes.KW_STRUCT; }
  "root"         { return BaboonTypes.KW_ROOT; }
  "model"        { yybegin(IN_MODEL_NAME); return BaboonTypes.KW_MODEL; }
  "contract"     { return BaboonTypes.KW_CONTRACT; }
  "service"      { return BaboonTypes.KW_SERVICE; }
  "enum"         { return BaboonTypes.KW_CHOICE; }
  "adt"          { return BaboonTypes.KW_ADT; }
  "foreign"      { return BaboonTypes.KW_FOREIGN; }
  "version"      { return BaboonTypes.KW_VERSION; }
  "include"      { return BaboonTypes.KW_INCLUDE; }
  "ns"           { return BaboonTypes.KW_NAMESPACE; }
  "with"         { return BaboonTypes.KW_WITH; }
  "is"           { return BaboonTypes.KW_IS; }
  "in"           { return BaboonTypes.KW_IN; }
  "out"          { return BaboonTypes.KW_OUT; }
  "err"          { return BaboonTypes.KW_ERR; }
  "def"          { return BaboonTypes.KW_DEF; }
  "derived"      { return BaboonTypes.KW_DERIVED; }
  "import"       { return BaboonTypes.KW_IMPORT; }
  "without"      { return BaboonTypes.KW_WITHOUT; }

   "{"           { return BaboonTypes.LBRACE; }
   "}"           { return BaboonTypes.RBRACE; }
   "("           { return BaboonTypes.LPAREN; }
   ")"           { return BaboonTypes.RPAREN; }
   "["           { return BaboonTypes.LBRACK; }
   "]"           { return BaboonTypes.RBRACK; }
   "."           { return BaboonTypes.DOT; }
   ","           { return BaboonTypes.COMMA; }
   ":"           { return BaboonTypes.COLON; }
   "*"           { return BaboonTypes.STAR; }
   "/"           { return BaboonTypes.SLASH; }
   "^"           { return BaboonTypes.CARET; }
   "+"           { return BaboonTypes.PLUS; }
   "-"           { return BaboonTypes.MINUS; }
   "="           { return BaboonTypes.EQUAL; }
   \"\"\"        { yybegin(IN_STRING); return BaboonTypes.TRIPLE_QUOTE; }
   \"            { yybegin(IN_STRING); return BaboonTypes.QUOTE; }

   {BI_TYPE}     { return BaboonTypes.BI_TYPE; }

   {DECIMAL}          { return BaboonTypes.DECIMAL; }
   {NEGATIVE_DECIMAL} { return BaboonTypes.NEGATIVE_DECIMAL; }

   {LINE_COMMENT}   { return BaboonTypes.LINE_COMMENT; }
   {DOC_COMMENT}    { return BaboonTypes.DOC_COMMENT; }
   {BLOCK_COMMENT}  { return BaboonTypes.BLOCK_COMMENT; }
   {IDENTIFIER}     { return BaboonTypes.IDENTIFIER; }
   {WHITE_SPACE}    { return TokenType.WHITE_SPACE; }
}

<IN_MODEL_NAME> {
  [A-Za-z_][A-Za-z0-9_]* { return BaboonTypes.IDENTIFIER; }
  "."                    { return BaboonTypes.DOT; }
  {NEW_LINE}             { yybegin(YYINITIAL); }
  [^]                    { }
}

<IN_STRING> {
    [^\\\"]*  { return BaboonTypes.STRING_CONTENT; }
    \\[btnfr'\"\\]  { return BaboonTypes.SYMBOL_ESCAPE; }
    \\u[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z] { return BaboonTypes.UNICODE_ESCAPE; }
    \\[0-9][0-9]?[0-9]?        { return BaboonTypes.NUMBER_ESCAPE; }
    \"\"\"      { yybegin(YYINITIAL); return BaboonTypes.TRIPLE_QUOTE; }
    \"          { yybegin(YYINITIAL); return BaboonTypes.QUOTE; }
}

[^]              { return TokenType.BAD_CHARACTER; }