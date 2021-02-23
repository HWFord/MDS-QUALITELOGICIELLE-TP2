package com.tactfactory.tp2tdd;

import java.util.Random;

import org.junit.jupiter.api.Test;

import com.tactfactory.tp2tdd.models.Fusee;
import com.tactfactory.tp2tdd.utils.GenericNameTest;

public class FuseeNameTest {

  private Random rand = new Random();

  /**
   * test name starts with capital letter
   * using only capital letters in string
   */

  @Test
  public void testNameStartWithCapsOk() {
    Fusee fusee = new Fusee();
    fusee.setName("A");
//    fusee.setName(Character.toString((rand.nextInt(26) + 65) % 91));
//    System.out.println("Capitals " + fusee.getName());
    GenericNameTest.nameStartsWithCaps(fusee.getName());
  }

  /**
   * test name starts with lowercase letter
   * using only lower case letters in string
   */

  @Test
  public void testNameStartWithCapsKo() {
    Fusee fusee = new Fusee();
    String c = Character.toString(rand.nextInt(126 - 32) + 32);
    if ((char) c.charAt(0) >= 65 && (char) c.charAt(0) <= 90) {
      c = c + 26;
    }
    fusee.setName(c);
    System.out.println("Lowercase " + fusee.getName());
    GenericNameTest.nameStartsWithCaps(fusee.getName());
  }

  /**
   * test name starts with Capital letter
   * using both letter cases
   */

  @Test
  public void testNameCaptialLetter() {
    int n = rand.nextInt(20);
    String name = "";

      for (int i = 0; i < n; i++) {
        String c = Character.toString(rand.nextInt(126 - 32) + 32);
        name = name.concat(c);
        while((char) name.charAt(0) <= 64 && (char) name.charAt(0) >= 91
        		&& name != null) {
        	c = Character.toString(rand.nextInt(126 - 32) + 32);
        }
      }
      Fusee fusee = new Fusee();
      fusee.setName(name);
      System.out.println(fusee.getName());
      GenericNameTest.nameStartsWithCaps(fusee.getName());


  }
}
