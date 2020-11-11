/*
 * 13.   Write a program to accept 3 numbers from the user and find the biggest of them.

Expected output:

Enter the 1st number num1:
45
Enter the 2nd number num2:
75
Enter the 3rd number num3:
45
The biggest of the 3 numbers entered is: 75
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class BiggestInThree {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter the 1st number num1:");
		int num1 = readVal.nextInt();
		
		System.out.println("Enter the 2nd number num2:");
		int num2 = readVal.nextInt();

		System.out.println("Enter the 3rd number num3:");
		int num3 = readVal.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.printf("The biggest of the 3 numbers entered is: %d",num1);
		}else if(num2 > num3) {
			System.out.printf("The biggest of the 3 numbers entered is: %d",num2);
		}else {
			System.out.printf("The biggest of the 3 numbers entered is: %d",num3);
		}
		readVal.close();
		

	}

}
