/*
 * 4.Write a program to accept two numbers from the user, swap their values and display the result.

	Expected output:

	Enter the first number num1:
	100
	Enter the second number num2:
	200
	Before swap, the values of num1=100 and num2=200
	After swap, the values of num1=200 and num2=100
 */
package com.heraizen.cj.day1;
import java.util.*;

public class ValueSwap {
 
	public static void main(String... args) {
		Scanner readVal = new Scanner(System.in);
		System.out.println("Enter the first number num1:");
		int num1 = readVal.nextInt();
		System.out.println("Enter the first number num2:");
		int num2 = readVal.nextInt();
		System.out.printf("Before swap, the values of num1=%d and num2=%d\n",num1,num2);
		int temp = num1;
		num1 = num2;
		num2 =temp;
		System.out.printf("\nAfter swap, the values of num1=%d and num2=%d",num1,num2);
	}
}
