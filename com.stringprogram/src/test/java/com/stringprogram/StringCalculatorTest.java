package com.stringprogram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
	
	@Test
	public void testTwoNumbersReturnsSum() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(3, calculator.add("1,2"));
	}

}
