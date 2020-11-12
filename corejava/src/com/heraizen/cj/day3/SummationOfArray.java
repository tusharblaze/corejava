/*
 * 1. Write a program to accept N value and create the array size N. Find the sum of elements in the array.
 */
package com.heraizen.cj.day3;
import java.util.Scanner;

public class SummationOfArray {

	public static void main(String[] args) {
		Scanner readVal =new Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		int[] inputArray = new int[readVal.nextInt()];
		
		System.out.println("Enter the values inside the Array :");
		for (int i=0; i<inputArray.length; i++) {
			inputArray[i] = readVal.nextInt();
		}
		
		System.out.println("The Summation of all values inside the Array : " + findSummation(inputArray));
		
		readVal.close();

	}
	
	public static int findSummation(int[] arr) {
		int totalval = 0;
		for(int j=0; j<arr.length; j++) {
			totalval += arr[j];
		}
		return totalval;
	}

}
