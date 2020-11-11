/*
 *  Write a program to generate the first 'N' natural numbers. Accept the value of 'N' from the user.

Expected output:

Enter the number of natural numbers to be generated:
5
First 5 natural numbers are : 1 2 3 4 5
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
		Scanner readVal =new Scanner(System.in);
		
		System.out.println("Enter the number of natural numbers to be generated:");
		int n = readVal.nextInt();
		
		System.out.printf("First %d natural numbers are ",n);
		for(int i= 0;i<n;i++) {
			System.out.printf("%d ",i+1);
		}
		
		readVal.close();

	}

}
