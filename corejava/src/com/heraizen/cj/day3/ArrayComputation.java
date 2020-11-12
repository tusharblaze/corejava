/*
 * 3. Write a program that allows you to create an integer array of 18 elements with the following values: 
 *    int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,2,0,0,0,}. The program computes the sum of element 0 to 14 and stores 
 *    it at element 15, computes the average and stores it at element 16 and identifies the smallest value from 
 *    the array and stores it at element 17.
 */
package com.heraizen.cj.day3;
import java.util.Arrays;

public class ArrayComputation {

	public static void main(String[] args) {
		int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,2,0,0,0,};
		int totalSummation= 0;
		int smallestNum = A[0];
		for(int i=0; i<A.length; i++) {
			if(A[i] !=0) {
				totalSummation += A[i];
				if(smallestNum <= A[i]) {
					smallestNum = A[i];
				}
			}else if(i == 14) {
				A[i] = totalSummation;
			}else if(i == 15) {
				A[i] = totalSummation / 14;
			}else if(i == 16) {
				A[i] = smallestNum;
			}
		}
		
		System.out.println("Evaluated Arrays is : "+Arrays.toString(A));

	}

}
