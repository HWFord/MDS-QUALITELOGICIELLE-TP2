package com.tactfactory.tp2tdd.utils;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenericNameEndsInLowerCase {

	  public static void nameEndsWithLowerCase(String testName) {
		  boolean allLettersLowerCase = true;
		  for (int i = 1; i < testName.length(); i++) {
			  if(testName.charAt(i) >= 65 && testName.charAt(i) <= 90) {
				  allLettersLowerCase = false;
			  }
		  }
		  assertTrue(allLettersLowerCase);
	  }

}
