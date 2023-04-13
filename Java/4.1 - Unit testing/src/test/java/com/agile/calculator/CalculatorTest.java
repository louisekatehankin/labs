package com.agile.calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {

	public Calculator calculator;
	public int calculation1;
	public int calculation2;
	public int calculationInvalid;

	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() {
		calculator = null;
	}

	@Test
	public void subtractionValidInputTest() {

		calculation1 = calculator.subtract("1,1");
		Assert.assertEquals(calculation1, 0);

		calculation2 = calculator.subtract("-2,-2");
		Assert.assertEquals(calculation2, 0);
	}

	@Test
	public void subtractionInvalidInputTest() {

		calculationInvalid = calculator.subtract("1, car");
		Assert.assertEquals(calculationInvalid, -9999);
	}

	@Test
	public void multiplyValidInputTest() {

		calculation1 = calculator.multiply("5,6");
		Assert.assertEquals(calculation1, 30);

		calculation2 = calculator.multiply("-5,-6");
		Assert.assertEquals(calculation2, 30);
	}

	@Test
	public void multiplyInvalidInputTest() {

		calculationInvalid = calculator.multiply("-5,fish");
		Assert.assertEquals(calculationInvalid, -9999);
	}

	@Test
	public void divisionValidInputTest() {

		calculation1 = calculator.divide("25,5");
		Assert.assertEquals(calculation1, 5);

		calculation2 = calculator.subtract("-25,-5");
		Assert.assertEquals(calculation2, 5);
	}

	@Test
	public void divisionInvalidInputTest() {

		calculationInvalid = calculator.divide("25,bat");
		Assert.assertEquals(calculationInvalid, -9999);
	}

	@Test
	public void divisionByZero() {

		ArithmeticException exc = Assertions.assertThrows(ArithmeticException.class, () -> {
			calculationInvalid = calculator.divide("1,0");
		});
		String actualMessage = exc.getMessage();
		String expectedMessage = "/ by zero";
		Assert.assertEquals(actualMessage, expectedMessage);
	}
}
