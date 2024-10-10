package com.stringprogram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
	
	@Test
	public void testSingleNumberReturnsValue() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(1, calculator.add("1"));
	}

}
