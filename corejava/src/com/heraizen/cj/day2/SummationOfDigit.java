/*
 * 42.   Write a program to accept a number from the user and find the sum of digits in the entered number.
Expected output:

Enter any number:
14567
The sum of digits of the entered number is 23 
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class SummationOfDigit {
	
	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int value = readVal.nextInt();
		
		System.out.println("The sum of digits of the entered number is "+findSummation(value));
		
		readVal.close();

	}
	
	public static int findSummation(int value) {
		int result =0;
		int res =0;
		while(value != 0) {
			res = value % 10 ;
			result +=res;
			value /=10;
		}
		return result;
		
	}

}
