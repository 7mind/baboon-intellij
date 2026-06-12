// This is a generated file. Not intended for manual editing.
package io.septimalmind.baboon.baboonintellij.language;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static io.septimalmind.baboon.baboonintellij.psi.BaboonTypes.*;
import static io.septimalmind.baboon.baboonintellij.language.parser.BaboonParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class BaboonParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return file(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // KW_ADT class_name member_meta? (LBRACE adt_member* RBRACE | LPAREN adt_member* RPAREN)
  public static boolean adt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adt")) return false;
    if (!nextTokenIs(builder_, KW_ADT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_ADT);
    result_ = result_ && class_name(builder_, level_ + 1);
    result_ = result_ && adt_2(builder_, level_ + 1);
    result_ = result_ && adt_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, ADT, result_);
    return result_;
  }

  // member_meta?
  private static boolean adt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adt_2")) return false;
    member_meta(builder_, level_ + 1);
    return true;
  }

  // LBRACE adt_member* RBRACE | LPAREN adt_member* RPAREN
  private static boolean adt_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adt_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = adt_3_0(builder_, level_ + 1);
    if (!result_) result_ = adt_3_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LBRACE adt_member* RBRACE
  private static boolean adt_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adt_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && adt_3_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // adt_member*
  private static boolean adt_3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adt_3_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!adt_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "adt_3_0_1", pos_)) break;
    }
    return true;
  }

  // LPAREN adt_member* RPAREN
  private static boolean adt_3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adt_3_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && adt_3_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // adt_member*
  private static boolean adt_3_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adt_3_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!adt_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "adt_3_1_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_ADT IDENTIFIER (LBRACE dto_member* RBRACE | LPAREN dto_member* RPAREN)
  public static boolean adt_in_service(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adt_in_service")) return false;
    if (!nextTokenIs(builder_, KW_ADT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_ADT, IDENTIFIER);
    result_ = result_ && adt_in_service_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, ADT_IN_SERVICE, result_);
    return result_;
  }

  // LBRACE dto_member* RBRACE | LPAREN dto_member* RPAREN
  private static boolean adt_in_service_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adt_in_service_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = adt_in_service_2_0(builder_, level_ + 1);
    if (!result_) result_ = adt_in_service_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LBRACE dto_member* RBRACE
  private static boolean adt_in_service_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adt_in_service_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && adt_in_service_2_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // dto_member*
  private static boolean adt_in_service_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adt_in_service_2_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!dto_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "adt_in_service_2_0_1", pos_)) break;
    }
    return true;
  }

  // LPAREN dto_member* RPAREN
  private static boolean adt_in_service_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adt_in_service_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && adt_in_service_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // dto_member*
  private static boolean adt_in_service_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adt_in_service_2_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!dto_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "adt_in_service_2_1_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (dto | contract) | extended_contract_def | extraction_def
  public static boolean adt_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adt_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ADT_MEMBER, "<adt member>");
    result_ = adt_member_0(builder_, level_ + 1);
    if (!result_) result_ = extended_contract_def(builder_, level_ + 1);
    if (!result_) result_ = extraction_def(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // dto | contract
  private static boolean adt_member_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adt_member_0")) return false;
    boolean result_;
    result_ = dto(builder_, level_ + 1);
    if (!result_) result_ = contract(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // KW_CHOICE class_name member_meta? (LBRACE choice_member* RBRACE | LPAREN choice_member* RPAREN)
  public static boolean choice(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice")) return false;
    if (!nextTokenIs(builder_, KW_CHOICE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_CHOICE);
    result_ = result_ && class_name(builder_, level_ + 1);
    result_ = result_ && choice_2(builder_, level_ + 1);
    result_ = result_ && choice_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, CHOICE, result_);
    return result_;
  }

  // member_meta?
  private static boolean choice_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_2")) return false;
    member_meta(builder_, level_ + 1);
    return true;
  }

  // LBRACE choice_member* RBRACE | LPAREN choice_member* RPAREN
  private static boolean choice_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = choice_3_0(builder_, level_ + 1);
    if (!result_) result_ = choice_3_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LBRACE choice_member* RBRACE
  private static boolean choice_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && choice_3_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // choice_member*
  private static boolean choice_3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_3_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!choice_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "choice_3_0_1", pos_)) break;
    }
    return true;
  }

  // LPAREN choice_member* RPAREN
  private static boolean choice_3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_3_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && choice_3_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // choice_member*
  private static boolean choice_3_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_3_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!choice_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "choice_3_1_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_CHOICE IDENTIFIER (LBRACE choice_member* RBRACE | LPAREN choice_member* RPAREN)
  public static boolean choice_in_service(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_in_service")) return false;
    if (!nextTokenIs(builder_, KW_CHOICE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_CHOICE, IDENTIFIER);
    result_ = result_ && choice_in_service_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, CHOICE_IN_SERVICE, result_);
    return result_;
  }

  // LBRACE choice_member* RBRACE | LPAREN choice_member* RPAREN
  private static boolean choice_in_service_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_in_service_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = choice_in_service_2_0(builder_, level_ + 1);
    if (!result_) result_ = choice_in_service_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LBRACE choice_member* RBRACE
  private static boolean choice_in_service_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_in_service_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && choice_in_service_2_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // choice_member*
  private static boolean choice_in_service_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_in_service_2_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!choice_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "choice_in_service_2_0_1", pos_)) break;
    }
    return true;
  }

  // LPAREN choice_member* RPAREN
  private static boolean choice_in_service_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_in_service_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && choice_in_service_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // choice_member*
  private static boolean choice_in_service_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_in_service_2_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!choice_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "choice_in_service_2_1_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER choice_value? choice_member_rename?
  public static boolean choice_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_member")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && choice_member_1(builder_, level_ + 1);
    result_ = result_ && choice_member_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, CHOICE_MEMBER, result_);
    return result_;
  }

  // choice_value?
  private static boolean choice_member_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_member_1")) return false;
    choice_value(builder_, level_ + 1);
    return true;
  }

  // choice_member_rename?
  private static boolean choice_member_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_member_2")) return false;
    choice_member_rename(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // COLON KW_WAS LBRACK IDENTIFIER RBRACK
  public static boolean choice_member_rename(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_member_rename")) return false;
    if (!nextTokenIs(builder_, COLON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COLON, KW_WAS, LBRACK, IDENTIFIER, RBRACK);
    exit_section_(builder_, marker_, CHOICE_MEMBER_RENAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // EQUAL (DECIMAL | NEGATIVE_DECIMAL)
  public static boolean choice_value(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_value")) return false;
    if (!nextTokenIs(builder_, EQUAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQUAL);
    result_ = result_ && choice_value_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, CHOICE_VALUE, result_);
    return result_;
  }

  // DECIMAL | NEGATIVE_DECIMAL
  private static boolean choice_value_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_value_1")) return false;
    boolean result_;
    result_ = consumeToken(builder_, DECIMAL);
    if (!result_) result_ = consumeToken(builder_, NEGATIVE_DECIMAL);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean class_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_name")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, CLASS_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER (DOT IDENTIFIER)*
  public static boolean class_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_type")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && class_type_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, CLASS_TYPE, result_);
    return result_;
  }

  // (DOT IDENTIFIER)*
  private static boolean class_type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_type_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!class_type_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "class_type_1", pos_)) break;
    }
    return true;
  }

  // DOT IDENTIFIER
  private static boolean class_type_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_type_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // include+ | include* member+
  public static boolean content(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "content")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONTENT, "<content>");
    result_ = content_0(builder_, level_ + 1);
    if (!result_) result_ = content_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // include+
  private static boolean content_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "content_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = include(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!include(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "content_0", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // include* member+
  private static boolean content_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "content_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = content_1_0(builder_, level_ + 1);
    result_ = result_ && content_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // include*
  private static boolean content_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "content_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!include(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "content_1_0", pos_)) break;
    }
    return true;
  }

  // member+
  private static boolean content_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "content_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = member(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "content_1_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_CONTRACT class_name (LBRACE dto_member* RBRACE | LPAREN dto_member* RPAREN)
  public static boolean contract(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "contract")) return false;
    if (!nextTokenIs(builder_, KW_CONTRACT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_CONTRACT);
    result_ = result_ && class_name(builder_, level_ + 1);
    result_ = result_ && contract_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, CONTRACT, result_);
    return result_;
  }

  // LBRACE dto_member* RBRACE | LPAREN dto_member* RPAREN
  private static boolean contract_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "contract_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = contract_2_0(builder_, level_ + 1);
    if (!result_) result_ = contract_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LBRACE dto_member* RBRACE
  private static boolean contract_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "contract_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && contract_2_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // dto_member*
  private static boolean contract_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "contract_2_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!dto_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "contract_2_0_1", pos_)) break;
    }
    return true;
  }

  // LPAREN dto_member* RPAREN
  private static boolean contract_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "contract_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && contract_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // dto_member*
  private static boolean contract_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "contract_2_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!dto_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "contract_2_1_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // COLON derived_member (COMMA derived_member)*
  public static boolean derived(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "derived")) return false;
    if (!nextTokenIs(builder_, COLON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && derived_member(builder_, level_ + 1);
    result_ = result_ && derived_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, DERIVED, result_);
    return result_;
  }

  // (COMMA derived_member)*
  private static boolean derived_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "derived_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!derived_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "derived_2", pos_)) break;
    }
    return true;
  }

  // COMMA derived_member
  private static boolean derived_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "derived_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && derived_member(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_DERIVED LBRACK IDENTIFIER RBRACK
  public static boolean derived_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "derived_member")) return false;
    if (!nextTokenIs(builder_, KW_DERIVED)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_DERIVED, LBRACK, IDENTIFIER, RBRACK);
    exit_section_(builder_, marker_, DERIVED_MEMBER, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_DATA class_name member_meta? (LBRACE dto_member* RBRACE | LPAREN dto_member* RPAREN)
  public static boolean dto(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dto")) return false;
    if (!nextTokenIs(builder_, KW_DATA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_DATA);
    result_ = result_ && class_name(builder_, level_ + 1);
    result_ = result_ && dto_2(builder_, level_ + 1);
    result_ = result_ && dto_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, DTO, result_);
    return result_;
  }

  // member_meta?
  private static boolean dto_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dto_2")) return false;
    member_meta(builder_, level_ + 1);
    return true;
  }

  // LBRACE dto_member* RBRACE | LPAREN dto_member* RPAREN
  private static boolean dto_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dto_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = dto_3_0(builder_, level_ + 1);
    if (!result_) result_ = dto_3_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LBRACE dto_member* RBRACE
  private static boolean dto_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dto_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && dto_3_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // dto_member*
  private static boolean dto_3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dto_3_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!dto_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "dto_3_0_1", pos_)) break;
    }
    return true;
  }

  // LPAREN dto_member* RPAREN
  private static boolean dto_3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dto_3_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && dto_3_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // dto_member*
  private static boolean dto_3_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dto_3_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!dto_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "dto_3_1_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_DATA struct_marker (LBRACE dto_member* RBRACE | LPAREN dto_member* RPAREN)
  public static boolean dto_in_service(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dto_in_service")) return false;
    if (!nextTokenIs(builder_, KW_DATA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_DATA);
    result_ = result_ && struct_marker(builder_, level_ + 1);
    result_ = result_ && dto_in_service_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, DTO_IN_SERVICE, result_);
    return result_;
  }

  // LBRACE dto_member* RBRACE | LPAREN dto_member* RPAREN
  private static boolean dto_in_service_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dto_in_service_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = dto_in_service_2_0(builder_, level_ + 1);
    if (!result_) result_ = dto_in_service_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LBRACE dto_member* RBRACE
  private static boolean dto_in_service_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dto_in_service_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && dto_in_service_2_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // dto_member*
  private static boolean dto_in_service_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dto_in_service_2_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!dto_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "dto_in_service_2_0_1", pos_)) break;
    }
    return true;
  }

  // LPAREN dto_member* RPAREN
  private static boolean dto_in_service_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dto_in_service_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && dto_in_service_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // dto_member*
  private static boolean dto_in_service_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dto_in_service_2_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!dto_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "dto_in_service_2_1_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // field_def | parent_def | unfield_def | unparent_def | intersection_def | extended_contract_def | extraction_def
  public static boolean dto_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dto_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DTO_MEMBER, "<dto member>");
    result_ = field_def(builder_, level_ + 1);
    if (!result_) result_ = parent_def(builder_, level_ + 1);
    if (!result_) result_ = unfield_def(builder_, level_ + 1);
    if (!result_) result_ = unparent_def(builder_, level_ + 1);
    if (!result_) result_ = intersection_def(builder_, level_ + 1);
    if (!result_) result_ = extended_contract_def(builder_, level_ + 1);
    if (!result_) result_ = extraction_def(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KW_IS non_generic_type_ref
  public static boolean extended_contract_def(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extended_contract_def")) return false;
    if (!nextTokenIs(builder_, KW_IS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_IS);
    result_ = result_ && non_generic_type_ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, EXTENDED_CONTRACT_DEF, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_HAS (KW_MIRROR | KW_CONTRACT) IDENTIFIER
  public static boolean extraction_def(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extraction_def")) return false;
    if (!nextTokenIs(builder_, KW_HAS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_HAS);
    result_ = result_ && extraction_def_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, EXTRACTION_DEF, result_);
    return result_;
  }

  // KW_MIRROR | KW_CONTRACT
  private static boolean extraction_def_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extraction_def_1")) return false;
    boolean result_;
    result_ = consumeToken(builder_, KW_MIRROR);
    if (!result_) result_ = consumeToken(builder_, KW_CONTRACT);
    return result_;
  }

  /* ********************************************************** */
  // field_name COLON type_ref field_rename?
  public static boolean field_def(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_def")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FIELD_DEF, "<field def>");
    result_ = field_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && type_ref(builder_, level_ + 1);
    result_ = result_ && field_def_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // field_rename?
  private static boolean field_def_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_def_3")) return false;
    field_rename(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // <<remapIfKeyword>> IDENTIFIER
  public static boolean field_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_name")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FIELD_NAME, "<field name>");
    result_ = remapIfKeyword(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KW_WAS field_name
  public static boolean field_rename(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_rename")) return false;
    if (!nextTokenIs(builder_, KW_WAS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_WAS);
    result_ = result_ && field_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, FIELD_RENAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // model? version? pragma* import? content*
  static boolean file(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "file")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = file_0(builder_, level_ + 1);
    result_ = result_ && file_1(builder_, level_ + 1);
    result_ = result_ && file_2(builder_, level_ + 1);
    result_ = result_ && file_3(builder_, level_ + 1);
    result_ = result_ && file_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // model?
  private static boolean file_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "file_0")) return false;
    model(builder_, level_ + 1);
    return true;
  }

  // version?
  private static boolean file_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "file_1")) return false;
    version(builder_, level_ + 1);
    return true;
  }

  // pragma*
  private static boolean file_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "file_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!pragma(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "file_2", pos_)) break;
    }
    return true;
  }

  // import?
  private static boolean file_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "file_3")) return false;
    import_$(builder_, level_ + 1);
    return true;
  }

  // content*
  private static boolean file_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "file_4")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!content(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "file_4", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_FOREIGN class_name member_meta? (LBRACE foreign_member* RBRACE | LPAREN foreign_member* RPAREN)
  public static boolean foreign(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreign")) return false;
    if (!nextTokenIs(builder_, KW_FOREIGN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_FOREIGN);
    result_ = result_ && class_name(builder_, level_ + 1);
    result_ = result_ && foreign_2(builder_, level_ + 1);
    result_ = result_ && foreign_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, FOREIGN, result_);
    return result_;
  }

  // member_meta?
  private static boolean foreign_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreign_2")) return false;
    member_meta(builder_, level_ + 1);
    return true;
  }

  // LBRACE foreign_member* RBRACE | LPAREN foreign_member* RPAREN
  private static boolean foreign_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreign_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = foreign_3_0(builder_, level_ + 1);
    if (!result_) result_ = foreign_3_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LBRACE foreign_member* RBRACE
  private static boolean foreign_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreign_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && foreign_3_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // foreign_member*
  private static boolean foreign_3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreign_3_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!foreign_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "foreign_3_0_1", pos_)) break;
    }
    return true;
  }

  // LPAREN foreign_member* RPAREN
  private static boolean foreign_3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreign_3_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && foreign_3_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // foreign_member*
  private static boolean foreign_3_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreign_3_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!foreign_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "foreign_3_1_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_WITH LBRACE key_value_pair* RBRACE
  public static boolean foreign_attrs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreign_attrs")) return false;
    if (!nextTokenIs(builder_, KW_WITH)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_WITH, LBRACE);
    result_ = result_ && foreign_attrs_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, FOREIGN_ATTRS, result_);
    return result_;
  }

  // key_value_pair*
  private static boolean foreign_attrs_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreign_attrs_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!key_value_pair(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "foreign_attrs_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER EQUAL (string_literal foreign_attrs? | type_ref)
  public static boolean foreign_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreign_member")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, EQUAL);
    result_ = result_ && foreign_member_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, FOREIGN_MEMBER, result_);
    return result_;
  }

  // string_literal foreign_attrs? | type_ref
  private static boolean foreign_member_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreign_member_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = foreign_member_2_0(builder_, level_ + 1);
    if (!result_) result_ = type_ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // string_literal foreign_attrs?
  private static boolean foreign_member_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreign_member_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = string_literal(builder_, level_ + 1);
    result_ = result_ && foreign_member_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // foreign_attrs?
  private static boolean foreign_member_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreign_member_2_0_1")) return false;
    foreign_attrs(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_ID class_name template_head? member_meta? (LBRACE dto_member* RBRACE | LPAREN dto_member* RPAREN)
  public static boolean id_def(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "id_def")) return false;
    if (!nextTokenIs(builder_, KW_ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_ID);
    result_ = result_ && class_name(builder_, level_ + 1);
    result_ = result_ && id_def_2(builder_, level_ + 1);
    result_ = result_ && id_def_3(builder_, level_ + 1);
    result_ = result_ && id_def_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, ID_DEF, result_);
    return result_;
  }

  // template_head?
  private static boolean id_def_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "id_def_2")) return false;
    template_head(builder_, level_ + 1);
    return true;
  }

  // member_meta?
  private static boolean id_def_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "id_def_3")) return false;
    member_meta(builder_, level_ + 1);
    return true;
  }

  // LBRACE dto_member* RBRACE | LPAREN dto_member* RPAREN
  private static boolean id_def_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "id_def_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = id_def_4_0(builder_, level_ + 1);
    if (!result_) result_ = id_def_4_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LBRACE dto_member* RBRACE
  private static boolean id_def_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "id_def_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && id_def_4_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // dto_member*
  private static boolean id_def_4_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "id_def_4_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!dto_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "id_def_4_0_1", pos_)) break;
    }
    return true;
  }

  // LPAREN dto_member* RPAREN
  private static boolean id_def_4_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "id_def_4_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && id_def_4_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // dto_member*
  private static boolean id_def_4_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "id_def_4_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!dto_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "id_def_4_1_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_IMPORT string_literal LBRACE STAR RBRACE without?
  public static boolean import_$(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_$")) return false;
    if (!nextTokenIs(builder_, KW_IMPORT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_IMPORT);
    result_ = result_ && string_literal(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, LBRACE, STAR, RBRACE);
    result_ = result_ && import_5(builder_, level_ + 1);
    exit_section_(builder_, marker_, IMPORT, result_);
    return result_;
  }

  // without?
  private static boolean import_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_5")) return false;
    without(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_INCLUDE string_literal
  public static boolean include(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "include")) return false;
    if (!nextTokenIs(builder_, KW_INCLUDE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_INCLUDE);
    result_ = result_ && string_literal(builder_, level_ + 1);
    exit_section_(builder_, marker_, INCLUDE, result_);
    return result_;
  }

  /* ********************************************************** */
  // CARET non_generic_type_ref
  public static boolean intersection_def(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "intersection_def")) return false;
    if (!nextTokenIs(builder_, CARET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CARET);
    result_ = result_ && non_generic_type_ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, INTERSECTION_DEF, result_);
    return result_;
  }

  /* ********************************************************** */
  // string_literal EQUAL string_literal
  public static boolean key_value_pair(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "key_value_pair")) return false;
    if (!nextTokenIs(builder_, QUOTE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = string_literal(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUAL);
    result_ = result_ && string_literal(builder_, level_ + 1);
    exit_section_(builder_, marker_, KEY_VALUE_PAIR, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_ROOT? (choice | dto | id_def | adt | foreign | contract | service | type_alias)
  public static boolean main_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "main_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MAIN_MEMBER, "<main member>");
    result_ = main_member_0(builder_, level_ + 1);
    result_ = result_ && main_member_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // KW_ROOT?
  private static boolean main_member_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "main_member_0")) return false;
    consumeToken(builder_, KW_ROOT);
    return true;
  }

  // choice | dto | id_def | adt | foreign | contract | service | type_alias
  private static boolean main_member_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "main_member_1")) return false;
    boolean result_;
    result_ = choice(builder_, level_ + 1);
    if (!result_) result_ = dto(builder_, level_ + 1);
    if (!result_) result_ = id_def(builder_, level_ + 1);
    if (!result_) result_ = adt(builder_, level_ + 1);
    if (!result_) result_ = foreign(builder_, level_ + 1);
    if (!result_) result_ = contract(builder_, level_ + 1);
    if (!result_) result_ = service(builder_, level_ + 1);
    if (!result_) result_ = type_alias(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // main_member | namespace
  public static boolean member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MEMBER, "<member>");
    result_ = main_member(builder_, level_ + 1);
    if (!result_) result_ = namespace(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // derived | renamed
  public static boolean member_meta(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_meta")) return false;
    if (!nextTokenIs(builder_, COLON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = derived(builder_, level_ + 1);
    if (!result_) result_ = renamed(builder_, level_ + 1);
    exit_section_(builder_, marker_, MEMBER_META, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_MODEL model_name
  public static boolean model(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "model")) return false;
    if (!nextTokenIs(builder_, KW_MODEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_MODEL);
    result_ = result_ && model_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, MODEL, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER (DOT IDENTIFIER)*
  public static boolean model_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "model_name")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && model_name_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, MODEL_NAME, result_);
    return result_;
  }

  // (DOT IDENTIFIER)*
  private static boolean model_name_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "model_name_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!model_name_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "model_name_1", pos_)) break;
    }
    return true;
  }

  // DOT IDENTIFIER
  private static boolean model_name_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "model_name_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_NAMESPACE IDENTIFIER (LBRACE content* RBRACE | LPAREN content* RPAREN)
  public static boolean namespace(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace")) return false;
    if (!nextTokenIs(builder_, KW_NAMESPACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_NAMESPACE, IDENTIFIER);
    result_ = result_ && namespace_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, NAMESPACE, result_);
    return result_;
  }

  // LBRACE content* RBRACE | LPAREN content* RPAREN
  private static boolean namespace_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = namespace_2_0(builder_, level_ + 1);
    if (!result_) result_ = namespace_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LBRACE content* RBRACE
  private static boolean namespace_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && namespace_2_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // content*
  private static boolean namespace_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_2_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!content(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "namespace_2_0_1", pos_)) break;
    }
    return true;
  }

  // LPAREN content* RPAREN
  private static boolean namespace_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && namespace_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // content*
  private static boolean namespace_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_2_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!content(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "namespace_2_1_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // BI_TYPE | class_type
  public static boolean non_generic_type_ref(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_generic_type_ref")) return false;
    if (!nextTokenIs(builder_, "<non generic type ref>", BI_TYPE, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NON_GENERIC_TYPE_REF, "<non generic type ref>");
    result_ = consumeToken(builder_, BI_TYPE);
    if (!result_) result_ = class_type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // PLUS non_generic_type_ref
  public static boolean parent_def(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parent_def")) return false;
    if (!nextTokenIs(builder_, PLUS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    result_ = result_ && non_generic_type_ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARENT_DEF, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_PRAGMA pragma_key EQUAL string_literal
  public static boolean pragma(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pragma")) return false;
    if (!nextTokenIs(builder_, KW_PRAGMA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_PRAGMA);
    result_ = result_ && pragma_key(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUAL);
    result_ = result_ && string_literal(builder_, level_ + 1);
    exit_section_(builder_, marker_, PRAGMA, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER (DOT IDENTIFIER)*
  public static boolean pragma_key(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pragma_key")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && pragma_key_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, PRAGMA_KEY, result_);
    return result_;
  }

  // (DOT IDENTIFIER)*
  private static boolean pragma_key_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pragma_key_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!pragma_key_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "pragma_key_1", pos_)) break;
    }
    return true;
  }

  // DOT IDENTIFIER
  private static boolean pragma_key_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pragma_key_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // COLON KW_WAS LBRACK (IDENTIFIER DOT)* IDENTIFIER RBRACK
  public static boolean renamed(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "renamed")) return false;
    if (!nextTokenIs(builder_, COLON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COLON, KW_WAS, LBRACK);
    result_ = result_ && renamed_3(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, IDENTIFIER, RBRACK);
    exit_section_(builder_, marker_, RENAMED, result_);
    return result_;
  }

  // (IDENTIFIER DOT)*
  private static boolean renamed_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "renamed_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!renamed_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "renamed_3", pos_)) break;
    }
    return true;
  }

  // IDENTIFIER DOT
  private static boolean renamed_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "renamed_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, DOT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_SERVICE class_name (LBRACE service_member* RBRACE | LPAREN service_member* RPAREN)
  public static boolean service(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "service")) return false;
    if (!nextTokenIs(builder_, KW_SERVICE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_SERVICE);
    result_ = result_ && class_name(builder_, level_ + 1);
    result_ = result_ && service_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, SERVICE, result_);
    return result_;
  }

  // LBRACE service_member* RBRACE | LPAREN service_member* RPAREN
  private static boolean service_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "service_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = service_2_0(builder_, level_ + 1);
    if (!result_) result_ = service_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LBRACE service_member* RBRACE
  private static boolean service_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "service_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && service_2_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // service_member*
  private static boolean service_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "service_2_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!service_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "service_2_0_1", pos_)) break;
    }
    return true;
  }

  // LPAREN service_member* RPAREN
  private static boolean service_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "service_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && service_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // service_member*
  private static boolean service_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "service_2_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!service_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "service_2_1_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_DEF IDENTIFIER (LBRACE signature_part* RBRACE | LPAREN signature_part* RPAREN)
  public static boolean service_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "service_member")) return false;
    if (!nextTokenIs(builder_, KW_DEF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_DEF, IDENTIFIER);
    result_ = result_ && service_member_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, SERVICE_MEMBER, result_);
    return result_;
  }

  // LBRACE signature_part* RBRACE | LPAREN signature_part* RPAREN
  private static boolean service_member_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "service_member_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = service_member_2_0(builder_, level_ + 1);
    if (!result_) result_ = service_member_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LBRACE signature_part* RBRACE
  private static boolean service_member_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "service_member_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && service_member_2_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // signature_part*
  private static boolean service_member_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "service_member_2_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!signature_part(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "service_member_2_0_1", pos_)) break;
    }
    return true;
  }

  // LPAREN signature_part* RPAREN
  private static boolean service_member_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "service_member_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && service_member_2_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // signature_part*
  private static boolean service_member_2_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "service_member_2_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!signature_part(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "service_member_2_1_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // dto_in_service | adt_in_service | choice_in_service
  public static boolean signature_inline(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signature_inline")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SIGNATURE_INLINE, "<signature inline>");
    result_ = dto_in_service(builder_, level_ + 1);
    if (!result_) result_ = adt_in_service(builder_, level_ + 1);
    if (!result_) result_ = choice_in_service(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // signature_struct | signature_inline
  public static boolean signature_part(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signature_part")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SIGNATURE_PART, "<signature part>");
    result_ = signature_struct(builder_, level_ + 1);
    if (!result_) result_ = signature_inline(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // struct_marker EQUAL type_ref
  public static boolean signature_struct(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signature_struct")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SIGNATURE_STRUCT, "<signature struct>");
    result_ = struct_marker(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUAL);
    result_ = result_ && type_ref(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // SYMBOL_ESCAPE | UNICODE_ESCAPE | NUMBER_ESCAPE
  public static boolean string_escape(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_escape")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRING_ESCAPE, "<string escape>");
    result_ = consumeToken(builder_, SYMBOL_ESCAPE);
    if (!result_) result_ = consumeToken(builder_, UNICODE_ESCAPE);
    if (!result_) result_ = consumeToken(builder_, NUMBER_ESCAPE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // QUOTE (STRING_CONTENT | string_escape)* QUOTE
  public static boolean string_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_literal")) return false;
    if (!nextTokenIs(builder_, QUOTE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, QUOTE);
    result_ = result_ && string_literal_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, QUOTE);
    exit_section_(builder_, marker_, STRING_LITERAL, result_);
    return result_;
  }

  // (STRING_CONTENT | string_escape)*
  private static boolean string_literal_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_literal_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!string_literal_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "string_literal_1", pos_)) break;
    }
    return true;
  }

  // STRING_CONTENT | string_escape
  private static boolean string_literal_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_literal_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, STRING_CONTENT);
    if (!result_) result_ = string_escape(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // KW_IN | KW_OUT | KW_ERR
  public static boolean struct_marker(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_marker")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRUCT_MARKER, "<struct marker>");
    result_ = consumeToken(builder_, KW_IN);
    if (!result_) result_ = consumeToken(builder_, KW_OUT);
    if (!result_) result_ = consumeToken(builder_, KW_ERR);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // LBRACK IDENTIFIER (COMMA IDENTIFIER)* RBRACK
  public static boolean template_head(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_head")) return false;
    if (!nextTokenIs(builder_, LBRACK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LBRACK, IDENTIFIER);
    result_ = result_ && template_head_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACK);
    exit_section_(builder_, marker_, TEMPLATE_HEAD, result_);
    return result_;
  }

  // (COMMA IDENTIFIER)*
  private static boolean template_head_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_head_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!template_head_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "template_head_2", pos_)) break;
    }
    return true;
  }

  // COMMA IDENTIFIER
  private static boolean template_head_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_head_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_TYPE class_name EQUAL type_ref
  public static boolean type_alias(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_alias")) return false;
    if (!nextTokenIs(builder_, KW_TYPE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_TYPE);
    result_ = result_ && class_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUAL);
    result_ = result_ && type_ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, TYPE_ALIAS, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACK type_ref (COMMA type_ref)* RBRACK
  public static boolean type_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_params")) return false;
    if (!nextTokenIs(builder_, LBRACK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACK);
    result_ = result_ && type_ref(builder_, level_ + 1);
    result_ = result_ && type_params_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACK);
    exit_section_(builder_, marker_, TYPE_PARAMS, result_);
    return result_;
  }

  // (COMMA type_ref)*
  private static boolean type_params_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_params_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!type_params_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_params_2", pos_)) break;
    }
    return true;
  }

  // COMMA type_ref
  private static boolean type_params_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_params_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && type_ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_generic_type_ref type_params?
  public static boolean type_ref(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_ref")) return false;
    if (!nextTokenIs(builder_, "<type ref>", BI_TYPE, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_REF, "<type ref>");
    result_ = non_generic_type_ref(builder_, level_ + 1);
    result_ = result_ && type_ref_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // type_params?
  private static boolean type_ref_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_ref_1")) return false;
    type_params(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // MINUS field_def
  public static boolean unfield_def(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unfield_def")) return false;
    if (!nextTokenIs(builder_, MINUS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MINUS);
    result_ = result_ && field_def(builder_, level_ + 1);
    exit_section_(builder_, marker_, UNFIELD_DEF, result_);
    return result_;
  }

  /* ********************************************************** */
  // MINUS non_generic_type_ref
  public static boolean unparent_def(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unparent_def")) return false;
    if (!nextTokenIs(builder_, MINUS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MINUS);
    result_ = result_ && non_generic_type_ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, UNPARENT_DEF, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_VERSION string_literal
  public static boolean version(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "version")) return false;
    if (!nextTokenIs(builder_, KW_VERSION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_VERSION);
    result_ = result_ && string_literal(builder_, level_ + 1);
    exit_section_(builder_, marker_, VERSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_WITHOUT (LBRACE IDENTIFIER* RBRACE | LPAREN IDENTIFIER* RPAREN)
  public static boolean without(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "without")) return false;
    if (!nextTokenIs(builder_, KW_WITHOUT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_WITHOUT);
    result_ = result_ && without_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, WITHOUT, result_);
    return result_;
  }

  // LBRACE IDENTIFIER* RBRACE | LPAREN IDENTIFIER* RPAREN
  private static boolean without_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "without_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = without_1_0(builder_, level_ + 1);
    if (!result_) result_ = without_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LBRACE IDENTIFIER* RBRACE
  private static boolean without_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "without_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && without_1_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER*
  private static boolean without_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "without_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(builder_, "without_1_0_1", pos_)) break;
    }
    return true;
  }

  // LPAREN IDENTIFIER* RPAREN
  private static boolean without_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "without_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && without_1_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER*
  private static boolean without_1_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "without_1_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(builder_, "without_1_1_1", pos_)) break;
    }
    return true;
  }

}
