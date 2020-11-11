/*
 * 10. Write a program to accept two numbers from the user and determine bigger of the two.

	Expected output:

	Enter the first number num1:
	20
	Enter the second number num2:
	45

	The bigger of the two numbers entered (20 and 45) is: 45
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class BiggestOfTwo {

	public static void main(String[] args) {
		Scanner readVal =new Scanner(System.in);
		System.out.println("Enter the First number num1 :");
		int num1 = readVal.nextInt();
		System.out.println("Enter the Second number num2 :");
		int num2 = readVal.nextInt();
		
		if (num1 > num2) {
			System.out.printf("The bigger of the two numbers entered (%d and %d) is: %d",num1,num2,num1);
		}else {
			System.out.printf("The bigger of the two numbers entered (%d and %d) is: %d",num1,num2,num2);
		}
		readVal.close();

	}

}
