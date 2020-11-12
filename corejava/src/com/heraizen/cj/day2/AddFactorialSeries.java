/*
 * 54.   Write a program to add the first 7 terms of the following series using a for loop:
1/1!+2/2!+3 /3!+....
 */
package com.heraizen.cj.day2;

public class AddFactorialSeries {

	public static void main(String[] args) {
		
		float totalValue = 1.0f;
		for(int i=2;i<=7; i++) {
			totalValue +=(float)1/getFactorial(i);
		}
		
		System.out.println("Addition of the first 7 term of the series 1/1!+2/2!+3 /3!+.... is : "+totalValue);

	}
	
	public static int getFactorial(int val) {
		int factVal =1;
		
		for(int i=2;i<=val;i++ ) {
			factVal*=i;
		}
		
		return factVal;
	}

}
