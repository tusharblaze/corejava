/*
 * Write a program to generate the first 'N' natural numbers and print them in descending order.

Expected output:

Enter the number of natural numbers to be generated:
5
The first 5 natural numbers in descending order are: 5 4 3 2 1
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class DescendingSeries {

	public static void main(String[] args) {
		
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter the number of natural numbers to be generated:");
		int num = readVal.nextInt();
		System.out.printf("The first %d natural numbers in descending order are:",num);
		
		for(int i = num;i > 0 ; i--) {
			System.out.printf("%d ",i);
		}
		
		readVal.close();

	}

}
