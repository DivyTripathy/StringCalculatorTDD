package com.stringprogram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
	
	@Test
	public void testEmptyStringReturnsZero() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(0, calculator.add(""));
	}

}
