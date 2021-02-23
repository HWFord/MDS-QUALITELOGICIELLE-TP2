package com.tactfactory.tp2tdd;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.tactfactory.tp2tdd.models.Fusee;
import com.tactfactory.tp2tdd.models.Planet;
import com.tactfactory.tp2tdd.utils.GenericNameTest;
import com.tactfactory.tp2tdd.utils.StringUtils;
import org.junit.jupiter.api.Test;

public class PlanetNameTest {

  /**
   * testNameStartWithMajOk test function.
   *
   * @throws Exception to throw.
   */
  @Test
  public void nameStartsWithCaps() throws Exception {
    Planet planet = new Planet();
    planet.setName("AaaaA");
    GenericNameTest.nameStartsWithCaps(planet.getName());
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
    GenericNameTest.nameStartsWithCaps(planet.getName());
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
    GenericNameTest.nameStartsWithCaps(planet.getName());
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
    GenericNameTest.nameStartsWithCaps(planet.getName());
  }

  /**
   * testNameLowerCaseAaaA test function.
   *
   * @throws Exception to throw
   */
  @Test
  public void testNameLowerCaseAaaA() throws Exception {
    Planet planet = new Planet();
    planet.setName("AaaaA");
    GenericNameTest.nameEndsWithLowerCase(planet.getName());
    assertTrue(planet.getName().equals("Aaaaa"));
  }

  /**
   * testNameLowerCaseAAAA test function.
   *
   * @throws Exception to throw
   */
  @Test
  public void testNameLowerCaseAAAA() throws Exception {
    Planet planet = new Planet();
    planet.setName("AAAAA");
    assertTrue(planet.getName().equals("Aaaaa"));
  }

  /**
   * testNameLowerCaseAAAA test function.
   *
   * @throws Exception to throw
   */
  @Test
  public void testNameLowerCaseAa() throws Exception {
    Planet planet = new Planet();
    planet.setName("Aa");
    GenericNameTest.nameEndsWithLowerCase(planet.getName());
  }

  /**
   * testNameNameLowerCaseRandom test function.
   *
   * @throws Exception to throw
   */
  @Test
  public void testNameNameLowerCaseRandom() throws Exception {
	Planet planet = new Planet();
    planet.setName(StringUtils.getRandomString());
    GenericNameTest.nameEndsWithLowerCase(planet.getName());
  }



}

