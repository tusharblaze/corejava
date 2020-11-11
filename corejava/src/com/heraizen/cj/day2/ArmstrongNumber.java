/*
 * 44.   Write a program to accept a number from the user and determine whether it is an Armstrong number or not.
(Example: 153 is an Armstrong number 1^3 + 5 ^3 +3 ^3 =153)
 */
package com.heraizen.cj.day2;
import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int value = readVal.nextInt();
		
		if(findArmstrong(value,String.valueOf(value).length())) {
			System.out.printf("The %d number is Armstrong Number",value);
		}else {
			System.out.printf("The %d number is not a Armstrong Number",value);
		}
		
		readVal.close();
	}
	
	public static boolean findArmstrong(int value,int length) {
		int result =0;
		int res =0;
		int tempValue = value; 
		while(value != 0) {
			res = value % 10 ;
			result = result + (int) Math.pow(res, length);
			value /=10;
		}
		if(result == tempValue) {
			return true;
		}else {
			return false;
		}
		
	}

}
