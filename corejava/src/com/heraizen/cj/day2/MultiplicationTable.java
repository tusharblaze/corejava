/*
 * 20.   Write a program to accept a number from the user and print its multiplication table (upto “times 10”).

Expected output:

Enter the number to generate its multiplication table:
19
Multiplication table for 19 is :
19 * 1 = 19
19 * 2 = 38
…..............
…..............
19* 10 = 190
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter the number to generate its multiplication table:");
		int value = readVal.nextInt();
		
		System.out.printf("Multiplication table for %d is : \n",value);
		for(int i = 1; i<= 10; i++) {
		   System.out.printf("%d * %d = %d\n",value,i,value*i);
		}
		
		readVal.close();

	}

}
