/*
 * 5.Write a program to accept the principal amount, rate of interest, time and calculate the simple interest.

	Expected output:

	Enter the principal amount:
	20000
	Enter the rate of interest
	1.5
	Enter the time (years)
	2

Simple interest is 600

 */

package com.heraizen.cj.day1;
import java.util.*;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		int principleAmount = readVal.nextInt();
		System.out.println("Enter the rate of interest:");
		float rateOfInterest = readVal.nextFloat();
		System.out.println("Enter the principal amount:");
		int timeInYear = readVal.nextInt();
		
		float simpleInterest = (principleAmount * timeInYear * rateOfInterest) / 100;
        
		System.out.printf("\nSimple interest is %.2f",simpleInterest);
	}

}
