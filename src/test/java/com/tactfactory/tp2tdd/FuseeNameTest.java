package com.tactfactory.tp2tdd;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class FuseeNameTest {

  private Random rand = new Random();

  /**
   * test name starts with capital letter
   */

  @Test
  public void testNameStartWithCapsOk() {
    Fusee fusee = new Fusee();
    fusee.setName(Character.toString((rand.nextInt(26) + 65) % 91));
    GenericNameTest.nameStartsWithCaps(fusee.getName());
  }

  /**
   * test name starts with lowercase letter
   */

  @Test
  public void testNameStartWithCapsKo() {
	Fusee fusee = new Fusee();
    String c = Character.toString(rand.nextInt(126 - 32) + 32);
    if ((char) c.charAt(0) >= 65 && (char) c.charAt(0) <= 90) {
      c = c + 26;
    }
    fusee.setName(c);
    GenericNameTest.nameStartsWithLower(fusee.getName());
  }


}
