package com.agile.calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	private final Calculator calculator = new Calculator();
	private int expected;
	private int actual;

	@Test
	public void subtractPositiveValidInputTest() {
		expected = 2;
		actual = calculator.subtract("5,3");
		assertEquals(expected, actual);
		actual = calculator.subtract("4,2");
		assertEquals(expected, actual);
	}

	@Test
	public void subtractNegativeValidInputTest() {
		expected = -2;
		actual = calculator.subtract("-5,-3");
		assertEquals(expected, actual);
	}

	@Test
	public void dividePositiveValidInputTest() {
		expected = 5;
		actual = calculator.divide("10,2");
		assertEquals(expected, actual);
	}
	@Test
	public void divideNegativeValidInputTest() {
		expected = -5;
		actual = calculator.divide("10,-2");
		assertEquals(expected, actual);
	}
	@Test
	public void multiplyValidPositiveInputTest() {
		expected = 50;
		actual = calculator.multiply("25,2");
		assertEquals(expected, actual);
	}
	@Test
	public void multiplyValidLargePositiveInputTest() {
		expected = 600;
		actual = calculator.multiply("150,4");
		assertEquals(expected, actual);
	}
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void divideWithInvalidInputTest() {
		calculator.divide("10,0");
	}

}
