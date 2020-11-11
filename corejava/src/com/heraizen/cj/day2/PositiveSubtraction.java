/*
 * Write a program to accept two numbers num1 and num2; when one is subtracted from the other, the result should always be a positive number.

	Expected output:

	Enter the first number num1:
	35
	Enter the second number num2:
	45
	The result (difference) is: 10

	Enter the first number num1:
	45
	Enter the second number num2:
	35
	The result (difference) is: 15
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class PositiveSubtraction {
	
	public static void main(String... args) {
		Scanner readVal = new Scanner(System.in);
		System.out.println("Enter the first number num1:");
		int num1 = readVal.nextInt();
		System.out.println("Enter the Second number num2:");
		int num2 = readVal.nextInt();
		int evaluatedValue = (num1 - num2) < 0 ? -(num1 - num2):(num1 - num2);
		System.out.printf("The result (difference) is: %d",evaluatedValue);
		
		readVal.close();
	}

}
