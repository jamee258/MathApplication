package com.info.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.info.domain.BasicCalculator;
import com.info.domain.BasicCalculatorStub;
import com.info.interfaces.CalculatorService;

class BasicCalculatorTests {

	private BasicCalculator calculator;
	private CalculatorService calcService;

	@BeforeEach
	void setUp() throws Exception {
		calcService = new BasicCalculatorStub();
		calculator = new BasicCalculator(calcService);
	}

	@Test
	void testAddition() {
		// Arrange
		double x = 5;
		double y = 2;

		double expectedValue = 7;

		// Act
		double actualValue = calculator.add(x, y);

		// Assert
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testSubtraction() {
		// Arrange
		double x = 5;
		double y = 2;

		double expectedValue = 3;

		// Act
		double actualValue = calculator.subtract(x, y);

		// Assert
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testMultiplication() {
		// Arrange
		double x = 5;
		double y = 2;

		double expectedValue = 10;

		// Act
		double actualValue = calculator.multiply(x, y);

		// Assert
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testDivision() {
		// Arrange
		double x = 10;
		double y = 5;

		double expectedValue = 2;

		// Act
		double actualValue = calculator.divide(x, y);

		// Assert
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testModulus() {
		// Arrange
		double x = 10;
		double y = 3;

		double expectedValue = 1;

		// Act
		double actualValue = calculator.modulus(x, y);

		// Assert
		assertEquals(expectedValue, actualValue);
	}

}