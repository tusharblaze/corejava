/*
 * 2. Write a program to accept N value and create the array size N. Find the biggest and the smallest   elements in the array
 */
package com.heraizen.cj.day3;
import com.heraizen.cj.day3.ArrayDemo;

import java.util.Scanner;

public class BiggestAndSmallest {

	public static void main(String[] args) {
		Scanner readVal =new Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		int[] inputArray = new int[readVal.nextInt()];
		
		System.out.println("Enter the values inside the Array :");
		for (int i=0; i<inputArray.length; i++) {
			inputArray[i] = readVal.nextInt();
		}
		
		System.out.println("The Biggest of all values inside the Array : " + ArrayDemo.findBiggest(inputArray));
		System.out.println("The Smallest of all values inside the Array : " + ArrayDemo.findSmallest(inputArray));
		
        readVal.close();
	}
	
//	public static int findBiggest(int[] arr) {
//		int maxVal = arr[0];
//		for(int i=0; i<arr.length; i++) {
//			if(maxVal <= arr[i]) {
//				maxVal= arr[i];
//			}
//		}
//		return maxVal;
//	}
//	
//	public static int findSmallest(int[] arr) {
//		int minVal = arr[0];
//		for(int i=0; i<arr.length; i++) {
//			if(minVal >= arr[i]) {
//				minVal= arr[i];
//			}
//		}
//		return minVal;
//	}

}
