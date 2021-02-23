package com.tactfactory.tp2tdd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GenericNameTest {

  /*
   * Test rocket has a name
   */
//  @Test
//  public void hasNameTest(){
//    if(!Fusee.getName()){
//      assertFalse(false);
//    }
//  }

  /**
   * Names starts with capital letter
   * return true
   *
   * Test first letter of name is capital
   * Letter in ASCI table
   * Usable letters are between 65 and 90
   * Other letters are 32-64 and 91-126
   */

  public static void nameStartsWithCaps(String testFirstLetter) {
//    for (int i = 65; i <= 90; i++) {
//    String testFirstLetter = Character.toString(i);
//    assertTrue(testFirstLetter.charAt(0) >= 65 && testFirstLetter.charAt(0) <= 90);
//  }
    assertTrue(testFirstLetter.charAt(0) >= 65 && testFirstLetter.charAt(0) <= 90);
  }

  /**
   *Name starts with lower case
   *return false
   *test if first letter is a lower case
   *between 32-64 and 91-126 on ASCI table
   */

  public static void nameStartsWithLower(String testFirstLetter) {

//    for (int i = 32; i <= 64; i++) {
//      String testFirstLetter1 = Character.toString(i);
//      assertFalse(testFirstLetter1.charAt(0) >= 65 && testFirstLetter.charAt(0) <= 90);
//    }
//
//    for (int i = 91; i <= 126; i++) {
//      String testFirstLetter2 = Character.toString(i);
//      assertFalse(testFirstLetter2.charAt(0) >= 65 && testFirstLetter.charAt(0) <= 90);
//    }

    assertFalse(testFirstLetter.charAt(0) < 65 && testFirstLetter.charAt(0) > 90);
  }

}
