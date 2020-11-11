/*
 * 23.   Write a program to accept a number “n” from the user; then display the series 1,3,5,7,9,…,n and
 *       find the sum of the numbers in this series.
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class OddSeries {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter the upper bound:");
		int value = readVal.nextInt();
		int result = 0;
		
		System.out.printf("The given Series is: ");
		for (int i=1; i<=value;i+=2) {
			System.out.printf(" %d",i);
			result += i;
		}
		
		System.out.printf("\nThe sum of the numbers in this series: %d",result);
	
		
		readVal.close();

	}

}
