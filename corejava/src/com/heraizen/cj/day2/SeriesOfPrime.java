/*
 * 18.Write a program to accept the lower bound number and the upper bound number from the user and print the prime numbers between them.

Expected output:

Enter the lower bound value:
5
Enter the upper bound value:
15
The prime numbers between 5 and 15 are: 5 7 11 13 
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class SeriesOfPrime {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter the lower bound value:");
		int lowerBound = readVal.nextInt();
		
		System.out.println("Enter the upper bound value:");
		int upperBound = readVal.nextInt();
		
		boolean flag = true;
		
		System.out.printf("The prime numbers between %d and %d are:",lowerBound,upperBound);
		for(int i=lowerBound; i<=upperBound;i++) {
			flag = true;
			
			for(int j=2;j<= i/2;j++) {
				
				if (i % j == 0 ) {
					flag =false;
					break;
				}
			}
			
			if(flag && i != 1) {
				System.out.printf(" %d",i);
			}
		}
		
		readVal.close();
		
		
		
	}

}
