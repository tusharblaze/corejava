/*
 * 7.Write a program to accept the billing amount, if it is > 6000 then give a discount of 10% and display the net amount.

	Expected output:

	Enter the billing amount:
	6500
	Your net billing amount: 5850

	Enter the billing amount:
	5500
	Your net billing amount: 5500
 */
package com.heraizen.cj.day1;
import java.util.*;

public class DiscountBilling {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		System.out.println("Enter the billing amount:");
		float billingAmount = readVal.nextFloat();
		
	    if (billingAmount > 6000) {
	    	billingAmount = billingAmount - (billingAmount/10);
	    	System.out.printf("Your net billing amount: %.2f",billingAmount);
	    } else {
	    	System.out.printf("Your net billing amount: %.2f",billingAmount);
	    }

	}

}
