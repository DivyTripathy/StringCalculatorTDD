package com.stringprogram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
	
	@Test
	public void testMultipleNumbersReturnsSum() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(15, calculator.add("1,2,3,4,5"));
	}

}
