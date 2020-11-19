package com.heraizen.cj.day7.mathematicalOperations;

public class MyNumber {

	int firstNumber;
	int secondNumber;

	public MyNumber(int x, int y) {

		firstNumber = x;
		secondNumber = y;

	}

	public int add() {
		return (firstNumber + secondNumber);
	}

	public int sub() {
		return (firstNumber - secondNumber);
	}

	public int mul() {
		return (firstNumber * secondNumber);
	}

	public double div() {
		try {
			return (firstNumber /(double) secondNumber);
		} catch (ArithmeticException e) {
			System.out.println("\nNumerator "+ firstNumber +" cannot be "+e.getMessage());
			return 0.0d;
		}

	}
}
