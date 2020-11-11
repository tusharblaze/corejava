/*
 * 46.   Write a program to accept a number from the user and count the number of prime digits.

Expected output:

Enter any number:
97512
Number of prime digits in the entered number is 3 
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class PrimeDigit {

	public static void main(String[] args) {
		
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int value = readVal.nextInt();
		
		getSingleDigit(value);
		
		readVal.close();

	}
	
	public static void getSingleDigit(int value) {
		int res =0;
		int count =0;
		while(value != 0) {
			res = value % 10 ;
			count += checkPrimeOrNot(res);
			value /=10;
		}
		System.out.println("Number of prime digits in the entered number is "+count);
	}
	
	public static int checkPrimeOrNot(int value) {
		boolean flag =true;
		for(int i=2; i <= value/2 ;i++) {
			if(value % i == 0) {
				flag = false;
				break;
			}
			
		}
		if(flag && value != 1) {
			return 1;
		}else {
			return 0;
		}
	}

}
