package com.tactfactory.tp2tdd;

import org.junit.jupiter.api.Test;

import com.tactfactory.tp2tdd.models.Planet;
import com.tactfactory.tp2tdd.utils.GenericNameAllowsHyphen;
import com.tactfactory.tp2tdd.utils.StringUtils;

public class PlanetNameAllowsHyphen {
	  /**
	   * testNameStartWithMajRandom test function.
	   *
	   * @throws Exception to throw
	   */
	  @Test
	  public void testNameHasHyphen() throws Exception {
		Planet planet = new Planet();
	    planet.setName("Aa-a");
	    GenericNameAllowsHyphen.nameHasHyphen(planet.getName());
	  }
}
