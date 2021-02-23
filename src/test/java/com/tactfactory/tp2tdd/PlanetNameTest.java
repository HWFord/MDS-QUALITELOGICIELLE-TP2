package com.tactfactory.tp2tdd;

import java.util.Random;
import org.junit.jupiter.api.Test;

public class PlanetNameTest {
  private Random rand = new Random();

  /**
   * test name starts with capital letter
   */

  @Test
  public void testNameStartWithCapsOk() {
    Planet planet = new Planet();
    planet.setName(Character.toString((rand.nextInt(26) + 65) % 91));
    GenericNameTest.nameStartsWithCaps(planet.getName());
  }

  /**
   * test name starts with lowercase letter
   */

  @Test
  public void testNameStartWithCapsKo() {
	Planet planet = new Planet();
    String c = Character.toString(rand.nextInt(126 - 32) + 32);
    if ((char) c.charAt(0) >= 65 && (char) c.charAt(0) <= 90) {
      c = c + 26;
    }
    planet.setName(c);
    GenericNameTest.nameStartsWithCaps(planet.getName());
  }
}
