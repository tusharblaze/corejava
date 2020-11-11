/*
 * 1.Write a program to accept two numbers from the user, calculate the sum and display the same.

     Expected output:

     Enter the num1 value:
     10
     Enter the num2 value:
     20
     Sum of 10 and 20 is 30
 */

package com.heraizen.cj.day1;
import java.util.*;


public class AdditionOfNumbers {
	
	public static void main(String... args) {
		Scanner src = new Scanner(System.in);
		System.out.print("Enter the num1 value: ");
		int num1 = src.nextInt();
		System.out.print("Enter the num2 value: ");
		int num2 = src.nextInt();
		System.out.printf("Sum of %d and %d is %d",num1,num2,num1+num2);
		src.close();
	}

}
