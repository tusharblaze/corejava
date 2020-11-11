/*
 * 45.   Write a program to accept a number from the user and calculate the sum of digits of the number; repeat the operation till the sum gets to be a single digit number.

		Expected output:

		Enter any number:
		9981
		Single digit sum is: 9
		(Hint: 9+9+8+1 = 27; 2+7 = 9)
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class SingleDigitSummation {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int value = readVal.nextInt();
		
		findSummation(value);
		
		readVal.close();

	}
	
	public static void findSummation(int value) {
		int result =0;
		int res =0;
		while(value != 0) {
			res = value % 10 ;
			result +=res;
			value /=10;
		}
		if(String.valueOf(result).length() != 1) {
			findSummation(result);
		}else {
			System.out.println("Single digit sum is: "+result);
		}
	    
		
		
		
	}

}
