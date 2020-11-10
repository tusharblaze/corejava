/*
 * 6.Write a program to accept a number, if it is negative then covert it to a positive number.

	Expected output:

	Enter a number:
	-10
	The result is: 10 
 */
package com.heraizen.cj.day1;
import java.util.*;

public class ValueConverter {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		System.out.println("Enter a number:");
		int value = readVal.nextInt();
		
	    if (value < 0) {
	    	value = -(value);
	    	System.out.printf("The result is: %d",value);
	    } else {
	    	System.out.printf("The result is: %d",value);
	    }

	}

}
