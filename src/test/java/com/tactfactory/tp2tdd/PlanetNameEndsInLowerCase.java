package com.tactfactory.tp2tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.tactfactory.tp2tdd.models.Planet;
import com.tactfactory.tp2tdd.utils.GenericNameEndsInLowerCase;
import com.tactfactory.tp2tdd.utils.GenericNameStartWithCapital;
import com.tactfactory.tp2tdd.utils.StringUtils;

public class PlanetNameEndsInLowerCase {
	  /**
	   * testNameLowerCaseAaaA test function.
	   *
	   * @throws Exception to throw
	   */
	  @Test
	  public void testNameLowerCaseAaaA() throws Exception {
	    Planet planet = new Planet();
	    planet.setName("AaaaA");
	    GenericNameEndsInLowerCase.nameEndsWithLowerCase(planet.getName());
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
	    GenericNameEndsInLowerCase.nameEndsWithLowerCase(planet.getName());
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
	    GenericNameEndsInLowerCase.nameEndsWithLowerCase(planet.getName());
	  }
}
