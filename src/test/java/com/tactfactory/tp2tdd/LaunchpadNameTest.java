package com.tactfactory.tp2tdd;

import java.util.Random;
import org.junit.jupiter.api.Test;

import com.tactfactory.tp2tdd.models.Launchpad;
import com.tactfactory.tp2tdd.utils.GenericNameTest;

public class LaunchpadNameTest {
  private Random rand = new Random();

  /**
   * test name starts with capital letter
   */

  @Test
  public void testNameStartWithCapsOk() {
    Launchpad launchpad = new Launchpad();
    launchpad.setName(Character.toString((rand.nextInt(26) + 65) % 91));
    GenericNameTest.nameStartsWithCaps(launchpad.getName());
  }

  /**
   * test name starts with lowercase letter
   */

  @Test
  public void testNameStartWithCapsKo() {
	Launchpad launchpad = new Launchpad();
    String c = Character.toString(rand.nextInt(126 - 32) + 32);
    if ((char) c.charAt(0) >= 65 && (char) c.charAt(0) <= 90) {
      c = c + 26;
    }
    launchpad.setName(c);
    GenericNameTest.nameStartsWithLower(launchpad.getName());
  }
}
