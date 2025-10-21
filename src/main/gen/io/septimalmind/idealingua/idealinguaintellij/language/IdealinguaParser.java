// This is a generated file. Not intended for manual editing.
package io.septimalmind.idealingua.idealinguaintellij.language;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static io.septimalmind.idealingua.idealinguaintellij.psi.IdealinguaTypes.*;
import static io.septimalmind.idealingua.idealinguaintellij.language.parser.IdealinguaParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class IdealinguaParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return file(b, l + 1);
  }

  /* ********************************************************** */
  // (KW_ADT | KW_CHOICE) class_name (adt_free_form | adt_enclosed)
  public static boolean adt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt")) return false;
    if (!nextTokenIs(b, "<adt>", KW_ADT, KW_CHOICE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADT, "<adt>");
    r = adt_0(b, l + 1);
    r = r && class_name(b, l + 1);
    r = r && adt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_ADT | KW_CHOICE
  private static boolean adt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_0")) return false;
    boolean r;
    r = consumeToken(b, KW_ADT);
    if (!r) r = consumeToken(b, KW_CHOICE);
    return r;
  }

  // adt_free_form | adt_enclosed
  private static boolean adt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_2")) return false;
    boolean r;
    r = adt_free_form(b, l + 1);
    if (!r) r = adt_enclosed(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // <<remapIfKeywordOrBiType>> IDENTIFIER
  public static boolean adt_alias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_alias")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADT_ALIAS, "<adt alias>");
    r = remapIfKeywordOrBiType(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACE adt_values RBRACE | LPAREN adt_values RPAREN
  public static boolean adt_enclosed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_enclosed")) return false;
    if (!nextTokenIs(b, "<adt enclosed>", LBRACE, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADT_ENCLOSED, "<adt enclosed>");
    r = adt_enclosed_0(b, l + 1);
    if (!r) r = adt_enclosed_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LBRACE adt_values RBRACE
  private static boolean adt_enclosed_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_enclosed_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && adt_values(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN adt_values RPAREN
  private static boolean adt_enclosed_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_enclosed_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && adt_values(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EQUAL separator_enum? adt_value (separator_enum adt_value)*
  public static boolean adt_free_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_free_form")) return false;
    if (!nextTokenIs(b, EQUAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUAL);
    r = r && adt_free_form_1(b, l + 1);
    r = r && adt_value(b, l + 1);
    r = r && adt_free_form_3(b, l + 1);
    exit_section_(b, m, ADT_FREE_FORM, r);
    return r;
  }

  // separator_enum?
  private static boolean adt_free_form_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_free_form_1")) return false;
    separator_enum(b, l + 1);
    return true;
  }

  // (separator_enum adt_value)*
  private static boolean adt_free_form_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_free_form_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!adt_free_form_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "adt_free_form_3", c)) break;
    }
    return true;
  }

  // separator_enum adt_value
  private static boolean adt_free_form_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_free_form_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = separator_enum(b, l + 1);
    r = r && adt_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // class_type (KW_AS adt_alias)?
  public static boolean adt_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_value")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_type(b, l + 1);
    r = r && adt_value_1(b, l + 1);
    exit_section_(b, m, ADT_VALUE, r);
    return r;
  }

  // (KW_AS adt_alias)?
  private static boolean adt_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_value_1")) return false;
    adt_value_1_0(b, l + 1);
    return true;
  }

  // KW_AS adt_alias
  private static boolean adt_value_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_value_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_AS);
    r = r && adt_alias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // adt_value? (separator_enum? adt_value)* separator_enum?
  public static boolean adt_values(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_values")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADT_VALUES, "<adt values>");
    r = adt_values_0(b, l + 1);
    r = r && adt_values_1(b, l + 1);
    r = r && adt_values_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // adt_value?
  private static boolean adt_values_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_values_0")) return false;
    adt_value(b, l + 1);
    return true;
  }

  // (separator_enum? adt_value)*
  private static boolean adt_values_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_values_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!adt_values_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "adt_values_1", c)) break;
    }
    return true;
  }

  // separator_enum? adt_value
  private static boolean adt_values_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_values_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = adt_values_1_0_0(b, l + 1);
    r = r && adt_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // separator_enum?
  private static boolean adt_values_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_values_1_0_0")) return false;
    separator_enum(b, l + 1);
    return true;
  }

  // separator_enum?
  private static boolean adt_values_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_values_2")) return false;
    separator_enum(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (KW_ALIAS | KW_TYPE | KW_USING) class_name EQUAL idl_identifier
  public static boolean alias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALIAS, "<alias>");
    r = alias_0(b, l + 1);
    r = r && class_name(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && idl_identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_ALIAS | KW_TYPE | KW_USING
  private static boolean alias_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_0")) return false;
    boolean r;
    r = consumeToken(b, KW_ALIAS);
    if (!r) r = consumeToken(b, KW_TYPE);
    if (!r) r = consumeToken(b, KW_USING);
    return r;
  }

  /* ********************************************************** */
  // typed_value | just_value
  public static boolean any_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANY_VALUE, "<any value>");
    r = typed_value(b, l + 1);
    if (!r) r = just_value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // enum | adt | alias | id | mixin | dto
  public static boolean base_type_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_type_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASE_TYPE_MEMBER, "<base type member>");
    r = enum_$(b, l + 1);
    if (!r) r = adt(b, l + 1);
    if (!r) r = alias(b, l + 1);
    if (!r) r = id(b, l + 1);
    if (!r) r = mixin(b, l + 1);
    if (!r) r = dto(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TRUE | FALSE
  public static boolean bool_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bool_literal")) return false;
    if (!nextTokenIs(b, "<bool literal>", FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOL_LITERAL, "<bool literal>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (KW_BUZZER | KW_SENDER) buzzer_name (LBRACE buzzer_method* RBRACE | LPAREN buzzer_method* RPAREN)
  public static boolean buzzer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer")) return false;
    if (!nextTokenIs(b, "<buzzer>", KW_BUZZER, KW_SENDER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUZZER, "<buzzer>");
    r = buzzer_0(b, l + 1);
    r = r && buzzer_name(b, l + 1);
    r = r && buzzer_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_BUZZER | KW_SENDER
  private static boolean buzzer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_0")) return false;
    boolean r;
    r = consumeToken(b, KW_BUZZER);
    if (!r) r = consumeToken(b, KW_SENDER);
    return r;
  }

  // LBRACE buzzer_method* RBRACE | LPAREN buzzer_method* RPAREN
  private static boolean buzzer_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = buzzer_2_0(b, l + 1);
    if (!r) r = buzzer_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE buzzer_method* RBRACE
  private static boolean buzzer_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && buzzer_2_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // buzzer_method*
  private static boolean buzzer_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!buzzer_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "buzzer_2_0_1", c)) break;
    }
    return true;
  }

  // LPAREN buzzer_method* RPAREN
  private static boolean buzzer_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && buzzer_2_1_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // buzzer_method*
  private static boolean buzzer_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!buzzer_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "buzzer_2_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (KW_LINE | KW_EVENT) buzzer_method_name (LBRACE buzzer_methods RBRACE | LPAREN buzzer_methods RPAREN) buzzer_method_output
  public static boolean buzzer_method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_method")) return false;
    if (!nextTokenIs(b, "<buzzer method>", KW_EVENT, KW_LINE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUZZER_METHOD, "<buzzer method>");
    r = buzzer_method_0(b, l + 1);
    r = r && buzzer_method_name(b, l + 1);
    r = r && buzzer_method_2(b, l + 1);
    r = r && buzzer_method_output(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_LINE | KW_EVENT
  private static boolean buzzer_method_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_method_0")) return false;
    boolean r;
    r = consumeToken(b, KW_LINE);
    if (!r) r = consumeToken(b, KW_EVENT);
    return r;
  }

  // LBRACE buzzer_methods RBRACE | LPAREN buzzer_methods RPAREN
  private static boolean buzzer_method_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_method_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = buzzer_method_2_0(b, l + 1);
    if (!r) r = buzzer_method_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE buzzer_methods RBRACE
  private static boolean buzzer_method_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_method_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && buzzer_methods(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN buzzer_methods RPAREN
  private static boolean buzzer_method_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_method_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && buzzer_methods(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<remapIfKeywordOrBiType>> IDENTIFIER
  public static boolean buzzer_method_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_method_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUZZER_METHOD_NAME, "<buzzer method name>");
    r = remapIfKeywordOrBiType(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (separator_signature output (separator_err output)? )?
  public static boolean buzzer_method_output(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_method_output")) return false;
    Marker m = enter_section_(b, l, _NONE_, BUZZER_METHOD_OUTPUT, "<buzzer method output>");
    buzzer_method_output_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // separator_signature output (separator_err output)?
  private static boolean buzzer_method_output_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_method_output_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = separator_signature(b, l + 1);
    r = r && output(b, l + 1);
    r = r && buzzer_method_output_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (separator_err output)?
  private static boolean buzzer_method_output_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_method_output_0_2")) return false;
    buzzer_method_output_0_2_0(b, l + 1);
    return true;
  }

  // separator_err output
  private static boolean buzzer_method_output_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_method_output_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = separator_err(b, l + 1);
    r = r && output(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simple_struct_embed | simple_struct_field
  public static boolean buzzer_method_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_method_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUZZER_METHOD_PARAM, "<buzzer method param>");
    r = simple_struct_embed(b, l + 1);
    if (!r) r = simple_struct_field(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // buzzer_method_param? (COMMA buzzer_method_param)*
  public static boolean buzzer_methods(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_methods")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUZZER_METHODS, "<buzzer methods>");
    r = buzzer_methods_0(b, l + 1);
    r = r && buzzer_methods_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // buzzer_method_param?
  private static boolean buzzer_methods_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_methods_0")) return false;
    buzzer_method_param(b, l + 1);
    return true;
  }

  // (COMMA buzzer_method_param)*
  private static boolean buzzer_methods_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_methods_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!buzzer_methods_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "buzzer_methods_1", c)) break;
    }
    return true;
  }

  // COMMA buzzer_method_param
  private static boolean buzzer_methods_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_methods_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && buzzer_method_param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<remapIfKeywordOrBiType>> IDENTIFIER
  public static boolean buzzer_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "buzzer_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUZZER_NAME, "<buzzer name>");
    r = remapIfKeywordOrBiType(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean class_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CLASS_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean class_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_type")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CLASS_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // (KW_CLONE | KW_NEWTYPE | KW_COPY) class_name KW_INTO class_name (LBRACE struct_members RBRACE | LPAREN struct_members RPAREN)?
  public static boolean clone(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clone")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLONE, "<clone>");
    r = clone_0(b, l + 1);
    r = r && class_name(b, l + 1);
    r = r && consumeToken(b, KW_INTO);
    r = r && class_name(b, l + 1);
    r = r && clone_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_CLONE | KW_NEWTYPE | KW_COPY
  private static boolean clone_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clone_0")) return false;
    boolean r;
    r = consumeToken(b, KW_CLONE);
    if (!r) r = consumeToken(b, KW_NEWTYPE);
    if (!r) r = consumeToken(b, KW_COPY);
    return r;
  }

  // (LBRACE struct_members RBRACE | LPAREN struct_members RPAREN)?
  private static boolean clone_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clone_4")) return false;
    clone_4_0(b, l + 1);
    return true;
  }

  // LBRACE struct_members RBRACE | LPAREN struct_members RPAREN
  private static boolean clone_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clone_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = clone_4_0_0(b, l + 1);
    if (!r) r = clone_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE struct_members RBRACE
  private static boolean clone_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clone_4_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && struct_members(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN struct_members RPAREN
  private static boolean clone_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clone_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && struct_members(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (KW_CONST | KW_VALUES) (LBRACE constants RBRACE | LPAREN constants RPAREN)
  public static boolean const_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_$")) return false;
    if (!nextTokenIs(b, "<const $>", KW_CONST, KW_VALUES)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONST, "<const $>");
    r = const_0(b, l + 1);
    r = r && const_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_CONST | KW_VALUES
  private static boolean const_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_0")) return false;
    boolean r;
    r = consumeToken(b, KW_CONST);
    if (!r) r = consumeToken(b, KW_VALUES);
    return r;
  }

  // LBRACE constants RBRACE | LPAREN constants RPAREN
  private static boolean const_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = const_1_0(b, l + 1);
    if (!r) r = const_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE constants RBRACE
  private static boolean const_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && constants(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN constants RPAREN
  private static boolean const_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && constants(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean const_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CONST_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // const_name (COLON generic_id)? EQUAL const_value
  public static boolean const_no_doc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_no_doc")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = const_name(b, l + 1);
    r = r && const_no_doc_1(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && const_value(b, l + 1);
    exit_section_(b, m, CONST_NO_DOC, r);
    return r;
  }

  // (COLON generic_id)?
  private static boolean const_no_doc_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_no_doc_1")) return false;
    const_no_doc_1_0(b, l + 1);
    return true;
  }

  // COLON generic_id
  private static boolean const_no_doc_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_no_doc_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && generic_id(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // any_value | LPAREN any_value RPAREN
  public static boolean const_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONST_VALUE, "<const value>");
    r = any_value(b, l + 1);
    if (!r) r = const_value_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LPAREN any_value RPAREN
  private static boolean const_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_value_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && any_value(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // const_no_doc (separator_struct? const_no_doc)* separator_struct?
  public static boolean constants(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constants")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = const_no_doc(b, l + 1);
    r = r && constants_1(b, l + 1);
    r = r && constants_2(b, l + 1);
    exit_section_(b, m, CONSTANTS, r);
    return r;
  }

  // (separator_struct? const_no_doc)*
  private static boolean constants_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constants_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!constants_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "constants_1", c)) break;
    }
    return true;
  }

  // separator_struct? const_no_doc
  private static boolean constants_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constants_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constants_1_0_0(b, l + 1);
    r = r && const_no_doc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // separator_struct?
  private static boolean constants_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constants_1_0_0")) return false;
    separator_struct(b, l + 1);
    return true;
  }

  // separator_struct?
  private static boolean constants_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constants_2")) return false;
    separator_struct(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // include+ | include* member+
  public static boolean content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTENT, "<content>");
    r = content_0(b, l + 1);
    if (!r) r = content_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // include+
  private static boolean content_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = include(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!include(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "content_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // include* member+
  private static boolean content_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = content_1_0(b, l + 1);
    r = r && content_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // include*
  private static boolean content_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!include(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "content_1_0", c)) break;
    }
    return true;
  }

  // member+
  private static boolean content_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = member(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "content_1_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_DECLARED class_name
  public static boolean declared(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declared")) return false;
    if (!nextTokenIs(b, KW_DECLARED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DECLARED);
    r = r && class_name(b, l + 1);
    exit_section_(b, m, DECLARED, r);
    return r;
  }

  /* ********************************************************** */
  // KW_DOMAIN domain_name
  public static boolean domain(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "domain")) return false;
    if (!nextTokenIs(b, KW_DOMAIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DOMAIN);
    r = r && domain_name(b, l + 1);
    exit_section_(b, m, DOMAIN, r);
    return r;
  }

  /* ********************************************************** */
  // <<remapIfKeywordOrBiType>> IDENTIFIER (DOT <<remapIfKeywordOrBiType>> IDENTIFIER)*
  public static boolean domain_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "domain_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOMAIN_NAME, "<domain name>");
    r = remapIfKeywordOrBiType(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && domain_name_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (DOT <<remapIfKeywordOrBiType>> IDENTIFIER)*
  private static boolean domain_name_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "domain_name_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!domain_name_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "domain_name_2", c)) break;
    }
    return true;
  }

  // DOT <<remapIfKeywordOrBiType>> IDENTIFIER
  private static boolean domain_name_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "domain_name_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && remapIfKeywordOrBiType(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (KW_DOWNSTREAM | KW_DOWN | KW_TOCLIENT) <<remapIfKeywordOrBiType>> IDENTIFIER (LBRACE stream_param? (COMMA stream_param)* RBRACE | LPAREN stream_param? (COMMA stream_param)* RPAREN)
  public static boolean downstream(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "downstream")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOWNSTREAM, "<downstream>");
    r = downstream_0(b, l + 1);
    r = r && remapIfKeywordOrBiType(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && downstream_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_DOWNSTREAM | KW_DOWN | KW_TOCLIENT
  private static boolean downstream_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "downstream_0")) return false;
    boolean r;
    r = consumeToken(b, KW_DOWNSTREAM);
    if (!r) r = consumeToken(b, KW_DOWN);
    if (!r) r = consumeToken(b, KW_TOCLIENT);
    return r;
  }

  // LBRACE stream_param? (COMMA stream_param)* RBRACE | LPAREN stream_param? (COMMA stream_param)* RPAREN
  private static boolean downstream_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "downstream_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = downstream_3_0(b, l + 1);
    if (!r) r = downstream_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE stream_param? (COMMA stream_param)* RBRACE
  private static boolean downstream_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "downstream_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && downstream_3_0_1(b, l + 1);
    r = r && downstream_3_0_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // stream_param?
  private static boolean downstream_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "downstream_3_0_1")) return false;
    stream_param(b, l + 1);
    return true;
  }

  // (COMMA stream_param)*
  private static boolean downstream_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "downstream_3_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!downstream_3_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "downstream_3_0_2", c)) break;
    }
    return true;
  }

  // COMMA stream_param
  private static boolean downstream_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "downstream_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && stream_param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN stream_param? (COMMA stream_param)* RPAREN
  private static boolean downstream_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "downstream_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && downstream_3_1_1(b, l + 1);
    r = r && downstream_3_1_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // stream_param?
  private static boolean downstream_3_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "downstream_3_1_1")) return false;
    stream_param(b, l + 1);
    return true;
  }

  // (COMMA stream_param)*
  private static boolean downstream_3_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "downstream_3_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!downstream_3_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "downstream_3_1_2", c)) break;
    }
    return true;
  }

  // COMMA stream_param
  private static boolean downstream_3_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "downstream_3_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && stream_param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (KW_DATA | KW_DTO | KW_STRUCT) class_name (LBRACE struct_members RBRACE | LPAREN struct_members RPAREN)
  public static boolean dto(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DTO, "<dto>");
    r = dto_0(b, l + 1);
    r = r && class_name(b, l + 1);
    r = r && dto_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_DATA | KW_DTO | KW_STRUCT
  private static boolean dto_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto_0")) return false;
    boolean r;
    r = consumeToken(b, KW_DATA);
    if (!r) r = consumeToken(b, KW_DTO);
    if (!r) r = consumeToken(b, KW_STRUCT);
    return r;
  }

  // LBRACE struct_members RBRACE | LPAREN struct_members RPAREN
  private static boolean dto_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dto_2_0(b, l + 1);
    if (!r) r = dto_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE struct_members RBRACE
  private static boolean dto_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && struct_members(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN struct_members RPAREN
  private static boolean dto_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && struct_members(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ENUM class_name (enum_free_form | enum_enclosed)
  public static boolean enum_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_$")) return false;
    if (!nextTokenIs(b, KW_ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ENUM);
    r = r && class_name(b, l + 1);
    r = r && enum_2(b, l + 1);
    exit_section_(b, m, ENUM, r);
    return r;
  }

  // enum_free_form | enum_enclosed
  private static boolean enum_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_2")) return false;
    boolean r;
    r = enum_free_form(b, l + 1);
    if (!r) r = enum_enclosed(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (PLUS (PLUS PLUS)? | DOT DOT DOT) class_type
  public static boolean enum_embed_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_embed_value")) return false;
    if (!nextTokenIs(b, "<enum embed value>", DOT, PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_EMBED_VALUE, "<enum embed value>");
    r = enum_embed_value_0(b, l + 1);
    r = r && class_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PLUS (PLUS PLUS)? | DOT DOT DOT
  private static boolean enum_embed_value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_embed_value_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_embed_value_0_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, DOT, DOT, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS (PLUS PLUS)?
  private static boolean enum_embed_value_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_embed_value_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && enum_embed_value_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (PLUS PLUS)?
  private static boolean enum_embed_value_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_embed_value_0_0_1")) return false;
    enum_embed_value_0_0_1_0(b, l + 1);
    return true;
  }

  // PLUS PLUS
  private static boolean enum_embed_value_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_embed_value_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PLUS, PLUS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE enum_values RBRACE | LPAREN enum_values RPAREN
  public static boolean enum_enclosed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_enclosed")) return false;
    if (!nextTokenIs(b, "<enum enclosed>", LBRACE, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_ENCLOSED, "<enum enclosed>");
    r = enum_enclosed_0(b, l + 1);
    if (!r) r = enum_enclosed_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LBRACE enum_values RBRACE
  private static boolean enum_enclosed_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_enclosed_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && enum_values(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN enum_values RPAREN
  private static boolean enum_enclosed_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_enclosed_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && enum_values(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EQUAL enum_value (separator_enum enum_value)*
  public static boolean enum_free_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_free_form")) return false;
    if (!nextTokenIs(b, EQUAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUAL);
    r = r && enum_value(b, l + 1);
    r = r && enum_free_form_2(b, l + 1);
    exit_section_(b, m, ENUM_FREE_FORM, r);
    return r;
  }

  // (separator_enum enum_value)*
  private static boolean enum_free_form_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_free_form_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_free_form_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_free_form_2", c)) break;
    }
    return true;
  }

  // separator_enum enum_value
  private static boolean enum_free_form_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_free_form_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = separator_enum(b, l + 1);
    r = r && enum_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MINUS (MINUS MINUS)? class_type
  public static boolean enum_minus_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_minus_value")) return false;
    if (!nextTokenIs(b, MINUS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MINUS);
    r = r && enum_minus_value_1(b, l + 1);
    r = r && class_type(b, l + 1);
    exit_section_(b, m, ENUM_MINUS_VALUE, r);
    return r;
  }

  // (MINUS MINUS)?
  private static boolean enum_minus_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_minus_value_1")) return false;
    enum_minus_value_1_0(b, l + 1);
    return true;
  }

  // MINUS MINUS
  private static boolean enum_minus_value_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_minus_value_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MINUS, MINUS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (class_type (EQUAL const_value)?) | enum_embed_value | enum_minus_value
  public static boolean enum_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_VALUE, "<enum value>");
    r = enum_value_0(b, l + 1);
    if (!r) r = enum_embed_value(b, l + 1);
    if (!r) r = enum_minus_value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // class_type (EQUAL const_value)?
  private static boolean enum_value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_value_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_type(b, l + 1);
    r = r && enum_value_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (EQUAL const_value)?
  private static boolean enum_value_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_value_0_1")) return false;
    enum_value_0_1_0(b, l + 1);
    return true;
  }

  // EQUAL const_value
  private static boolean enum_value_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_value_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUAL);
    r = r && const_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // enum_value? (separator_enum? enum_value)* separator_enum?
  public static boolean enum_values(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_values")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_VALUES, "<enum values>");
    r = enum_values_0(b, l + 1);
    r = r && enum_values_1(b, l + 1);
    r = r && enum_values_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // enum_value?
  private static boolean enum_values_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_values_0")) return false;
    enum_value(b, l + 1);
    return true;
  }

  // (separator_enum? enum_value)*
  private static boolean enum_values_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_values_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_values_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_values_1", c)) break;
    }
    return true;
  }

  // separator_enum? enum_value
  private static boolean enum_values_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_values_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_values_1_0_0(b, l + 1);
    r = r && enum_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // separator_enum?
  private static boolean enum_values_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_values_1_0_0")) return false;
    separator_enum(b, l + 1);
    return true;
  }

  // separator_enum?
  private static boolean enum_values_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_values_2")) return false;
    separator_enum(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // package? domain? import* content*
  static boolean file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = file_0(b, l + 1);
    r = r && file_1(b, l + 1);
    r = r && file_2(b, l + 1);
    r = r && file_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // package?
  private static boolean file_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_0")) return false;
    package_$(b, l + 1);
    return true;
  }

  // domain?
  private static boolean file_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_1")) return false;
    domain(b, l + 1);
    return true;
  }

  // import*
  private static boolean file_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_$(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_2", c)) break;
    }
    return true;
  }

  // content*
  private static boolean file_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!content(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_FOREIGN generic_id (LBRACE foreign_member* RBRACE | LPAREN foreign_member* RPAREN)
  public static boolean foreign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign")) return false;
    if (!nextTokenIs(b, KW_FOREIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FOREIGN);
    r = r && generic_id(b, l + 1);
    r = r && foreign_2(b, l + 1);
    exit_section_(b, m, FOREIGN, r);
    return r;
  }

  // LBRACE foreign_member* RBRACE | LPAREN foreign_member* RPAREN
  private static boolean foreign_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = foreign_2_0(b, l + 1);
    if (!r) r = foreign_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE foreign_member* RBRACE
  private static boolean foreign_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && foreign_2_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // foreign_member*
  private static boolean foreign_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!foreign_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "foreign_2_0_1", c)) break;
    }
    return true;
  }

  // LPAREN foreign_member* RPAREN
  private static boolean foreign_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && foreign_2_1_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // foreign_member*
  private static boolean foreign_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!foreign_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "foreign_2_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean foreign_interpolation_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_interpolation_symbol")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, FOREIGN_INTERPOLATION_SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // string_literal COLON foreign_type
  public static boolean foreign_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_member")) return false;
    if (!nextTokenIs(b, QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string_literal(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && foreign_type(b, l + 1);
    exit_section_(b, m, FOREIGN_MEMBER, r);
    return r;
  }

  /* ********************************************************** */
  // foreign_interpolation_symbol string_literal
  public static boolean foreign_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_type")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = foreign_interpolation_symbol(b, l + 1);
    r = r && string_literal(b, l + 1);
    exit_section_(b, m, FOREIGN_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // package_id HASH class_type
  public static boolean full_id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "full_id")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = package_id(b, l + 1);
    r = r && consumeToken(b, HASH);
    r = r && class_type(b, l + 1);
    exit_section_(b, m, FULL_ID, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACK generic_id (COMMA generic_id)* RBRACK
  public static boolean generic(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && generic_id(b, l + 1);
    r = r && generic_2(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, GENERIC, r);
    return r;
  }

  // (COMMA generic_id)*
  private static boolean generic_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!generic_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "generic_2", c)) break;
    }
    return true;
  }

  // COMMA generic_id
  private static boolean generic_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && generic_id(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // idl_identifier generic?
  public static boolean generic_id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_id")) return false;
    if (!nextTokenIs(b, "<generic id>", BI_TYPE, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_ID, "<generic id>");
    r = idl_identifier(b, l + 1);
    r = r && generic_id_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // generic?
  private static boolean generic_id_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_id_1")) return false;
    generic(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_ID class_name (LBRACE id_member* RBRACE | LPAREN id_member* RPAREN)
  public static boolean id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id")) return false;
    if (!nextTokenIs(b, KW_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ID);
    r = r && class_name(b, l + 1);
    r = r && id_2(b, l + 1);
    exit_section_(b, m, ID, r);
    return r;
  }

  // LBRACE id_member* RBRACE | LPAREN id_member* RPAREN
  private static boolean id_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id_2_0(b, l + 1);
    if (!r) r = id_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE id_member* RBRACE
  private static boolean id_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && id_2_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // id_member*
  private static boolean id_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!id_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "id_2_0_1", c)) break;
    }
    return true;
  }

  // LPAREN id_member* RPAREN
  private static boolean id_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && id_2_1_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // id_member*
  private static boolean id_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!id_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "id_2_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // id_member_name COLON generic_id
  public static boolean id_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ID_MEMBER, "<id member>");
    r = id_member_name(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && generic_id(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<remapIfKeywordOrBiType>> IDENTIFIER
  public static boolean id_member_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_member_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ID_MEMBER_NAME, "<id member name>");
    r = remapIfKeywordOrBiType(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // full_id | non_generic_id
  public static boolean idl_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idl_identifier")) return false;
    if (!nextTokenIs(b, "<idl identifier>", BI_TYPE, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDL_IDENTIFIER, "<idl identifier>");
    r = full_id(b, l + 1);
    if (!r) r = non_generic_id(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_IMPORT domain_name (DOT (LBRACE import_member* RBRACE | LPAREN import_member* RPAREN))?
  public static boolean import_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_$")) return false;
    if (!nextTokenIs(b, KW_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IMPORT);
    r = r && domain_name(b, l + 1);
    r = r && import_2(b, l + 1);
    exit_section_(b, m, IMPORT, r);
    return r;
  }

  // (DOT (LBRACE import_member* RBRACE | LPAREN import_member* RPAREN))?
  private static boolean import_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_2")) return false;
    import_2_0(b, l + 1);
    return true;
  }

  // DOT (LBRACE import_member* RBRACE | LPAREN import_member* RPAREN)
  private static boolean import_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && import_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE import_member* RBRACE | LPAREN import_member* RPAREN
  private static boolean import_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_2_0_1_0(b, l + 1);
    if (!r) r = import_2_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE import_member* RBRACE
  private static boolean import_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && import_2_0_1_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // import_member*
  private static boolean import_2_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_2_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "import_2_0_1_0_1", c)) break;
    }
    return true;
  }

  // LPAREN import_member* RPAREN
  private static boolean import_2_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_2_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && import_2_0_1_1_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // import_member*
  private static boolean import_2_0_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_2_0_1_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "import_2_0_1_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // class_type (AS class_type)? separator_struct?
  public static boolean import_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_member")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_type(b, l + 1);
    r = r && import_member_1(b, l + 1);
    r = r && import_member_2(b, l + 1);
    exit_section_(b, m, IMPORT_MEMBER, r);
    return r;
  }

  // (AS class_type)?
  private static boolean import_member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_member_1")) return false;
    import_member_1_0(b, l + 1);
    return true;
  }

  // AS class_type
  private static boolean import_member_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_member_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && class_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // separator_struct?
  private static boolean import_member_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_member_2")) return false;
    separator_struct(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_INCLUDE string_literal
  public static boolean include(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include")) return false;
    if (!nextTokenIs(b, KW_INCLUDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_INCLUDE);
    r = r && string_literal(b, l + 1);
    exit_section_(b, m, INCLUDE, r);
    return r;
  }

  /* ********************************************************** */
  // literal | obj_def | list_def
  public static boolean just_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "just_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JUST_VALUE, "<just value>");
    r = literal(b, l + 1);
    if (!r) r = obj_def(b, l + 1);
    if (!r) r = list_def(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACK const_value? (separator_struct? const_value)* separator_struct? RBRACK
  public static boolean list_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_def")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && list_def_1(b, l + 1);
    r = r && list_def_2(b, l + 1);
    r = r && list_def_3(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, LIST_DEF, r);
    return r;
  }

  // const_value?
  private static boolean list_def_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_def_1")) return false;
    const_value(b, l + 1);
    return true;
  }

  // (separator_struct? const_value)*
  private static boolean list_def_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_def_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!list_def_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_def_2", c)) break;
    }
    return true;
  }

  // separator_struct? const_value
  private static boolean list_def_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_def_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = list_def_2_0_0(b, l + 1);
    r = r && const_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // separator_struct?
  private static boolean list_def_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_def_2_0_0")) return false;
    separator_struct(b, l + 1);
    return true;
  }

  // separator_struct?
  private static boolean list_def_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_def_3")) return false;
    separator_struct(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FLOAT_LITERAL | INT_LITERAL | DECIMAL | NEGATIVE_DECIMAL | bool_literal | string_literal
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, FLOAT_LITERAL);
    if (!r) r = consumeToken(b, INT_LITERAL);
    if (!r) r = consumeToken(b, DECIMAL);
    if (!r) r = consumeToken(b, NEGATIVE_DECIMAL);
    if (!r) r = bool_literal(b, l + 1);
    if (!r) r = string_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // base_type_member | type_member | other_member
  public static boolean member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER, "<member>");
    r = base_type_member(b, l + 1);
    if (!r) r = type_member(b, l + 1);
    if (!r) r = other_member(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (KW_MIXIN | KW_INTERFACE) class_name (LBRACE struct_members RBRACE | LPAREN struct_members RPAREN)
  public static boolean mixin(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixin")) return false;
    if (!nextTokenIs(b, "<mixin>", KW_INTERFACE, KW_MIXIN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MIXIN, "<mixin>");
    r = mixin_0(b, l + 1);
    r = r && class_name(b, l + 1);
    r = r && mixin_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_MIXIN | KW_INTERFACE
  private static boolean mixin_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixin_0")) return false;
    boolean r;
    r = consumeToken(b, KW_MIXIN);
    if (!r) r = consumeToken(b, KW_INTERFACE);
    return r;
  }

  // LBRACE struct_members RBRACE | LPAREN struct_members RPAREN
  private static boolean mixin_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixin_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mixin_2_0(b, l + 1);
    if (!r) r = mixin_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE struct_members RBRACE
  private static boolean mixin_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixin_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && struct_members(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN struct_members RPAREN
  private static boolean mixin_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixin_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && struct_members(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BI_TYPE | class_type
  public static boolean non_generic_id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "non_generic_id")) return false;
    if (!nextTokenIs(b, "<non generic id>", BI_TYPE, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NON_GENERIC_ID, "<non generic id>");
    r = consumeToken(b, BI_TYPE);
    if (!r) r = class_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACE constants RBRACE | LPAREN constants RPAREN
  public static boolean obj_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "obj_def")) return false;
    if (!nextTokenIs(b, "<obj def>", LBRACE, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJ_DEF, "<obj def>");
    r = obj_def_0(b, l + 1);
    if (!r) r = obj_def_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LBRACE constants RBRACE
  private static boolean obj_def_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "obj_def_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && constants(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN constants RPAREN
  private static boolean obj_def_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "obj_def_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && constants(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // service | buzzer | streams | const
  public static boolean other_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "other_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OTHER_MEMBER, "<other member>");
    r = service(b, l + 1);
    if (!r) r = buzzer(b, l + 1);
    if (!r) r = streams(b, l + 1);
    if (!r) r = const_$(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // output_void | output_adt | output_struct | output_singular
  public static boolean output(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OUTPUT, "<output>");
    r = output_void(b, l + 1);
    if (!r) r = output_adt(b, l + 1);
    if (!r) r = output_struct(b, l + 1);
    if (!r) r = output_singular(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // adt_enclosed
  public static boolean output_adt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_adt")) return false;
    if (!nextTokenIs(b, "<output adt>", LBRACE, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OUTPUT_ADT, "<output adt>");
    r = adt_enclosed(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // generic_id
  public static boolean output_singular(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_singular")) return false;
    if (!nextTokenIs(b, "<output singular>", BI_TYPE, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OUTPUT_SINGULAR, "<output singular>");
    r = generic_id(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACE output_struct_member* RBRACE | LPAREN output_struct_member* RPAREN
  public static boolean output_struct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_struct")) return false;
    if (!nextTokenIs(b, "<output struct>", LBRACE, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OUTPUT_STRUCT, "<output struct>");
    r = output_struct_0(b, l + 1);
    if (!r) r = output_struct_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LBRACE output_struct_member* RBRACE
  private static boolean output_struct_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_struct_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && output_struct_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // output_struct_member*
  private static boolean output_struct_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_struct_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!output_struct_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "output_struct_0_1", c)) break;
    }
    return true;
  }

  // LPAREN output_struct_member* RPAREN
  private static boolean output_struct_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_struct_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && output_struct_1_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // output_struct_member*
  private static boolean output_struct_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_struct_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!output_struct_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "output_struct_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // simple_struct_any (COMMA simple_struct_any)* COMMA?
  public static boolean output_struct_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_struct_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OUTPUT_STRUCT_MEMBER, "<output struct member>");
    r = simple_struct_any(b, l + 1);
    r = r && output_struct_member_1(b, l + 1);
    r = r && output_struct_member_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA simple_struct_any)*
  private static boolean output_struct_member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_struct_member_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!output_struct_member_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "output_struct_member_1", c)) break;
    }
    return true;
  }

  // COMMA simple_struct_any
  private static boolean output_struct_member_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_struct_member_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && simple_struct_any(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean output_struct_member_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_struct_member_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // LPAREN RPAREN
  public static boolean output_void(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_void")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, RPAREN);
    exit_section_(b, m, OUTPUT_VOID, r);
    return r;
  }

  /* ********************************************************** */
  // KW_PACKAGE package_name
  public static boolean package_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_$")) return false;
    if (!nextTokenIs(b, KW_PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PACKAGE);
    r = r && package_name(b, l + 1);
    exit_section_(b, m, PACKAGE, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (DOT IDENTIFIER)*
  public static boolean package_id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_id")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && package_id_1(b, l + 1);
    exit_section_(b, m, PACKAGE_ID, r);
    return r;
  }

  // (DOT IDENTIFIER)*
  private static boolean package_id_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_id_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!package_id_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "package_id_1", c)) break;
    }
    return true;
  }

  // DOT IDENTIFIER
  private static boolean package_id_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_id_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<remapIfKeywordOrBiType>> IDENTIFIER (DOT <<remapIfKeywordOrBiType>> IDENTIFIER)*
  public static boolean package_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_NAME, "<package name>");
    r = remapIfKeywordOrBiType(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && package_name_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (DOT <<remapIfKeywordOrBiType>> IDENTIFIER)*
  private static boolean package_name_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!package_name_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "package_name_2", c)) break;
    }
    return true;
  }

  // DOT <<remapIfKeywordOrBiType>> IDENTIFIER
  private static boolean package_name_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && remapIfKeywordOrBiType(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COMMA | SEMICOLON | PIPE
  public static boolean separator_enum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "separator_enum")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEPARATOR_ENUM, "<separator enum>");
    r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, SEMICOLON);
    if (!r) r = consumeToken(b, PIPE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EXCLAMATION EXCLAMATION | QUESTION EXCLAMATION | LEFT_RIGHT_ARROWS | LOOP_RIGHT_ARROW | KW_OR
  public static boolean separator_err(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "separator_err")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEPARATOR_ERR, "<separator err>");
    r = parseTokens(b, 0, EXCLAMATION, EXCLAMATION);
    if (!r) r = parseTokens(b, 0, QUESTION, EXCLAMATION);
    if (!r) r = consumeToken(b, LEFT_RIGHT_ARROWS);
    if (!r) r = consumeToken(b, LOOP_RIGHT_ARROW);
    if (!r) r = consumeToken(b, KW_OR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EQUAL GREATER_THAN | MINUS GREATER_THAN | COLON | DOUBLE_RIGHT_ARROW
  public static boolean separator_signature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "separator_signature")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEPARATOR_SIGNATURE, "<separator signature>");
    r = parseTokens(b, 0, EQUAL, GREATER_THAN);
    if (!r) r = parseTokens(b, 0, MINUS, GREATER_THAN);
    if (!r) r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, DOUBLE_RIGHT_ARROW);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COMMA | SEMICOLON
  public static boolean separator_struct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "separator_struct")) return false;
    if (!nextTokenIs(b, "<separator struct>", COMMA, SEMICOLON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEPARATOR_STRUCT, "<separator struct>");
    r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (KW_SERVICE | KW_SERVER) service_name (LBRACE service_method* RBRACE | LPAREN service_method* RPAREN)
  public static boolean service(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service")) return false;
    if (!nextTokenIs(b, "<service>", KW_SERVER, KW_SERVICE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SERVICE, "<service>");
    r = service_0(b, l + 1);
    r = r && service_name(b, l + 1);
    r = r && service_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_SERVICE | KW_SERVER
  private static boolean service_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_0")) return false;
    boolean r;
    r = consumeToken(b, KW_SERVICE);
    if (!r) r = consumeToken(b, KW_SERVER);
    return r;
  }

  // LBRACE service_method* RBRACE | LPAREN service_method* RPAREN
  private static boolean service_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = service_2_0(b, l + 1);
    if (!r) r = service_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE service_method* RBRACE
  private static boolean service_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && service_2_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // service_method*
  private static boolean service_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!service_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "service_2_0_1", c)) break;
    }
    return true;
  }

  // LPAREN service_method* RPAREN
  private static boolean service_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && service_2_1_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // service_method*
  private static boolean service_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!service_method(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "service_2_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (KW_DEF | KW_FN | KW_FUN | KW_FUNC) service_method_name (LBRACE service_methods RBRACE | LPAREN service_methods RPAREN) service_method_output
  public static boolean service_method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_method")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SERVICE_METHOD, "<service method>");
    r = service_method_0(b, l + 1);
    r = r && service_method_name(b, l + 1);
    r = r && service_method_2(b, l + 1);
    r = r && service_method_output(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_DEF | KW_FN | KW_FUN | KW_FUNC
  private static boolean service_method_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_method_0")) return false;
    boolean r;
    r = consumeToken(b, KW_DEF);
    if (!r) r = consumeToken(b, KW_FN);
    if (!r) r = consumeToken(b, KW_FUN);
    if (!r) r = consumeToken(b, KW_FUNC);
    return r;
  }

  // LBRACE service_methods RBRACE | LPAREN service_methods RPAREN
  private static boolean service_method_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_method_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = service_method_2_0(b, l + 1);
    if (!r) r = service_method_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE service_methods RBRACE
  private static boolean service_method_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_method_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && service_methods(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN service_methods RPAREN
  private static boolean service_method_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_method_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && service_methods(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<remapIfKeywordOrBiType>> IDENTIFIER
  public static boolean service_method_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_method_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SERVICE_METHOD_NAME, "<service method name>");
    r = remapIfKeywordOrBiType(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (separator_signature output (separator_err output)? )?
  public static boolean service_method_output(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_method_output")) return false;
    Marker m = enter_section_(b, l, _NONE_, SERVICE_METHOD_OUTPUT, "<service method output>");
    service_method_output_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // separator_signature output (separator_err output)?
  private static boolean service_method_output_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_method_output_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = separator_signature(b, l + 1);
    r = r && output(b, l + 1);
    r = r && service_method_output_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (separator_err output)?
  private static boolean service_method_output_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_method_output_0_2")) return false;
    service_method_output_0_2_0(b, l + 1);
    return true;
  }

  // separator_err output
  private static boolean service_method_output_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_method_output_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = separator_err(b, l + 1);
    r = r && output(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simple_struct_embed | simple_struct_field
  public static boolean service_method_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_method_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SERVICE_METHOD_PARAM, "<service method param>");
    r = simple_struct_embed(b, l + 1);
    if (!r) r = simple_struct_field(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // service_method_param? (COMMA service_method_param)*
  public static boolean service_methods(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_methods")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SERVICE_METHODS, "<service methods>");
    r = service_methods_0(b, l + 1);
    r = r && service_methods_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // service_method_param?
  private static boolean service_methods_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_methods_0")) return false;
    service_method_param(b, l + 1);
    return true;
  }

  // (COMMA service_method_param)*
  private static boolean service_methods_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_methods_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!service_methods_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "service_methods_1", c)) break;
    }
    return true;
  }

  // COMMA service_method_param
  private static boolean service_methods_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_methods_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && service_method_param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<remapIfKeywordOrBiType>> IDENTIFIER
  public static boolean service_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SERVICE_NAME, "<service name>");
    r = remapIfKeywordOrBiType(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simple_struct_embed | simple_struct_field
  public static boolean simple_struct_any(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_struct_any")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_STRUCT_ANY, "<simple struct any>");
    r = simple_struct_embed(b, l + 1);
    if (!r) r = simple_struct_field(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (PLUS (PLUS PLUS)? | DOT DOT DOT) idl_identifier
  public static boolean simple_struct_embed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_struct_embed")) return false;
    if (!nextTokenIs(b, "<simple struct embed>", DOT, PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_STRUCT_EMBED, "<simple struct embed>");
    r = simple_struct_embed_0(b, l + 1);
    r = r && idl_identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PLUS (PLUS PLUS)? | DOT DOT DOT
  private static boolean simple_struct_embed_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_struct_embed_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_struct_embed_0_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, DOT, DOT, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS (PLUS PLUS)?
  private static boolean simple_struct_embed_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_struct_embed_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && simple_struct_embed_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (PLUS PLUS)?
  private static boolean simple_struct_embed_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_struct_embed_0_0_1")) return false;
    simple_struct_embed_0_0_1_0(b, l + 1);
    return true;
  }

  // PLUS PLUS
  private static boolean simple_struct_embed_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_struct_embed_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PLUS, PLUS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // struct_name COLON generic_id
  public static boolean simple_struct_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_struct_field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_STRUCT_FIELD, "<simple struct field>");
    r = struct_name(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && generic_id(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simple_struct_embed | simple_struct_field
  public static boolean stream_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stream_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STREAM_PARAM, "<stream param>");
    r = simple_struct_embed(b, l + 1);
    if (!r) r = simple_struct_field(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // downstream | upstream
  public static boolean stream_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stream_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STREAM_VALUE, "<stream value>");
    r = downstream(b, l + 1);
    if (!r) r = upstream(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (KW_STREAMS | KW_TUNNEL | KW_PUMP) streams_name (LBRACE stream_value* RBRACE | LPAREN stream_value* RPAREN)
  public static boolean streams(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "streams")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STREAMS, "<streams>");
    r = streams_0(b, l + 1);
    r = r && streams_name(b, l + 1);
    r = r && streams_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_STREAMS | KW_TUNNEL | KW_PUMP
  private static boolean streams_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "streams_0")) return false;
    boolean r;
    r = consumeToken(b, KW_STREAMS);
    if (!r) r = consumeToken(b, KW_TUNNEL);
    if (!r) r = consumeToken(b, KW_PUMP);
    return r;
  }

  // LBRACE stream_value* RBRACE | LPAREN stream_value* RPAREN
  private static boolean streams_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "streams_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = streams_2_0(b, l + 1);
    if (!r) r = streams_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE stream_value* RBRACE
  private static boolean streams_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "streams_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && streams_2_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // stream_value*
  private static boolean streams_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "streams_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stream_value(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "streams_2_0_1", c)) break;
    }
    return true;
  }

  // LPAREN stream_value* RPAREN
  private static boolean streams_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "streams_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && streams_2_1_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // stream_value*
  private static boolean streams_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "streams_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stream_value(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "streams_2_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <<remapIfKeywordOrBiType>> IDENTIFIER
  public static boolean streams_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "streams_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STREAMS_NAME, "<streams name>");
    r = remapIfKeywordOrBiType(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL_ESCAPE | UNICODE_ESCAPE | NUMBER_ESCAPE
  public static boolean string_escape(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_escape")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_ESCAPE, "<string escape>");
    r = consumeToken(b, SYMBOL_ESCAPE);
    if (!r) r = consumeToken(b, UNICODE_ESCAPE);
    if (!r) r = consumeToken(b, NUMBER_ESCAPE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // QUOTE (STRING_CONTENT | string_escape)* QUOTE
  public static boolean string_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal")) return false;
    if (!nextTokenIs(b, QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTE);
    r = r && string_literal_1(b, l + 1);
    r = r && consumeToken(b, QUOTE);
    exit_section_(b, m, STRING_LITERAL, r);
    return r;
  }

  // (STRING_CONTENT | string_escape)*
  private static boolean string_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!string_literal_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_literal_1", c)) break;
    }
    return true;
  }

  // STRING_CONTENT | string_escape
  private static boolean string_literal_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal_1_0")) return false;
    boolean r;
    r = consumeToken(b, STRING_CONTENT);
    if (!r) r = string_escape(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // struct_name COLON generic_id
  public static boolean struct_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_def")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DEF, "<struct def>");
    r = struct_name(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && generic_id(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (PLUS (PLUS PLUS)? | DOT DOT DOT) (struct_def | class_type)
  public static boolean struct_embed_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_embed_value")) return false;
    if (!nextTokenIs(b, "<struct embed value>", DOT, PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_EMBED_VALUE, "<struct embed value>");
    r = struct_embed_value_0(b, l + 1);
    r = r && struct_embed_value_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PLUS (PLUS PLUS)? | DOT DOT DOT
  private static boolean struct_embed_value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_embed_value_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_embed_value_0_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, DOT, DOT, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS (PLUS PLUS)?
  private static boolean struct_embed_value_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_embed_value_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && struct_embed_value_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (PLUS PLUS)?
  private static boolean struct_embed_value_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_embed_value_0_0_1")) return false;
    struct_embed_value_0_0_1_0(b, l + 1);
    return true;
  }

  // PLUS PLUS
  private static boolean struct_embed_value_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_embed_value_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PLUS, PLUS);
    exit_section_(b, m, null, r);
    return r;
  }

  // struct_def | class_type
  private static boolean struct_embed_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_embed_value_1")) return false;
    boolean r;
    r = struct_def(b, l + 1);
    if (!r) r = class_type(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // struct_def | struct_plus_value | struct_embed_value | struct_minus_value
  public static boolean struct_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_MEMBER, "<struct member>");
    r = struct_def(b, l + 1);
    if (!r) r = struct_plus_value(b, l + 1);
    if (!r) r = struct_embed_value(b, l + 1);
    if (!r) r = struct_minus_value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // struct_member? (separator_struct? struct_member)* separator_struct?
  public static boolean struct_members(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_members")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_MEMBERS, "<struct members>");
    r = struct_members_0(b, l + 1);
    r = r && struct_members_1(b, l + 1);
    r = r && struct_members_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // struct_member?
  private static boolean struct_members_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_members_0")) return false;
    struct_member(b, l + 1);
    return true;
  }

  // (separator_struct? struct_member)*
  private static boolean struct_members_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_members_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!struct_members_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_members_1", c)) break;
    }
    return true;
  }

  // separator_struct? struct_member
  private static boolean struct_members_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_members_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_members_1_0_0(b, l + 1);
    r = r && struct_member(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // separator_struct?
  private static boolean struct_members_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_members_1_0_0")) return false;
    separator_struct(b, l + 1);
    return true;
  }

  // separator_struct?
  private static boolean struct_members_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_members_2")) return false;
    separator_struct(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // MINUS (MINUS MINUS)? (struct_def | class_type)
  public static boolean struct_minus_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_minus_value")) return false;
    if (!nextTokenIs(b, MINUS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MINUS);
    r = r && struct_minus_value_1(b, l + 1);
    r = r && struct_minus_value_2(b, l + 1);
    exit_section_(b, m, STRUCT_MINUS_VALUE, r);
    return r;
  }

  // (MINUS MINUS)?
  private static boolean struct_minus_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_minus_value_1")) return false;
    struct_minus_value_1_0(b, l + 1);
    return true;
  }

  // MINUS MINUS
  private static boolean struct_minus_value_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_minus_value_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MINUS, MINUS);
    exit_section_(b, m, null, r);
    return r;
  }

  // struct_def | class_type
  private static boolean struct_minus_value_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_minus_value_2")) return false;
    boolean r;
    r = struct_def(b, l + 1);
    if (!r) r = class_type(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // <<remapIfKeywordOrBiType>> IDENTIFIER
  public static boolean struct_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_NAME, "<struct name>");
    r = remapIfKeywordOrBiType(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AMPERSAND (AMPERSAND AMPERSAND)? (struct_def | class_type)
  public static boolean struct_plus_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_plus_value")) return false;
    if (!nextTokenIs(b, AMPERSAND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AMPERSAND);
    r = r && struct_plus_value_1(b, l + 1);
    r = r && struct_plus_value_2(b, l + 1);
    exit_section_(b, m, STRUCT_PLUS_VALUE, r);
    return r;
  }

  // (AMPERSAND AMPERSAND)?
  private static boolean struct_plus_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_plus_value_1")) return false;
    struct_plus_value_1_0(b, l + 1);
    return true;
  }

  // AMPERSAND AMPERSAND
  private static boolean struct_plus_value_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_plus_value_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AMPERSAND, AMPERSAND);
    exit_section_(b, m, null, r);
    return r;
  }

  // struct_def | class_type
  private static boolean struct_plus_value_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_plus_value_2")) return false;
    boolean r;
    r = struct_def(b, l + 1);
    if (!r) r = class_type(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // foreign | clone | declared
  public static boolean type_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_MEMBER, "<type member>");
    r = foreign(b, l + 1);
    if (!r) r = clone(b, l + 1);
    if (!r) r = declared(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // generic_id LPAREN just_value RPAREN
  public static boolean typed_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typed_value")) return false;
    if (!nextTokenIs(b, "<typed value>", BI_TYPE, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPED_VALUE, "<typed value>");
    r = generic_id(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && just_value(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (KW_UPSTREAM | KW_UP | KW_TOSERVER) <<remapIfKeywordOrBiType>> IDENTIFIER (LBRACE stream_param? (COMMA stream_param)* RBRACE | LPAREN stream_param? (COMMA stream_param)* RPAREN)
  public static boolean upstream(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "upstream")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UPSTREAM, "<upstream>");
    r = upstream_0(b, l + 1);
    r = r && remapIfKeywordOrBiType(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && upstream_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_UPSTREAM | KW_UP | KW_TOSERVER
  private static boolean upstream_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "upstream_0")) return false;
    boolean r;
    r = consumeToken(b, KW_UPSTREAM);
    if (!r) r = consumeToken(b, KW_UP);
    if (!r) r = consumeToken(b, KW_TOSERVER);
    return r;
  }

  // LBRACE stream_param? (COMMA stream_param)* RBRACE | LPAREN stream_param? (COMMA stream_param)* RPAREN
  private static boolean upstream_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "upstream_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = upstream_3_0(b, l + 1);
    if (!r) r = upstream_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE stream_param? (COMMA stream_param)* RBRACE
  private static boolean upstream_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "upstream_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && upstream_3_0_1(b, l + 1);
    r = r && upstream_3_0_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // stream_param?
  private static boolean upstream_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "upstream_3_0_1")) return false;
    stream_param(b, l + 1);
    return true;
  }

  // (COMMA stream_param)*
  private static boolean upstream_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "upstream_3_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!upstream_3_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "upstream_3_0_2", c)) break;
    }
    return true;
  }

  // COMMA stream_param
  private static boolean upstream_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "upstream_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && stream_param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN stream_param? (COMMA stream_param)* RPAREN
  private static boolean upstream_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "upstream_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && upstream_3_1_1(b, l + 1);
    r = r && upstream_3_1_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // stream_param?
  private static boolean upstream_3_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "upstream_3_1_1")) return false;
    stream_param(b, l + 1);
    return true;
  }

  // (COMMA stream_param)*
  private static boolean upstream_3_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "upstream_3_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!upstream_3_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "upstream_3_1_2", c)) break;
    }
    return true;
  }

  // COMMA stream_param
  private static boolean upstream_3_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "upstream_3_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && stream_param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
