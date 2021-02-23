package com.tactfactory.tp2tdd;

import java.util.Random;
import org.junit.jupiter.api.Test;

import com.tactfactory.tp2tdd.models.Launchpad;
import com.tactfactory.tp2tdd.utils.GenericNameStartWithCapital;

public class LaunchpadNameTest {
  private Random rand = new Random();

  /**
   * test name starts with capital letter
   */

  @Test
  public void testNameStartWithCapsOk() {
    Launchpad launchpad = new Launchpad();
    launchpad.setName(Character.toString((rand.nextInt(26) + 65) % 91));
    GenericNameStartWithCapital.nameStartsWithCaps(launchpad.getName());
  }

}
