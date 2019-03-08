package com.info.domain;

import com.info.interfaces.CalculatorService;

public class BasicCalculator {

	private double x;
	private double y;

	// Dependency
	private CalculatorService calcService;

	// Constructor Dependency Injection
	public BasicCalculator(CalculatorService calcService) {
		this.calcService = calcService;
	}

	// Use the service to calculate the result of addition
	public double add(double x, double y) {
		return calcService.add(x, y);
	}

	// Use the service to calculate the result of subtraction
	public double subtract(double x, double y) {
		return calcService.subtract(x, y);
	}

	// Use the service to calculate the result of multiplication
	public double multiply(double x, double y) {
		return calcService.multiply(x, y);
	}

	// Use the service to calculate the result of division
	public double divide(double x, double y) {
		return calcService.divide(x, y);
	}

	// Use the service to calculate the result of a modulus operation
	public double modulus(double x, double y) {
		return calcService.modulus(x, y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public CalculatorService getCalcService() {
		return calcService;
	}

	public void setCalcService(CalculatorService calcService) {
		this.calcService = calcService;
	}

}