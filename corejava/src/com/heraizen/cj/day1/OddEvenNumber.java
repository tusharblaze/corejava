/*
 *   Write a program to accept a number from the user and determine whether it is even or odd.

	Expected output:

	Enter a number:
	15
	The entered number 15 is odd

	Enter a number
	10
	The entered number 10 is even
 */
package com.heraizen.cj.day1;
import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		System.out.println("Enter a number :");
		int value = readVal.nextInt();
		
		if (value % 2 == 0 ) {
			System.out.printf("The entered number %d is even\n",value);
		}else {
			System.out.printf("The entered number %d is odd\n",value);
		}
		readVal.close();
	}

}
