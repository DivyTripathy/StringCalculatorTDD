package com.stringprogram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
	
	@Test
	public void testNegativeNumbersThrowsException() {
		StringCalculator calculator = new StringCalculator();
		Exception exception = org.junit.jupiter.api.Assertions.assertThrows(
		        IllegalArgumentException.class, () -> calculator.add("1,-2,3"));
		    assertEquals("negative numbers not allowed: -2", exception.getMessage());
	}
	
	@Test
	public void testMultipleNegativeNumbersThrowsException() {
	    StringCalculator calculator = new StringCalculator();
	    Exception exception = org.junit.jupiter.api.Assertions.assertThrows(
	        IllegalArgumentException.class, () -> calculator.add("1,-2,-3,4"));
	    assertEquals("negative numbers not allowed: -2, -3", exception.getMessage());
	}


}
