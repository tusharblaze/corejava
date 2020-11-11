/*
 * 21.   Write a program to accept a number and find its factorial.

Expected output:

Enter any number:
5
The factorial of 5 is 120
(Hint: 5! = 5 * 4 * 3 * 2 * 1)
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class FactorialOfNumber {
	
	public static void main(String... args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int value = readVal.nextInt();
		int result= 1;
		
		for(int i=2;i<=value;i++) {
			result *= i;
		}
		
		System.out.printf("The factorial of %d is %d",value,result);
		readVal.close();
	}

}
