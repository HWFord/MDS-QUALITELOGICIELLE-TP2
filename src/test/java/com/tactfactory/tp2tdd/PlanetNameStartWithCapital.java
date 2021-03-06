package com.tactfactory.tp2tdd;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.tactfactory.tp2tdd.models.Fusee;
import com.tactfactory.tp2tdd.models.Planet;
import com.tactfactory.tp2tdd.utils.GenericNameEndsInLowerCase;
import com.tactfactory.tp2tdd.utils.GenericNameStartWithCapital;
import com.tactfactory.tp2tdd.utils.StringUtils;
import org.junit.jupiter.api.Test;

public class PlanetNameStartWithCapital {

  /**
   * testNameStartWithMajOk test function.
   *
   * @throws Exception to throw.
   */
  @Test
  public void nameStartsWithCaps() throws Exception {
    Planet planet = new Planet();
    planet.setName("AaaaA");
    GenericNameStartWithCapital.nameStartsWithCaps(planet.getName());
  }

  /**
   * testNameStartWithMajKo test function.
   *
   * @throws Exception to throw.
   */
  @Test
  public void testNameStartWithMajKo() throws Exception {
	Planet planet = new Planet();
    planet.setName("aAAAa");
    GenericNameStartWithCapital.nameStartsWithCaps(planet.getName());
  }

  /**
   * testNameStartWithMajNull test function.
   */
  @Test
  public void testNameStartWithMajNull() {
	Planet planet = new Planet();
    assertThrows(Exception.class, () -> {
    planet.setName(null);
    });
  }

  /**
   * testNameStartWithMajEmpty test function.
   */
  @Test
  public void testNameStartWithMajEmpty() {
	Planet planet = new Planet();
    assertThrows(Exception.class, () -> {
    planet.setName("");
    });
  }

  /**
   * testNameStartWithMajOneChar test function.
   *
   * @throws Exception to throw.
   */
  @Test
  public void testNameStartWithMajOneChar() throws Exception {
	Planet planet = new Planet();
    planet.setName("a");
    GenericNameStartWithCapital.nameStartsWithCaps(planet.getName());
  }

  /**
   * testNameStartWithMajOneCharWitha test function.
   *
   * @throws Exception to throw.
   */
  @Test
  public void testNameStartWithMajOneCharWitha() throws Exception {
	Planet planet = new Planet();
    planet.setName("a");
    assertTrue(planet.getName().equals("A"));
  }

  /**
   * testNameStartWithMajOneCharWithA test function.
   *
   * @throws Exception to throw.
   */
  @Test
  public void testNameStartWithMajOneCharWithA() throws Exception {
    Planet planet = new Planet();
    planet.setName("A");
    assertTrue(planet.getName().equals("A"));
  }

  /**
   * testNameStartWithMajOneCharWithabcdef test function.
   *
   * @throws Exception to throw.
   */
  @Test
  public void testNameStartWithMajOneCharWithabcdef() throws Exception {
    Planet planet = new Planet();
    planet.setName("abcdef");
    assertTrue(planet.getName().equals("Abcdef"));
  }

  /**
   * testNameStartWithMajOneCharWithAbcdef test function.
   *
   * @throws Exception to throw.
   */
  @Test
  public void testNameStartWithMajOneCharWithAbcdef() throws Exception {
	Planet planet = new Planet();
    planet.setName("Abcdef");
    assertTrue(planet.getName().equals("Abcdef"));
  }

  /**
   * testNameStartWithMajRandom test function.
   *
   * @throws Exception to throw
   */
  @Test
  public void testNameStartWithMajRandom() throws Exception {
	Planet planet = new Planet();
    planet.setName(StringUtils.getRandomString());
    GenericNameStartWithCapital.nameStartsWithCaps(planet.getName());
  }





}

