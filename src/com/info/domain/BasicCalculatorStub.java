package com.info.domain;

import com.info.interfaces.CalculatorService;

public class BasicCalculatorStub implements CalculatorService {

	@Override
	public double add(double x, double y) {
		return x + y;
	}

	@Override
	public double subtract(double x, double y) {
		return x - y;
	}

	@Override
	public double multiply(double x, double y) {
		return x * y;
	}

	@Override
	public double divide(double x, double y) {
		return x / y;
	}

	@Override
	public double modulus(double x, double y) {
		return x % y;
	}

}