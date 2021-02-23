package com.tactfactory.tp2tdd.utils;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenericNameAllowsHyphen {

	public static void nameHasHyphen(String testName) {
		  boolean allowsHypen = true;
		  for (int i = 1; i < testName.length(); i++) {
			  if(testName.charAt(i) <= 47
					  || testName.charAt(i) >= 58 && testName.charAt(i) <= 64
					  || testName.charAt(i) > 90){
				  if(testName.charAt(i) != 45) {
					  allowsHypen = false;
				  }
			  }
		  }
		  assertTrue(allowsHypen);
	  }
}