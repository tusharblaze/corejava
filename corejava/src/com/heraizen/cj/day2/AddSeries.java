/*
 * 22.   Write a program to accept a number “n” from the user; then display the sum of the series 1+1/2+1/3+……….+1/n.
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class AddSeries {

	public static void main(String[] args) {
		
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int value = readVal.nextInt();
		float result= 1.0f;
		
		for(int i=2;i<=value;i++) {
			result = result + (float)1 / i;
		}
		
		System.out.printf("The sum of the series is: %f ",result);
		
		readVal.close();
	}

}
