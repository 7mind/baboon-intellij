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
  // KW_ADT IDENTIFIER (LBRACE adt_member* RBRACE | LPAREN adt_member* RPAREN)
  public static boolean adt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt")) return false;
    if (!nextTokenIs(b, KW_ADT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_ADT, IDENTIFIER);
    r = r && adt_2(b, l + 1);
    exit_section_(b, m, ADT, r);
    return r;
  }

  // LBRACE adt_member* RBRACE | LPAREN adt_member* RPAREN
  private static boolean adt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = adt_2_0(b, l + 1);
    if (!r) r = adt_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE adt_member* RBRACE
  private static boolean adt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && adt_2_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // adt_member*
  private static boolean adt_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!adt_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "adt_2_0_1", c)) break;
    }
    return true;
  }

  // LPAREN adt_member* RPAREN
  private static boolean adt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && adt_2_1_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // adt_member*
  private static boolean adt_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!adt_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "adt_2_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_ADT IDENTIFIER (LBRACE dto_member* RBRACE | LPAREN dto_member* RPAREN)
  public static boolean adt_in_service(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_in_service")) return false;
    if (!nextTokenIs(b, KW_ADT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_ADT, IDENTIFIER);
    r = r && adt_in_service_2(b, l + 1);
    exit_section_(b, m, ADT_IN_SERVICE, r);
    return r;
  }

  // LBRACE dto_member* RBRACE | LPAREN dto_member* RPAREN
  private static boolean adt_in_service_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_in_service_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = adt_in_service_2_0(b, l + 1);
    if (!r) r = adt_in_service_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE dto_member* RBRACE
  private static boolean adt_in_service_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_in_service_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && adt_in_service_2_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // dto_member*
  private static boolean adt_in_service_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_in_service_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dto_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "adt_in_service_2_0_1", c)) break;
    }
    return true;
  }

  // LPAREN dto_member* RPAREN
  private static boolean adt_in_service_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_in_service_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && adt_in_service_2_1_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // dto_member*
  private static boolean adt_in_service_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_in_service_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dto_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "adt_in_service_2_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (dto | contract) | extended_contract_def
  public static boolean adt_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADT_MEMBER, "<adt member>");
    r = adt_member_0(b, l + 1);
    if (!r) r = extended_contract_def(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // dto | contract
  private static boolean adt_member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adt_member_0")) return false;
    boolean r;
    r = dto(b, l + 1);
    if (!r) r = contract(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KW_CHOICE IDENTIFIER (LBRACE choice_member* RBRACE | LPAREN choice_member* RPAREN)
  public static boolean choice(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice")) return false;
    if (!nextTokenIs(b, KW_CHOICE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_CHOICE, IDENTIFIER);
    r = r && choice_2(b, l + 1);
    exit_section_(b, m, CHOICE, r);
    return r;
  }

  // LBRACE choice_member* RBRACE | LPAREN choice_member* RPAREN
  private static boolean choice_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = choice_2_0(b, l + 1);
    if (!r) r = choice_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE choice_member* RBRACE
  private static boolean choice_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && choice_2_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // choice_member*
  private static boolean choice_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!choice_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "choice_2_0_1", c)) break;
    }
    return true;
  }

  // LPAREN choice_member* RPAREN
  private static boolean choice_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && choice_2_1_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // choice_member*
  private static boolean choice_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!choice_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "choice_2_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_CHOICE IDENTIFIER (LBRACE choice_member* RBRACE | LPAREN choice_member* RPAREN)
  public static boolean choice_in_service(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_in_service")) return false;
    if (!nextTokenIs(b, KW_CHOICE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_CHOICE, IDENTIFIER);
    r = r && choice_in_service_2(b, l + 1);
    exit_section_(b, m, CHOICE_IN_SERVICE, r);
    return r;
  }

  // LBRACE choice_member* RBRACE | LPAREN choice_member* RPAREN
  private static boolean choice_in_service_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_in_service_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = choice_in_service_2_0(b, l + 1);
    if (!r) r = choice_in_service_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE choice_member* RBRACE
  private static boolean choice_in_service_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_in_service_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && choice_in_service_2_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // choice_member*
  private static boolean choice_in_service_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_in_service_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!choice_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "choice_in_service_2_0_1", c)) break;
    }
    return true;
  }

  // LPAREN choice_member* RPAREN
  private static boolean choice_in_service_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_in_service_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && choice_in_service_2_1_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // choice_member*
  private static boolean choice_in_service_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_in_service_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!choice_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "choice_in_service_2_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER (EQUAL (DECIMAL | NEGATIVE_DECIMAL))?
  public static boolean choice_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_member")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && choice_member_1(b, l + 1);
    exit_section_(b, m, CHOICE_MEMBER, r);
    return r;
  }

  // (EQUAL (DECIMAL | NEGATIVE_DECIMAL))?
  private static boolean choice_member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_member_1")) return false;
    choice_member_1_0(b, l + 1);
    return true;
  }

  // EQUAL (DECIMAL | NEGATIVE_DECIMAL)
  private static boolean choice_member_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_member_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUAL);
    r = r && choice_member_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DECIMAL | NEGATIVE_DECIMAL
  private static boolean choice_member_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice_member_1_0_1")) return false;
    boolean r;
    r = consumeToken(b, DECIMAL);
    if (!r) r = consumeToken(b, NEGATIVE_DECIMAL);
    return r;
  }

  /* ********************************************************** */
  // include* member+
  public static boolean content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTENT, "<content>");
    r = content_0(b, l + 1);
    r = r && content_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // include*
  private static boolean content_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!include(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "content_0", c)) break;
    }
    return true;
  }

  // member+
  private static boolean content_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = member(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "content_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_CONTRACT IDENTIFIER (LBRACE dto_member* RBRACE | LPAREN dto_member* RPAREN)
  public static boolean contract(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "contract")) return false;
    if (!nextTokenIs(b, KW_CONTRACT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_CONTRACT, IDENTIFIER);
    r = r && contract_2(b, l + 1);
    exit_section_(b, m, CONTRACT, r);
    return r;
  }

  // LBRACE dto_member* RBRACE | LPAREN dto_member* RPAREN
  private static boolean contract_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "contract_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = contract_2_0(b, l + 1);
    if (!r) r = contract_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE dto_member* RBRACE
  private static boolean contract_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "contract_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && contract_2_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // dto_member*
  private static boolean contract_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "contract_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dto_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "contract_2_0_1", c)) break;
    }
    return true;
  }

  // LPAREN dto_member* RPAREN
  private static boolean contract_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "contract_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && contract_2_1_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // dto_member*
  private static boolean contract_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "contract_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dto_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "contract_2_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_DATA IDENTIFIER (LBRACE dto_member* RBRACE | LPAREN dto_member* RPAREN)
  public static boolean dto(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto")) return false;
    if (!nextTokenIs(b, KW_DATA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_DATA, IDENTIFIER);
    r = r && dto_2(b, l + 1);
    exit_section_(b, m, DTO, r);
    return r;
  }

  // LBRACE dto_member* RBRACE | LPAREN dto_member* RPAREN
  private static boolean dto_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dto_2_0(b, l + 1);
    if (!r) r = dto_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE dto_member* RBRACE
  private static boolean dto_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && dto_2_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // dto_member*
  private static boolean dto_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dto_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dto_2_0_1", c)) break;
    }
    return true;
  }

  // LPAREN dto_member* RPAREN
  private static boolean dto_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && dto_2_1_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // dto_member*
  private static boolean dto_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dto_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dto_2_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_DATA struct_marker (LBRACE dto_member* RBRACE | LPAREN dto_member* RPAREN)
  public static boolean dto_in_service(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto_in_service")) return false;
    if (!nextTokenIs(b, KW_DATA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DATA);
    r = r && struct_marker(b, l + 1);
    r = r && dto_in_service_2(b, l + 1);
    exit_section_(b, m, DTO_IN_SERVICE, r);
    return r;
  }

  // LBRACE dto_member* RBRACE | LPAREN dto_member* RPAREN
  private static boolean dto_in_service_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto_in_service_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dto_in_service_2_0(b, l + 1);
    if (!r) r = dto_in_service_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE dto_member* RBRACE
  private static boolean dto_in_service_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto_in_service_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && dto_in_service_2_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // dto_member*
  private static boolean dto_in_service_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto_in_service_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dto_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dto_in_service_2_0_1", c)) break;
    }
    return true;
  }

  // LPAREN dto_member* RPAREN
  private static boolean dto_in_service_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto_in_service_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && dto_in_service_2_1_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // dto_member*
  private static boolean dto_in_service_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto_in_service_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dto_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dto_in_service_2_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // field_def | parent_def | unfield_def | unparent_def | intersection_def | extended_contract_def
  public static boolean dto_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DTO_MEMBER, "<dto member>");
    r = field_def(b, l + 1);
    if (!r) r = parent_def(b, l + 1);
    if (!r) r = unfield_def(b, l + 1);
    if (!r) r = unparent_def(b, l + 1);
    if (!r) r = intersection_def(b, l + 1);
    if (!r) r = extended_contract_def(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_IS non_generic_type_ref
  public static boolean extended_contract_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extended_contract_def")) return false;
    if (!nextTokenIs(b, KW_IS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IS);
    r = r && non_generic_type_ref(b, l + 1);
    exit_section_(b, m, EXTENDED_CONTRACT_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // field_name COLON type_ref
  public static boolean field_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_def")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_DEF, "<field def>");
    r = field_name(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && type_ref(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<remapIfKeyword>> IDENTIFIER
  public static boolean field_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_NAME, "<field name>");
    r = remapIfKeyword(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // model? version? content*
  static boolean file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = file_0(b, l + 1);
    r = r && file_1(b, l + 1);
    r = r && file_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // model?
  private static boolean file_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_0")) return false;
    model(b, l + 1);
    return true;
  }

  // version?
  private static boolean file_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_1")) return false;
    version(b, l + 1);
    return true;
  }

  // content*
  private static boolean file_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!content(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_FOREIGN IDENTIFIER (LBRACE foreign_member* RBRACE | LPAREN foreign_member* RPAREN)
  public static boolean foreign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign")) return false;
    if (!nextTokenIs(b, KW_FOREIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_FOREIGN, IDENTIFIER);
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
  // KW_WITH LBRACE key_value_pair* RBRACE
  public static boolean foreign_attrs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_attrs")) return false;
    if (!nextTokenIs(b, KW_WITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_WITH, LBRACE);
    r = r && foreign_attrs_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, FOREIGN_ATTRS, r);
    return r;
  }

  // key_value_pair*
  private static boolean foreign_attrs_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_attrs_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!key_value_pair(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "foreign_attrs_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER EQUAL string_literal foreign_attrs?
  public static boolean foreign_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_member")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, EQUAL);
    r = r && string_literal(b, l + 1);
    r = r && foreign_member_3(b, l + 1);
    exit_section_(b, m, FOREIGN_MEMBER, r);
    return r;
  }

  // foreign_attrs?
  private static boolean foreign_member_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_member_3")) return false;
    foreign_attrs(b, l + 1);
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
  // CARET non_generic_type_ref
  public static boolean intersection_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "intersection_def")) return false;
    if (!nextTokenIs(b, CARET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CARET);
    r = r && non_generic_type_ref(b, l + 1);
    exit_section_(b, m, INTERSECTION_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // string_literal EQUAL string_literal
  public static boolean key_value_pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_value_pair")) return false;
    if (!nextTokenIs(b, QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string_literal(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && string_literal(b, l + 1);
    exit_section_(b, m, KEY_VALUE_PAIR, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ROOT? (choice | dto | adt | foreign | contract | service)
  public static boolean main_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAIN_MEMBER, "<main member>");
    r = main_member_0(b, l + 1);
    r = r && main_member_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_ROOT?
  private static boolean main_member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_member_0")) return false;
    consumeToken(b, KW_ROOT);
    return true;
  }

  // choice | dto | adt | foreign | contract | service
  private static boolean main_member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_member_1")) return false;
    boolean r;
    r = choice(b, l + 1);
    if (!r) r = dto(b, l + 1);
    if (!r) r = adt(b, l + 1);
    if (!r) r = foreign(b, l + 1);
    if (!r) r = contract(b, l + 1);
    if (!r) r = service(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // main_member | namespace
  public static boolean member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER, "<member>");
    r = main_member(b, l + 1);
    if (!r) r = namespace(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_MODEL model_name
  public static boolean model(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model")) return false;
    if (!nextTokenIs(b, KW_MODEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_MODEL);
    r = r && model_name(b, l + 1);
    exit_section_(b, m, MODEL, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (DOT IDENTIFIER)*
  public static boolean model_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && model_name_1(b, l + 1);
    exit_section_(b, m, MODEL_NAME, r);
    return r;
  }

  // (DOT IDENTIFIER)*
  private static boolean model_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_name_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!model_name_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "model_name_1", c)) break;
    }
    return true;
  }

  // DOT IDENTIFIER
  private static boolean model_name_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_name_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_NAMESPACE IDENTIFIER (LBRACE content* RBRACE | LPAREN content* RPAREN)
  public static boolean namespace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace")) return false;
    if (!nextTokenIs(b, KW_NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_NAMESPACE, IDENTIFIER);
    r = r && namespace_2(b, l + 1);
    exit_section_(b, m, NAMESPACE, r);
    return r;
  }

  // LBRACE content* RBRACE | LPAREN content* RPAREN
  private static boolean namespace_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace_2_0(b, l + 1);
    if (!r) r = namespace_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE content* RBRACE
  private static boolean namespace_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && namespace_2_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // content*
  private static boolean namespace_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!content(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_2_0_1", c)) break;
    }
    return true;
  }

  // LPAREN content* RPAREN
  private static boolean namespace_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && namespace_2_1_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // content*
  private static boolean namespace_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!content(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_2_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // BI_TYPE | IDENTIFIER (DOT IDENTIFIER)*
  public static boolean non_generic_type_ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "non_generic_type_ref")) return false;
    if (!nextTokenIs(b, "<non generic type ref>", BI_TYPE, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NON_GENERIC_TYPE_REF, "<non generic type ref>");
    r = consumeToken(b, BI_TYPE);
    if (!r) r = non_generic_type_ref_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER (DOT IDENTIFIER)*
  private static boolean non_generic_type_ref_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "non_generic_type_ref_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && non_generic_type_ref_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DOT IDENTIFIER)*
  private static boolean non_generic_type_ref_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "non_generic_type_ref_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!non_generic_type_ref_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "non_generic_type_ref_1_1", c)) break;
    }
    return true;
  }

  // DOT IDENTIFIER
  private static boolean non_generic_type_ref_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "non_generic_type_ref_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PLUS non_generic_type_ref
  public static boolean parent_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parent_def")) return false;
    if (!nextTokenIs(b, PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && non_generic_type_ref(b, l + 1);
    exit_section_(b, m, PARENT_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // KW_SERVICE IDENTIFIER (LBRACE service_member* RBRACE | LPAREN service_member* RPAREN)
  public static boolean service(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service")) return false;
    if (!nextTokenIs(b, KW_SERVICE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_SERVICE, IDENTIFIER);
    r = r && service_2(b, l + 1);
    exit_section_(b, m, SERVICE, r);
    return r;
  }

  // LBRACE service_member* RBRACE | LPAREN service_member* RPAREN
  private static boolean service_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = service_2_0(b, l + 1);
    if (!r) r = service_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE service_member* RBRACE
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

  // service_member*
  private static boolean service_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!service_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "service_2_0_1", c)) break;
    }
    return true;
  }

  // LPAREN service_member* RPAREN
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

  // service_member*
  private static boolean service_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!service_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "service_2_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_DEF IDENTIFIER (LBRACE signature_part* RBRACE | LPAREN signature_part* RPAREN)
  public static boolean service_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_member")) return false;
    if (!nextTokenIs(b, KW_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_DEF, IDENTIFIER);
    r = r && service_member_2(b, l + 1);
    exit_section_(b, m, SERVICE_MEMBER, r);
    return r;
  }

  // LBRACE signature_part* RBRACE | LPAREN signature_part* RPAREN
  private static boolean service_member_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_member_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = service_member_2_0(b, l + 1);
    if (!r) r = service_member_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE signature_part* RBRACE
  private static boolean service_member_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_member_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && service_member_2_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // signature_part*
  private static boolean service_member_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_member_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!signature_part(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "service_member_2_0_1", c)) break;
    }
    return true;
  }

  // LPAREN signature_part* RPAREN
  private static boolean service_member_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_member_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && service_member_2_1_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // signature_part*
  private static boolean service_member_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_member_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!signature_part(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "service_member_2_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // dto_in_service | adt_in_service | choice_in_service
  public static boolean signature_inline(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_inline")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNATURE_INLINE, "<signature inline>");
    r = dto_in_service(b, l + 1);
    if (!r) r = adt_in_service(b, l + 1);
    if (!r) r = choice_in_service(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // signature_struct | signature_inline
  public static boolean signature_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNATURE_PART, "<signature part>");
    r = signature_struct(b, l + 1);
    if (!r) r = signature_inline(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // struct_marker EQUAL type_ref
  public static boolean signature_struct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_struct")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNATURE_STRUCT, "<signature struct>");
    r = struct_marker(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && type_ref(b, l + 1);
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
  // KW_IN | KW_OUT | KW_ERR
  public static boolean struct_marker(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_marker")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_MARKER, "<struct marker>");
    r = consumeToken(b, KW_IN);
    if (!r) r = consumeToken(b, KW_OUT);
    if (!r) r = consumeToken(b, KW_ERR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACK type_ref (COMMA type_ref)* RBRACK
  public static boolean type_params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_params")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && type_ref(b, l + 1);
    r = r && type_params_2(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, TYPE_PARAMS, r);
    return r;
  }

  // (COMMA type_ref)*
  private static boolean type_params_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_params_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_params_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_params_2", c)) break;
    }
    return true;
  }

  // COMMA type_ref
  private static boolean type_params_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_params_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type_ref(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // non_generic_type_ref type_params?
  public static boolean type_ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_ref")) return false;
    if (!nextTokenIs(b, "<type ref>", BI_TYPE, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_REF, "<type ref>");
    r = non_generic_type_ref(b, l + 1);
    r = r && type_ref_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_params?
  private static boolean type_ref_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_ref_1")) return false;
    type_params(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // MINUS field_def
  public static boolean unfield_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unfield_def")) return false;
    if (!nextTokenIs(b, MINUS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MINUS);
    r = r && field_def(b, l + 1);
    exit_section_(b, m, UNFIELD_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // MINUS non_generic_type_ref
  public static boolean unparent_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unparent_def")) return false;
    if (!nextTokenIs(b, MINUS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MINUS);
    r = r && non_generic_type_ref(b, l + 1);
    exit_section_(b, m, UNPARENT_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // KW_VERSION string_literal
  public static boolean version(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "version")) return false;
    if (!nextTokenIs(b, KW_VERSION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_VERSION);
    r = r && string_literal(b, l + 1);
    exit_section_(b, m, VERSION, r);
    return r;
  }

}
