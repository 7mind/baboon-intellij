// This is a generated file. Not intended for manual editing.
package io.septimalmind.idealingua.idealinguaintellij.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.septimalmind.idealingua.idealinguaintellij.psi.impl.*;

public interface IdealinguaTypes {

  IElementType ADT = new IdealinguaElementType("ADT");
  IElementType ADT_ENCLOSED = new IdealinguaElementType("ADT_ENCLOSED");
  IElementType ADT_FREE_FORM = new IdealinguaElementType("ADT_FREE_FORM");
  IElementType ADT_VALUE = new IdealinguaElementType("ADT_VALUE");
  IElementType ADT_VALUES = new IdealinguaElementType("ADT_VALUES");
  IElementType ALIAS = new IdealinguaElementType("ALIAS");
  IElementType ANY_VALUE = new IdealinguaElementType("ANY_VALUE");
  IElementType BASE_TYPE_MEMBER = new IdealinguaElementType("BASE_TYPE_MEMBER");
  IElementType BOOL_LITERAL = new IdealinguaElementType("BOOL_LITERAL");
  IElementType BUZZER = new IdealinguaElementType("BUZZER");
  IElementType BUZZER_METHOD = new IdealinguaElementType("BUZZER_METHOD");
  IElementType BUZZER_METHODS = new IdealinguaElementType("BUZZER_METHODS");
  IElementType BUZZER_METHOD_NAME = new IdealinguaElementType("BUZZER_METHOD_NAME");
  IElementType BUZZER_METHOD_OUTPUT = new IdealinguaElementType("BUZZER_METHOD_OUTPUT");
  IElementType BUZZER_METHOD_PARAM = new IdealinguaElementType("BUZZER_METHOD_PARAM");
  IElementType BUZZER_NAME = new IdealinguaElementType("BUZZER_NAME");
  IElementType CLASS_NAME = new IdealinguaElementType("CLASS_NAME");
  IElementType CLASS_TYPE = new IdealinguaElementType("CLASS_TYPE");
  IElementType CLONE = new IdealinguaElementType("CLONE");
  IElementType CONST = new IdealinguaElementType("CONST");
  IElementType CONSTANTS = new IdealinguaElementType("CONSTANTS");
  IElementType CONST_NAME = new IdealinguaElementType("CONST_NAME");
  IElementType CONST_NO_DOC = new IdealinguaElementType("CONST_NO_DOC");
  IElementType CONST_VALUE = new IdealinguaElementType("CONST_VALUE");
  IElementType CONTENT = new IdealinguaElementType("CONTENT");
  IElementType DECLARED = new IdealinguaElementType("DECLARED");
  IElementType DOMAIN = new IdealinguaElementType("DOMAIN");
  IElementType DOMAIN_NAME = new IdealinguaElementType("DOMAIN_NAME");
  IElementType DOWNSTREAM = new IdealinguaElementType("DOWNSTREAM");
  IElementType DTO = new IdealinguaElementType("DTO");
  IElementType ENUM = new IdealinguaElementType("ENUM");
  IElementType ENUM_EMBED_VALUE = new IdealinguaElementType("ENUM_EMBED_VALUE");
  IElementType ENUM_ENCLOSED = new IdealinguaElementType("ENUM_ENCLOSED");
  IElementType ENUM_FREE_FORM = new IdealinguaElementType("ENUM_FREE_FORM");
  IElementType ENUM_MINUS_VALUE = new IdealinguaElementType("ENUM_MINUS_VALUE");
  IElementType ENUM_VALUE = new IdealinguaElementType("ENUM_VALUE");
  IElementType ENUM_VALUES = new IdealinguaElementType("ENUM_VALUES");
  IElementType FLOAT_LITERAL = new IdealinguaElementType("FLOAT_LITERAL");
  IElementType FOREIGN = new IdealinguaElementType("FOREIGN");
  IElementType FOREIGN_INTERPOLATION_SYMBOL = new IdealinguaElementType("FOREIGN_INTERPOLATION_SYMBOL");
  IElementType FOREIGN_MEMBER = new IdealinguaElementType("FOREIGN_MEMBER");
  IElementType FOREIGN_TYPE = new IdealinguaElementType("FOREIGN_TYPE");
  IElementType FULL_ID = new IdealinguaElementType("FULL_ID");
  IElementType GENERIC = new IdealinguaElementType("GENERIC");
  IElementType GENERIC_ID = new IdealinguaElementType("GENERIC_ID");
  IElementType ID = new IdealinguaElementType("ID");
  IElementType IDL_IDENTIFIER = new IdealinguaElementType("IDL_IDENTIFIER");
  IElementType ID_MEMBER = new IdealinguaElementType("ID_MEMBER");
  IElementType ID_MEMBER_NAME = new IdealinguaElementType("ID_MEMBER_NAME");
  IElementType IMPORT = new IdealinguaElementType("IMPORT");
  IElementType IMPORT_MEMBER = new IdealinguaElementType("IMPORT_MEMBER");
  IElementType INCLUDE = new IdealinguaElementType("INCLUDE");
  IElementType INT_LITERAL = new IdealinguaElementType("INT_LITERAL");
  IElementType JUST_VALUE = new IdealinguaElementType("JUST_VALUE");
  IElementType LIST_DEF = new IdealinguaElementType("LIST_DEF");
  IElementType LITERAL = new IdealinguaElementType("LITERAL");
  IElementType MEMBER = new IdealinguaElementType("MEMBER");
  IElementType MIXIN = new IdealinguaElementType("MIXIN");
  IElementType NON_GENERIC_ID = new IdealinguaElementType("NON_GENERIC_ID");
  IElementType OBJ_DEF = new IdealinguaElementType("OBJ_DEF");
  IElementType OTHER_MEMBER = new IdealinguaElementType("OTHER_MEMBER");
  IElementType OUTPUT = new IdealinguaElementType("OUTPUT");
  IElementType OUTPUT_ADT = new IdealinguaElementType("OUTPUT_ADT");
  IElementType OUTPUT_SINGULAR = new IdealinguaElementType("OUTPUT_SINGULAR");
  IElementType OUTPUT_STRUCT = new IdealinguaElementType("OUTPUT_STRUCT");
  IElementType OUTPUT_STRUCT_MEMBER = new IdealinguaElementType("OUTPUT_STRUCT_MEMBER");
  IElementType OUTPUT_VOID = new IdealinguaElementType("OUTPUT_VOID");
  IElementType PACKAGE = new IdealinguaElementType("PACKAGE");
  IElementType PACKAGE_ID = new IdealinguaElementType("PACKAGE_ID");
  IElementType PACKAGE_NAME = new IdealinguaElementType("PACKAGE_NAME");
  IElementType SEPARATOR_ENUM = new IdealinguaElementType("SEPARATOR_ENUM");
  IElementType SEPARATOR_ERR = new IdealinguaElementType("SEPARATOR_ERR");
  IElementType SEPARATOR_SIGNATURE = new IdealinguaElementType("SEPARATOR_SIGNATURE");
  IElementType SEPARATOR_STRUCT = new IdealinguaElementType("SEPARATOR_STRUCT");
  IElementType SERVICE = new IdealinguaElementType("SERVICE");
  IElementType SERVICE_METHOD = new IdealinguaElementType("SERVICE_METHOD");
  IElementType SERVICE_METHODS = new IdealinguaElementType("SERVICE_METHODS");
  IElementType SERVICE_METHOD_NAME = new IdealinguaElementType("SERVICE_METHOD_NAME");
  IElementType SERVICE_METHOD_OUTPUT = new IdealinguaElementType("SERVICE_METHOD_OUTPUT");
  IElementType SERVICE_METHOD_PARAM = new IdealinguaElementType("SERVICE_METHOD_PARAM");
  IElementType SERVICE_NAME = new IdealinguaElementType("SERVICE_NAME");
  IElementType SIMPLE_STRUCT_ANY = new IdealinguaElementType("SIMPLE_STRUCT_ANY");
  IElementType SIMPLE_STRUCT_EMBED = new IdealinguaElementType("SIMPLE_STRUCT_EMBED");
  IElementType SIMPLE_STRUCT_FIELD = new IdealinguaElementType("SIMPLE_STRUCT_FIELD");
  IElementType STREAMS = new IdealinguaElementType("STREAMS");
  IElementType STREAMS_NAME = new IdealinguaElementType("STREAMS_NAME");
  IElementType STREAM_PARAM = new IdealinguaElementType("STREAM_PARAM");
  IElementType STREAM_VALUE = new IdealinguaElementType("STREAM_VALUE");
  IElementType STRING_ESCAPE = new IdealinguaElementType("STRING_ESCAPE");
  IElementType STRING_LITERAL = new IdealinguaElementType("STRING_LITERAL");
  IElementType STRUCT_DEF = new IdealinguaElementType("STRUCT_DEF");
  IElementType STRUCT_EMBED_VALUE = new IdealinguaElementType("STRUCT_EMBED_VALUE");
  IElementType STRUCT_MEMBER = new IdealinguaElementType("STRUCT_MEMBER");
  IElementType STRUCT_MINUS_VALUE = new IdealinguaElementType("STRUCT_MINUS_VALUE");
  IElementType STRUCT_NAME = new IdealinguaElementType("STRUCT_NAME");
  IElementType STRUCT_PLUS_VALUE = new IdealinguaElementType("STRUCT_PLUS_VALUE");
  IElementType TYPED_VALUE = new IdealinguaElementType("TYPED_VALUE");
  IElementType TYPE_MEMBER = new IdealinguaElementType("TYPE_MEMBER");
  IElementType UPSTREAM = new IdealinguaElementType("UPSTREAM");

  IElementType AMPERSAND = new IdealinguaTokenType("&");
  IElementType AS = new IdealinguaTokenType("AS");
  IElementType BI_TYPE = new IdealinguaTokenType("BI_TYPE");
  IElementType BLOCK_COMMENT = new IdealinguaTokenType("BLOCK_COMMENT");
  IElementType CARET = new IdealinguaTokenType("^");
  IElementType COLON = new IdealinguaTokenType(":");
  IElementType COMMA = new IdealinguaTokenType(",");
  IElementType DECIMAL = new IdealinguaTokenType("DECIMAL");
  IElementType DOC_COMMENT = new IdealinguaTokenType("DOC_COMMENT");
  IElementType DOC_LINK = new IdealinguaTokenType("DOC_LINK");
  IElementType DOLLAR = new IdealinguaTokenType("$");
  IElementType DOT = new IdealinguaTokenType(".");
  IElementType DOUBLE_RIGHT_ARROW = new IdealinguaTokenType("⇒");
  IElementType EQUAL = new IdealinguaTokenType("=");
  IElementType EXCLAMATION = new IdealinguaTokenType("!");
  IElementType FALSE = new IdealinguaTokenType("false");
  IElementType GREATER_THAN = new IdealinguaTokenType(">");
  IElementType HASH = new IdealinguaTokenType("#");
  IElementType IDENTIFIER = new IdealinguaTokenType("IDENTIFIER");
  IElementType KW_ADT = new IdealinguaTokenType("adt");
  IElementType KW_ALIAS = new IdealinguaTokenType("alias");
  IElementType KW_AS = new IdealinguaTokenType("as");
  IElementType KW_BUZZER = new IdealinguaTokenType("buzzer");
  IElementType KW_CHOICE = new IdealinguaTokenType("choice");
  IElementType KW_CLONE = new IdealinguaTokenType("clone");
  IElementType KW_CONST = new IdealinguaTokenType("const");
  IElementType KW_COPY = new IdealinguaTokenType("copy");
  IElementType KW_DATA = new IdealinguaTokenType("data");
  IElementType KW_DECLARED = new IdealinguaTokenType("declared");
  IElementType KW_DEF = new IdealinguaTokenType("def");
  IElementType KW_DOMAIN = new IdealinguaTokenType("domain");
  IElementType KW_DOWN = new IdealinguaTokenType("down");
  IElementType KW_DOWNSTREAM = new IdealinguaTokenType("downstream");
  IElementType KW_DTO = new IdealinguaTokenType("dto");
  IElementType KW_ENUM = new IdealinguaTokenType("enum");
  IElementType KW_EVENT = new IdealinguaTokenType("event");
  IElementType KW_FN = new IdealinguaTokenType("fn");
  IElementType KW_FOREIGN = new IdealinguaTokenType("foreign");
  IElementType KW_FUN = new IdealinguaTokenType("fun");
  IElementType KW_FUNC = new IdealinguaTokenType("func");
  IElementType KW_ID = new IdealinguaTokenType("id");
  IElementType KW_IMPORT = new IdealinguaTokenType("import");
  IElementType KW_INCLUDE = new IdealinguaTokenType("include");
  IElementType KW_INTERFACE = new IdealinguaTokenType("interface");
  IElementType KW_INTO = new IdealinguaTokenType("into");
  IElementType KW_LINE = new IdealinguaTokenType("line");
  IElementType KW_MIXIN = new IdealinguaTokenType("mixin");
  IElementType KW_NAMESPACE = new IdealinguaTokenType("namespace");
  IElementType KW_NEWTYPE = new IdealinguaTokenType("newtype");
  IElementType KW_OR = new IdealinguaTokenType("or");
  IElementType KW_PACKAGE = new IdealinguaTokenType("package");
  IElementType KW_PUMP = new IdealinguaTokenType("pump");
  IElementType KW_SENDER = new IdealinguaTokenType("sender");
  IElementType KW_SERVER = new IdealinguaTokenType("server");
  IElementType KW_SERVICE = new IdealinguaTokenType("service");
  IElementType KW_STREAMS = new IdealinguaTokenType("streams");
  IElementType KW_STRUCT = new IdealinguaTokenType("struct");
  IElementType KW_TOCLIENT = new IdealinguaTokenType("toclient");
  IElementType KW_TOSERVER = new IdealinguaTokenType("toserver");
  IElementType KW_TUNNEL = new IdealinguaTokenType("tunnel");
  IElementType KW_TYPE = new IdealinguaTokenType("type");
  IElementType KW_UP = new IdealinguaTokenType("up");
  IElementType KW_UPSTREAM = new IdealinguaTokenType("upstream");
  IElementType KW_USING = new IdealinguaTokenType("using");
  IElementType KW_VALUES = new IdealinguaTokenType("values");
  IElementType LBRACE = new IdealinguaTokenType("{");
  IElementType LBRACK = new IdealinguaTokenType("[");
  IElementType LEFT_RIGHT_ARROWS = new IdealinguaTokenType("⥃");
  IElementType LESS_THAN = new IdealinguaTokenType("<");
  IElementType LINE_COMMENT = new IdealinguaTokenType("LINE_COMMENT");
  IElementType LOOP_RIGHT_ARROW = new IdealinguaTokenType("↬");
  IElementType LPAREN = new IdealinguaTokenType("(");
  IElementType MINUS = new IdealinguaTokenType("-");
  IElementType NEGATIVE_DECIMAL = new IdealinguaTokenType("NEGATIVE_DECIMAL");
  IElementType NUMBER_ESCAPE = new IdealinguaTokenType("NUMBER_ESCAPE");
  IElementType PIPE = new IdealinguaTokenType("|");
  IElementType PLUS = new IdealinguaTokenType("+");
  IElementType QUESTION = new IdealinguaTokenType("?");
  IElementType QUOTE = new IdealinguaTokenType("\"");
  IElementType RBRACE = new IdealinguaTokenType("}");
  IElementType RBRACK = new IdealinguaTokenType("]");
  IElementType RPAREN = new IdealinguaTokenType(")");
  IElementType SEMICOLON = new IdealinguaTokenType(";");
  IElementType SLASH = new IdealinguaTokenType("/");
  IElementType STAR = new IdealinguaTokenType("*");
  IElementType STRING_CONTENT = new IdealinguaTokenType("STRING_CONTENT");
  IElementType SYMBOL_ESCAPE = new IdealinguaTokenType("SYMBOL_ESCAPE");
  IElementType TRIPLE_QUOTE = new IdealinguaTokenType("\"\"\"");
  IElementType TRUE = new IdealinguaTokenType("true");
  IElementType UNICODE_ESCAPE = new IdealinguaTokenType("UNICODE_ESCAPE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADT) {
        return new IdealinguaAdtImpl(node);
      }
      else if (type == ADT_ENCLOSED) {
        return new IdealinguaAdtEnclosedImpl(node);
      }
      else if (type == ADT_FREE_FORM) {
        return new IdealinguaAdtFreeFormImpl(node);
      }
      else if (type == ADT_VALUE) {
        return new IdealinguaAdtValueImpl(node);
      }
      else if (type == ADT_VALUES) {
        return new IdealinguaAdtValuesImpl(node);
      }
      else if (type == ALIAS) {
        return new IdealinguaAliasImpl(node);
      }
      else if (type == ANY_VALUE) {
        return new IdealinguaAnyValueImpl(node);
      }
      else if (type == BASE_TYPE_MEMBER) {
        return new IdealinguaBaseTypeMemberImpl(node);
      }
      else if (type == BOOL_LITERAL) {
        return new IdealinguaBoolLiteralImpl(node);
      }
      else if (type == BUZZER) {
        return new IdealinguaBuzzerImpl(node);
      }
      else if (type == BUZZER_METHOD) {
        return new IdealinguaBuzzerMethodImpl(node);
      }
      else if (type == BUZZER_METHODS) {
        return new IdealinguaBuzzerMethodsImpl(node);
      }
      else if (type == BUZZER_METHOD_NAME) {
        return new IdealinguaBuzzerMethodNameImpl(node);
      }
      else if (type == BUZZER_METHOD_OUTPUT) {
        return new IdealinguaBuzzerMethodOutputImpl(node);
      }
      else if (type == BUZZER_METHOD_PARAM) {
        return new IdealinguaBuzzerMethodParamImpl(node);
      }
      else if (type == BUZZER_NAME) {
        return new IdealinguaBuzzerNameImpl(node);
      }
      else if (type == CLASS_NAME) {
        return new IdealinguaClassNameImpl(node);
      }
      else if (type == CLASS_TYPE) {
        return new IdealinguaClassTypeImpl(node);
      }
      else if (type == CLONE) {
        return new IdealinguaCloneImpl(node);
      }
      else if (type == CONST) {
        return new IdealinguaConstImpl(node);
      }
      else if (type == CONSTANTS) {
        return new IdealinguaConstantsImpl(node);
      }
      else if (type == CONST_NAME) {
        return new IdealinguaConstNameImpl(node);
      }
      else if (type == CONST_NO_DOC) {
        return new IdealinguaConstNoDocImpl(node);
      }
      else if (type == CONST_VALUE) {
        return new IdealinguaConstValueImpl(node);
      }
      else if (type == CONTENT) {
        return new IdealinguaContentImpl(node);
      }
      else if (type == DECLARED) {
        return new IdealinguaDeclaredImpl(node);
      }
      else if (type == DOMAIN) {
        return new IdealinguaDomainImpl(node);
      }
      else if (type == DOMAIN_NAME) {
        return new IdealinguaDomainNameImpl(node);
      }
      else if (type == DOWNSTREAM) {
        return new IdealinguaDownstreamImpl(node);
      }
      else if (type == DTO) {
        return new IdealinguaDtoImpl(node);
      }
      else if (type == ENUM) {
        return new IdealinguaEnumImpl(node);
      }
      else if (type == ENUM_EMBED_VALUE) {
        return new IdealinguaEnumEmbedValueImpl(node);
      }
      else if (type == ENUM_ENCLOSED) {
        return new IdealinguaEnumEnclosedImpl(node);
      }
      else if (type == ENUM_FREE_FORM) {
        return new IdealinguaEnumFreeFormImpl(node);
      }
      else if (type == ENUM_MINUS_VALUE) {
        return new IdealinguaEnumMinusValueImpl(node);
      }
      else if (type == ENUM_VALUE) {
        return new IdealinguaEnumValueImpl(node);
      }
      else if (type == ENUM_VALUES) {
        return new IdealinguaEnumValuesImpl(node);
      }
      else if (type == FLOAT_LITERAL) {
        return new IdealinguaFloatLiteralImpl(node);
      }
      else if (type == FOREIGN) {
        return new IdealinguaForeignImpl(node);
      }
      else if (type == FOREIGN_INTERPOLATION_SYMBOL) {
        return new IdealinguaForeignInterpolationSymbolImpl(node);
      }
      else if (type == FOREIGN_MEMBER) {
        return new IdealinguaForeignMemberImpl(node);
      }
      else if (type == FOREIGN_TYPE) {
        return new IdealinguaForeignTypeImpl(node);
      }
      else if (type == FULL_ID) {
        return new IdealinguaFullIdImpl(node);
      }
      else if (type == GENERIC) {
        return new IdealinguaGenericImpl(node);
      }
      else if (type == GENERIC_ID) {
        return new IdealinguaGenericIdImpl(node);
      }
      else if (type == ID) {
        return new IdealinguaIdImpl(node);
      }
      else if (type == IDL_IDENTIFIER) {
        return new IdealinguaIdlIdentifierImpl(node);
      }
      else if (type == ID_MEMBER) {
        return new IdealinguaIdMemberImpl(node);
      }
      else if (type == ID_MEMBER_NAME) {
        return new IdealinguaIdMemberNameImpl(node);
      }
      else if (type == IMPORT) {
        return new IdealinguaImportImpl(node);
      }
      else if (type == IMPORT_MEMBER) {
        return new IdealinguaImportMemberImpl(node);
      }
      else if (type == INCLUDE) {
        return new IdealinguaIncludeImpl(node);
      }
      else if (type == INT_LITERAL) {
        return new IdealinguaIntLiteralImpl(node);
      }
      else if (type == JUST_VALUE) {
        return new IdealinguaJustValueImpl(node);
      }
      else if (type == LIST_DEF) {
        return new IdealinguaListDefImpl(node);
      }
      else if (type == LITERAL) {
        return new IdealinguaLiteralImpl(node);
      }
      else if (type == MEMBER) {
        return new IdealinguaMemberImpl(node);
      }
      else if (type == MIXIN) {
        return new IdealinguaMixinImpl(node);
      }
      else if (type == NON_GENERIC_ID) {
        return new IdealinguaNonGenericIdImpl(node);
      }
      else if (type == OBJ_DEF) {
        return new IdealinguaObjDefImpl(node);
      }
      else if (type == OTHER_MEMBER) {
        return new IdealinguaOtherMemberImpl(node);
      }
      else if (type == OUTPUT) {
        return new IdealinguaOutputImpl(node);
      }
      else if (type == OUTPUT_ADT) {
        return new IdealinguaOutputAdtImpl(node);
      }
      else if (type == OUTPUT_SINGULAR) {
        return new IdealinguaOutputSingularImpl(node);
      }
      else if (type == OUTPUT_STRUCT) {
        return new IdealinguaOutputStructImpl(node);
      }
      else if (type == OUTPUT_STRUCT_MEMBER) {
        return new IdealinguaOutputStructMemberImpl(node);
      }
      else if (type == OUTPUT_VOID) {
        return new IdealinguaOutputVoidImpl(node);
      }
      else if (type == PACKAGE) {
        return new IdealinguaPackageImpl(node);
      }
      else if (type == PACKAGE_ID) {
        return new IdealinguaPackageIdImpl(node);
      }
      else if (type == PACKAGE_NAME) {
        return new IdealinguaPackageNameImpl(node);
      }
      else if (type == SEPARATOR_ENUM) {
        return new IdealinguaSeparatorEnumImpl(node);
      }
      else if (type == SEPARATOR_ERR) {
        return new IdealinguaSeparatorErrImpl(node);
      }
      else if (type == SEPARATOR_SIGNATURE) {
        return new IdealinguaSeparatorSignatureImpl(node);
      }
      else if (type == SEPARATOR_STRUCT) {
        return new IdealinguaSeparatorStructImpl(node);
      }
      else if (type == SERVICE) {
        return new IdealinguaServiceImpl(node);
      }
      else if (type == SERVICE_METHOD) {
        return new IdealinguaServiceMethodImpl(node);
      }
      else if (type == SERVICE_METHODS) {
        return new IdealinguaServiceMethodsImpl(node);
      }
      else if (type == SERVICE_METHOD_NAME) {
        return new IdealinguaServiceMethodNameImpl(node);
      }
      else if (type == SERVICE_METHOD_OUTPUT) {
        return new IdealinguaServiceMethodOutputImpl(node);
      }
      else if (type == SERVICE_METHOD_PARAM) {
        return new IdealinguaServiceMethodParamImpl(node);
      }
      else if (type == SERVICE_NAME) {
        return new IdealinguaServiceNameImpl(node);
      }
      else if (type == SIMPLE_STRUCT_ANY) {
        return new IdealinguaSimpleStructAnyImpl(node);
      }
      else if (type == SIMPLE_STRUCT_EMBED) {
        return new IdealinguaSimpleStructEmbedImpl(node);
      }
      else if (type == SIMPLE_STRUCT_FIELD) {
        return new IdealinguaSimpleStructFieldImpl(node);
      }
      else if (type == STREAMS) {
        return new IdealinguaStreamsImpl(node);
      }
      else if (type == STREAMS_NAME) {
        return new IdealinguaStreamsNameImpl(node);
      }
      else if (type == STREAM_PARAM) {
        return new IdealinguaStreamParamImpl(node);
      }
      else if (type == STREAM_VALUE) {
        return new IdealinguaStreamValueImpl(node);
      }
      else if (type == STRING_ESCAPE) {
        return new IdealinguaStringEscapeImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new IdealinguaStringLiteralImpl(node);
      }
      else if (type == STRUCT_DEF) {
        return new IdealinguaStructDefImpl(node);
      }
      else if (type == STRUCT_EMBED_VALUE) {
        return new IdealinguaStructEmbedValueImpl(node);
      }
      else if (type == STRUCT_MEMBER) {
        return new IdealinguaStructMemberImpl(node);
      }
      else if (type == STRUCT_MINUS_VALUE) {
        return new IdealinguaStructMinusValueImpl(node);
      }
      else if (type == STRUCT_NAME) {
        return new IdealinguaStructNameImpl(node);
      }
      else if (type == STRUCT_PLUS_VALUE) {
        return new IdealinguaStructPlusValueImpl(node);
      }
      else if (type == TYPED_VALUE) {
        return new IdealinguaTypedValueImpl(node);
      }
      else if (type == TYPE_MEMBER) {
        return new IdealinguaTypeMemberImpl(node);
      }
      else if (type == UPSTREAM) {
        return new IdealinguaUpstreamImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
