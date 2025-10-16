package io.septimalmind.idealingua.idealinguaintellij.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaTypes;
import com.intellij.psi.TokenType;

%%

%class IdealinguaLexer
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

BI_TYPE = "bit"|"bool"|"boolean"|"byte"|"date"|"datetimel"|"datetimez"|"dbl"|"double"|"dtl"|"dtz"|"f32"|"f64"|"float"|"flt"|"i08"|"i16"|"i32"|"i64"|"int"|"int16"|"int32"|"int64"|"int8"|"list"|"long"|"map"|"opt"|"set"|"short"|"str"|"string"|"time"|"tsl"|"tsz"|"uid"|"uuid"

%%

<YYINITIAL> {
    "adt"           { return IdealinguaTypes.KW_ADT; }
    "alias"         { return IdealinguaTypes.KW_ALIAS; }
    "choice"        { return IdealinguaTypes.KW_CHOICE; }
    "data"          { return IdealinguaTypes.KW_DATA; }
    "def"           { return IdealinguaTypes.KW_DEF; }
    "domain"        { return IdealinguaTypes.KW_DOMAIN; }
    "dto"           { return IdealinguaTypes.KW_DTO; }
    "enum"          { return IdealinguaTypes.KW_ENUM; }
    "fn"            { return IdealinguaTypes.KW_FN; }
    "fun"           { return IdealinguaTypes.KW_FUN; }
    "func"          { return IdealinguaTypes.KW_FUNC; }
    "id"            { return IdealinguaTypes.KW_ID; }
    "import"        { return IdealinguaTypes.KW_IMPORT; }
    "include"       { return IdealinguaTypes.KW_INCLUDE; }
    "interface"     { return IdealinguaTypes.KW_INTERFACE; }
    "mixin"         { return IdealinguaTypes.KW_MIXIN; }
    "namespace"     { return IdealinguaTypes.KW_NAMESPACE; }
    "package"       { return IdealinguaTypes.KW_PACKAGE; }
    "service"       { return IdealinguaTypes.KW_SERVICE; }
    "server"        { return IdealinguaTypes.KW_SERVER; }
    "struct"        { return IdealinguaTypes.KW_STRUCT; }
    "type"          { return IdealinguaTypes.KW_TYPE; }
    "using"         { return IdealinguaTypes.KW_USING; }
    "as"            { return IdealinguaTypes.KW_AS; }
    "foreign"       { return IdealinguaTypes.KW_FOREIGN; }
    "clone"         { return IdealinguaTypes.KW_CLONE; }
    "newtype"       { return IdealinguaTypes.KW_NEWTYPE; }
    "copy"          { return IdealinguaTypes.KW_COPY; }
    "declared"      { return IdealinguaTypes.KW_DECLARED; }
    "into"          { return IdealinguaTypes.KW_INTO; }
    "or"            { return IdealinguaTypes.KW_OR; }
    "buzzer"        { return IdealinguaTypes.KW_BUZZER; }
    "sender"        { return IdealinguaTypes.KW_SENDER; }
    "line"          { return IdealinguaTypes.KW_LINE; }
    "event"         { return IdealinguaTypes.KW_EVENT; }
    "streams"       { return IdealinguaTypes.KW_STREAMS; }
    "tunnel"        { return IdealinguaTypes.KW_TUNNEL; }
    "pump"          { return IdealinguaTypes.KW_PUMP; }
    "upstream"      { return IdealinguaTypes.KW_UPSTREAM; }
    "up"            { return IdealinguaTypes.KW_UP; }
    "toserver"      { return IdealinguaTypes.KW_TOSERVER; }
    "downstream"    { return IdealinguaTypes.KW_DOWNSTREAM; }
    "down"          { return IdealinguaTypes.KW_DOWN; }
    "toclient"      { return IdealinguaTypes.KW_TOCLIENT; }
    "const"         { return IdealinguaTypes.KW_CONST; }
    "values"        { return IdealinguaTypes.KW_VALUES; }


   "{"           { return IdealinguaTypes.LBRACE; }
   "}"           { return IdealinguaTypes.RBRACE; }
   "("           { return IdealinguaTypes.LPAREN; }
   ")"           { return IdealinguaTypes.RPAREN; }
   "["           { return IdealinguaTypes.LBRACK; }
   "]"           { return IdealinguaTypes.RBRACK; }
   "."           { return IdealinguaTypes.DOT; }
   ","           { return IdealinguaTypes.COMMA; }
   ":"           { return IdealinguaTypes.COLON; }
   ";"           { return IdealinguaTypes.SEMICOLON; }
   "*"           { return IdealinguaTypes.STAR; }
   "/"           { return IdealinguaTypes.SLASH; }
   "^"           { return IdealinguaTypes.CARET; }
   "+"           { return IdealinguaTypes.PLUS; }
   "-"           { return IdealinguaTypes.MINUS; }
   "="           { return IdealinguaTypes.EQUAL; }
   "|"           { return IdealinguaTypes.PIPE; }
   "#"           { return IdealinguaTypes.HASH; }
   "&"           { return IdealinguaTypes.AMPERSAND; }
   "$"           { return IdealinguaTypes.DOLLAR; }
   "<"           { return IdealinguaTypes.LESS_THAN; }
   ">"           { return IdealinguaTypes.GREATER_THAN; }
   "⇒"           { return IdealinguaTypes.DOUBLE_RIGHT_ARROW; }
   "!"           { return IdealinguaTypes.EXCLAMATION; }
   "?"           { return IdealinguaTypes.QUESTION; }
   "⥃"           { return IdealinguaTypes.LEFT_RIGHT_ARROWS; }
   "↬"           { return IdealinguaTypes.LOOP_RIGHT_ARROW; }
   "true"        { return IdealinguaTypes.TRUE; }
   "false"       { return IdealinguaTypes.FALSE; }
   \"\"\"        { yybegin(IN_STRING); return IdealinguaTypes.TRIPLE_QUOTE; }
   \"            { yybegin(IN_STRING); return IdealinguaTypes.QUOTE; }

   {BI_TYPE}     { return IdealinguaTypes.BI_TYPE; }

   {DECIMAL}          { return IdealinguaTypes.DECIMAL; }
   {NEGATIVE_DECIMAL} { return IdealinguaTypes.NEGATIVE_DECIMAL; }

   {LINE_COMMENT}   { return IdealinguaTypes.LINE_COMMENT; }
   {DOC_COMMENT}    { return IdealinguaTypes.DOC_COMMENT; }
   {BLOCK_COMMENT}  { return IdealinguaTypes.BLOCK_COMMENT; }
   {IDENTIFIER}     { return IdealinguaTypes.IDENTIFIER; }
   {WHITE_SPACE}    { return TokenType.WHITE_SPACE; }
}

<IN_MODEL_NAME> {
  [A-Za-z_][A-Za-z0-9_]* { return IdealinguaTypes.IDENTIFIER; }
  "."                    { return IdealinguaTypes.DOT; }
  {NEW_LINE}             { yybegin(YYINITIAL); }
  [^]                    { }
}

<IN_STRING> {
    [^\\\"]*  { return IdealinguaTypes.STRING_CONTENT; }
    \\[btnfr'\"\\]  { return IdealinguaTypes.SYMBOL_ESCAPE; }
    \\u[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z] { return IdealinguaTypes.UNICODE_ESCAPE; }
    \\[0-9][0-9]?[0-9]?        { return IdealinguaTypes.NUMBER_ESCAPE; }
    \"\"\"      { yybegin(YYINITIAL); return IdealinguaTypes.TRIPLE_QUOTE; }
    \"          { yybegin(YYINITIAL); return IdealinguaTypes.QUOTE; }
}

[^]              { return TokenType.BAD_CHARACTER; }