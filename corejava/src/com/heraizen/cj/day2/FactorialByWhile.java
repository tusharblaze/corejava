/*
 * 47.   Write a program to accept a number and find the factorial of the number (using while loop).
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class FactorialByWhile {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int value = readVal.nextInt();
		int temValue = value;
		int result = 1;
		while(value != 1) {
			result *=value;
			value--;
		}
		
		System.out.printf("Factorial of %d is %d",temValue,result);
		
		readVal.close();

	}

}
