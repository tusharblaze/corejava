/*
 * 41.    Write a program to accept a number from the user and count the number of digits in the number.

Expected output:

Enter any number:
14567
The number of digits in the entered number is 5 
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class DigitCalculation {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int value = readVal.nextInt();
		String valueBound = String.valueOf(value);
		System.out.println("The number of digits in the entered number is "+valueBound.length());
		
		readVal.close();

	}

}
