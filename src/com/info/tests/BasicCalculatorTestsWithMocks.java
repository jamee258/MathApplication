package com.info.tests;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.easymock.EasyMockSupport;
import org.junit.Before;
import org.junit.Test;

import com.info.domain.BasicCalculator;
import com.info.interfaces.CalculatorService;

public class BasicCalculatorTestsWithMocks {

	private BasicCalculator calculator;
	private CalculatorService mockService;
	private EasyMockSupport support = new EasyMockSupport();

	@Before
	public void setUp() throws Exception {
		mockService = support.createMock(CalculatorService.class);
		calculator = new BasicCalculator(mockService);
	}

	@Test
	public void testAddition() {
		double expectedResult = 25;
		double x, y;
		x = 10;
		y = 15;

		// Record the behaviour expected on the mock i.e add 2 numbers
		EasyMock.expect(mockService.add(x, y)).andReturn(new Double(expectedResult));
		EasyMock.expectLastCall().atLeastOnce();

		// Activates the mock
		EasyMock.replay(mockService);

		// Assert - test that the functionality works
		double actualResult = calculator.add(x, y);
		assertEquals(actualResult, expectedResult, 0);

		// Verify that a call to mockService is made
		EasyMock.verify(mockService);
	}

	@Test
	public void testSubtraction() {
		double expectedResult = 5;
		double x, y;
		x = 15;
		y = 10;
		EasyMock.expect(mockService.subtract(x, y)).andReturn(new Double(expectedResult));
		EasyMock.expectLastCall().atLeastOnce();

		EasyMock.replay(mockService);

		double actualResult = calculator.subtract(x, y);
		assertEquals(actualResult, expectedResult, 0);

		EasyMock.verify(mockService);
	}

}