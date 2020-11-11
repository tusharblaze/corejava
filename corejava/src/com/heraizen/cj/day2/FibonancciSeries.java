/*
 * 19.   Write a program to accept a number and print the Fibonacci series up to the entered number.

Expected output:

Enter the upper bound number to generate the Fibonacci numbers:
8
Fibonacci series up to the entered number is: 0 1 1 2 3 5 8
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class FibonancciSeries {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter the lower bound value:");
		int upperBound = readVal.nextInt();
		int a = 0;
		int b = 1;
		int c;
		System.out.printf("Enter the lower bound value: %d %d",a,b);
		for(int i=0; i < upperBound ; i++ ) {
			c= a + b;
			a = b;
			b = c;
			
			if(c <= upperBound) {
				System.out.printf(" %d",c);
			}else {
				break;
			}
		}
		
		readVal.close();
		
		
	}

}
