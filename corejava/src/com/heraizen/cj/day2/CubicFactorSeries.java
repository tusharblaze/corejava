/*
 * 24.   Write a program to accept a number “n” from the user; find the sum of the series 1/2^3+1/3^3+1/4^3……..+1/n^3
 */
package com.heraizen.cj.day2;
import java.util.Scanner;
import java.lang.Math;



public class CubicFactorSeries {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int value = readVal.nextInt();
		double result = 1.0d;
		
		for(int i=2;i<=value;i++) {
			result = result + (float)1 / Math.pow(i, 3);
		}
		
		System.out.printf("The sum of the series is: %f ",result);
		
		readVal.close();
	}

}
