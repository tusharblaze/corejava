/*
 * 48.   Write a program to accept a four digit number from the user and display its denomination.

Example: 5698
Output: 5*1000 =5000
6*100 =600
9*10 =90
8*1 =8
 */
package com.heraizen.cj.day2;

import java.util.Scanner;

public class DenominationNumber {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter any 4 digit number:");
		int value = readVal.nextInt();
		int res = 0;
		if(String.valueOf(value).length() == 4 ) {
		    
		    for(int i=1;i<=1000;i*=10) {
		    	res = value % 10;
		    	System.out.printf("%d * %d = %d \n",res,i,res*i);
		    	value /=10;
		    }
				
		}else {
			System.out.printf("Entered Wrong Number !!");
		}
		
		
		
		
		readVal.close();

	}

}
