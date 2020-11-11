/*
 * 16.   Write a program to accept a number and determine whether it is a prime number or not.

Expected output:

Enter any number:
9
The entered number 9 is not a prime number

Enter any number:
7
The entered number 7 is a prime number
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int num = readVal.nextInt();
		boolean flag = true;
		
		for(int i=2;i< num/2; i++) {
			
			if(num % i == 0) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.printf("The entered number %d is a prime number",num);
		}else {
			System.out.printf("The entered number %d is not a prime number",num);
		}
		
		
		readVal.close();
	}
}
