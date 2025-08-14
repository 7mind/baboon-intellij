// This is a generated file. Not intended for manual editing.
package io.septimalmind.baboon.baboonintellij.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.septimalmind.baboon.baboonintellij.psi.impl.*;

public interface BaboonTypes {

  IElementType ADT = new BaboonElementType("ADT");
  IElementType ADT_IN_SERVICE = new BaboonElementType("ADT_IN_SERVICE");
  IElementType ADT_MEMBER = new BaboonElementType("ADT_MEMBER");
  IElementType CHOICE = new BaboonElementType("CHOICE");
  IElementType CHOICE_IN_SERVICE = new BaboonElementType("CHOICE_IN_SERVICE");
  IElementType CHOICE_MEMBER = new BaboonElementType("CHOICE_MEMBER");
  IElementType CONTENT = new BaboonElementType("CONTENT");
  IElementType CONTRACT = new BaboonElementType("CONTRACT");
  IElementType DTO = new BaboonElementType("DTO");
  IElementType DTO_IN_SERVICE = new BaboonElementType("DTO_IN_SERVICE");
  IElementType DTO_MEMBER = new BaboonElementType("DTO_MEMBER");
  IElementType EXTENDED_CONTRACT_DEF = new BaboonElementType("EXTENDED_CONTRACT_DEF");
  IElementType FIELD_DEF = new BaboonElementType("FIELD_DEF");
  IElementType FIELD_NAME = new BaboonElementType("FIELD_NAME");
  IElementType FOREIGN = new BaboonElementType("FOREIGN");
  IElementType FOREIGN_ATTRS = new BaboonElementType("FOREIGN_ATTRS");
  IElementType FOREIGN_MEMBER = new BaboonElementType("FOREIGN_MEMBER");
  IElementType INCLUDE = new BaboonElementType("INCLUDE");
  IElementType INTERSECTION_DEF = new BaboonElementType("INTERSECTION_DEF");
  IElementType KEY_VALUE_PAIR = new BaboonElementType("KEY_VALUE_PAIR");
  IElementType MAIN_MEMBER = new BaboonElementType("MAIN_MEMBER");
  IElementType MEMBER = new BaboonElementType("MEMBER");
  IElementType MODEL = new BaboonElementType("MODEL");
  IElementType MODEL_NAME = new BaboonElementType("MODEL_NAME");
  IElementType NAMESPACE = new BaboonElementType("NAMESPACE");
  IElementType NON_GENERIC_TYPE_REF = new BaboonElementType("NON_GENERIC_TYPE_REF");
  IElementType PARENT_DEF = new BaboonElementType("PARENT_DEF");
  IElementType SERVICE = new BaboonElementType("SERVICE");
  IElementType SERVICE_MEMBER = new BaboonElementType("SERVICE_MEMBER");
  IElementType SIGNATURE_INLINE = new BaboonElementType("SIGNATURE_INLINE");
  IElementType SIGNATURE_PART = new BaboonElementType("SIGNATURE_PART");
  IElementType SIGNATURE_STRUCT = new BaboonElementType("SIGNATURE_STRUCT");
  IElementType STRING_ESCAPE = new BaboonElementType("STRING_ESCAPE");
  IElementType STRING_LITERAL = new BaboonElementType("STRING_LITERAL");
  IElementType STRUCT_MARKER = new BaboonElementType("STRUCT_MARKER");
  IElementType TYPE_PARAMS = new BaboonElementType("TYPE_PARAMS");
  IElementType TYPE_REF = new BaboonElementType("TYPE_REF");
  IElementType UNFIELD_DEF = new BaboonElementType("UNFIELD_DEF");
  IElementType UNPARENT_DEF = new BaboonElementType("UNPARENT_DEF");
  IElementType VERSION = new BaboonElementType("VERSION");

  IElementType BI_TYPE = new BaboonTokenType("BI_TYPE");
  IElementType BLOCK_COMMENT = new BaboonTokenType("BLOCK_COMMENT");
  IElementType CARET = new BaboonTokenType("^");
  IElementType COLON = new BaboonTokenType(":");
  IElementType COMMA = new BaboonTokenType(",");
  IElementType DECIMAL = new BaboonTokenType("DECIMAL");
  IElementType DOC_COMMENT = new BaboonTokenType("DOC_COMMENT");
  IElementType DOC_LINK = new BaboonTokenType("DOC_LINK");
  IElementType DOT = new BaboonTokenType(".");
  IElementType EQUAL = new BaboonTokenType("=");
  IElementType IDENTIFIER = new BaboonTokenType("IDENTIFIER");
  IElementType KW_ADT = new BaboonTokenType("adt");
  IElementType KW_CHOICE = new BaboonTokenType("enum");
  IElementType KW_CONTRACT = new BaboonTokenType("contract");
  IElementType KW_DATA = new BaboonTokenType("data");
  IElementType KW_DEF = new BaboonTokenType("def");
  IElementType KW_ERR = new BaboonTokenType("err");
  IElementType KW_FOREIGN = new BaboonTokenType("foreign");
  IElementType KW_IN = new BaboonTokenType("in");
  IElementType KW_INCLUDE = new BaboonTokenType("include");
  IElementType KW_IS = new BaboonTokenType("is");
  IElementType KW_MODEL = new BaboonTokenType("model");
  IElementType KW_NAMESPACE = new BaboonTokenType("ns");
  IElementType KW_OUT = new BaboonTokenType("out");
  IElementType KW_ROOT = new BaboonTokenType("root");
  IElementType KW_SERVICE = new BaboonTokenType("service");
  IElementType KW_STRUCT = new BaboonTokenType("struct");
  IElementType KW_VERSION = new BaboonTokenType("version");
  IElementType KW_WITH = new BaboonTokenType("with");
  IElementType LBRACE = new BaboonTokenType("{");
  IElementType LBRACK = new BaboonTokenType("[");
  IElementType LINE_COMMENT = new BaboonTokenType("LINE_COMMENT");
  IElementType LPAREN = new BaboonTokenType("(");
  IElementType MINUS = new BaboonTokenType("-");
  IElementType NEGATIVE_DECIMAL = new BaboonTokenType("NEGATIVE_DECIMAL");
  IElementType NUMBER_ESCAPE = new BaboonTokenType("NUMBER_ESCAPE");
  IElementType PLUS = new BaboonTokenType("+");
  IElementType QUOTE = new BaboonTokenType("\"");
  IElementType RBRACE = new BaboonTokenType("}");
  IElementType RBRACK = new BaboonTokenType("]");
  IElementType RPAREN = new BaboonTokenType(")");
  IElementType SLASH = new BaboonTokenType("/");
  IElementType STAR = new BaboonTokenType("*");
  IElementType STRING_CONTENT = new BaboonTokenType("STRING_CONTENT");
  IElementType SYMBOL_ESCAPE = new BaboonTokenType("SYMBOL_ESCAPE");
  IElementType TRIPLE_QUOTE = new BaboonTokenType("\"\"\"");
  IElementType UNICODE_ESCAPE = new BaboonTokenType("UNICODE_ESCAPE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADT) {
        return new BaboonAdtImpl(node);
      }
      else if (type == ADT_IN_SERVICE) {
        return new BaboonAdtInServiceImpl(node);
      }
      else if (type == ADT_MEMBER) {
        return new BaboonAdtMemberImpl(node);
      }
      else if (type == CHOICE) {
        return new BaboonChoiceImpl(node);
      }
      else if (type == CHOICE_IN_SERVICE) {
        return new BaboonChoiceInServiceImpl(node);
      }
      else if (type == CHOICE_MEMBER) {
        return new BaboonChoiceMemberImpl(node);
      }
      else if (type == CONTENT) {
        return new BaboonContentImpl(node);
      }
      else if (type == CONTRACT) {
        return new BaboonContractImpl(node);
      }
      else if (type == DTO) {
        return new BaboonDtoImpl(node);
      }
      else if (type == DTO_IN_SERVICE) {
        return new BaboonDtoInServiceImpl(node);
      }
      else if (type == DTO_MEMBER) {
        return new BaboonDtoMemberImpl(node);
      }
      else if (type == EXTENDED_CONTRACT_DEF) {
        return new BaboonExtendedContractDefImpl(node);
      }
      else if (type == FIELD_DEF) {
        return new BaboonFieldDefImpl(node);
      }
      else if (type == FIELD_NAME) {
        return new BaboonFieldNameImpl(node);
      }
      else if (type == FOREIGN) {
        return new BaboonForeignImpl(node);
      }
      else if (type == FOREIGN_ATTRS) {
        return new BaboonForeignAttrsImpl(node);
      }
      else if (type == FOREIGN_MEMBER) {
        return new BaboonForeignMemberImpl(node);
      }
      else if (type == INCLUDE) {
        return new BaboonIncludeImpl(node);
      }
      else if (type == INTERSECTION_DEF) {
        return new BaboonIntersectionDefImpl(node);
      }
      else if (type == KEY_VALUE_PAIR) {
        return new BaboonKeyValuePairImpl(node);
      }
      else if (type == MAIN_MEMBER) {
        return new BaboonMainMemberImpl(node);
      }
      else if (type == MEMBER) {
        return new BaboonMemberImpl(node);
      }
      else if (type == MODEL) {
        return new BaboonModelImpl(node);
      }
      else if (type == MODEL_NAME) {
        return new BaboonModelNameImpl(node);
      }
      else if (type == NAMESPACE) {
        return new BaboonNamespaceImpl(node);
      }
      else if (type == NON_GENERIC_TYPE_REF) {
        return new BaboonNonGenericTypeRefImpl(node);
      }
      else if (type == PARENT_DEF) {
        return new BaboonParentDefImpl(node);
      }
      else if (type == SERVICE) {
        return new BaboonServiceImpl(node);
      }
      else if (type == SERVICE_MEMBER) {
        return new BaboonServiceMemberImpl(node);
      }
      else if (type == SIGNATURE_INLINE) {
        return new BaboonSignatureInlineImpl(node);
      }
      else if (type == SIGNATURE_PART) {
        return new BaboonSignaturePartImpl(node);
      }
      else if (type == SIGNATURE_STRUCT) {
        return new BaboonSignatureStructImpl(node);
      }
      else if (type == STRING_ESCAPE) {
        return new BaboonStringEscapeImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new BaboonStringLiteralImpl(node);
      }
      else if (type == STRUCT_MARKER) {
        return new BaboonStructMarkerImpl(node);
      }
      else if (type == TYPE_PARAMS) {
        return new BaboonTypeParamsImpl(node);
      }
      else if (type == TYPE_REF) {
        return new BaboonTypeRefImpl(node);
      }
      else if (type == UNFIELD_DEF) {
        return new BaboonUnfieldDefImpl(node);
      }
      else if (type == UNPARENT_DEF) {
        return new BaboonUnparentDefImpl(node);
      }
      else if (type == VERSION) {
        return new BaboonVersionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
