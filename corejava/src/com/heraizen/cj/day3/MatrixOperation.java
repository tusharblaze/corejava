/*
 *  5. Write a program that accepts M x N matrix and
			1. Find the sum of elements in the matrix
			2. Biggest element in the matrix
			3. Diagonal sum of the matrix
			4. Transpose of the given matrix
 */
package com.heraizen.cj.day3;
import com.heraizen.cj.day3.ArrayDemo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MatrixOperation {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter the number of row in an Matrix ");
		int M = readVal.nextInt();
		
		System.out.println("Enter the number of column in an Matrix ");
		int N = readVal.nextInt();
		
		int[][] newArray = new int[M][N];
		
		System.out.println("Allocating the values inside the Matrix ...\n");
		
		for(int i=0; i<newArray.length; i++) {
			for(int j=0; j<newArray[i].length; j++) {
				newArray[i][j] = ThreadLocalRandom.current().nextInt(1,51);
			}
			
		}
		System.out.println("The give Matrix is :");
		
		for(int[] arr:newArray) {
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("\nThe sum of elements in the matrix :"+ArrayDemo.findMatrixSummation(newArray, M, N));
		System.out.println("Biggest element in the matrix :"+ArrayDemo.findMatrixBiggest(newArray, M, N));
		System.out.println("Diagonal sum of the matrix :"+ArrayDemo.summationDigonalMatrix(newArray, M, N));
		System.out.println("Transpose of the matrix is :");
		
		for(int[] arr:ArrayDemo.transposeOfMatrix(newArray, M, N)) {
			System.out.println(Arrays.toString(arr));
		}
		
		readVal.close();

	}

}
