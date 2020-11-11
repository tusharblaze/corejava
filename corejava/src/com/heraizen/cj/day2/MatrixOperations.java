/*
 * 38.   Write a program to find the biggest, smallest and sum of the elements in the given 3 X 3 matrix.

		5 6 7
		4 5 6
		5 6 7
 */
package com.heraizen.cj.day2;

public class MatrixOperations {

	public static void main(String[] args) {
		int[][] arr = { { 5, 6, 7 }, {4, 5 ,6 },{5, 6 ,7 } }; 
		matrixOperation(arr);
	}
	
	private static void matrixOperation(int[][] matrix){
		 
		  int maxNum = matrix[0][0];
		  int minNum = matrix[0][0];
		  int totalValue = 0;
		  for (int i = 0; i < matrix.length; i++) {
		   for (int j = 0; j < matrix[i].length; j++) {
		    if(maxNum < matrix[i][j]){
		     maxNum = matrix[i][j];
		    }else if(minNum > matrix[i][j]){
		     minNum = matrix[i][j];
		    }
		    totalValue +=matrix[i][j];
		   }
		  }
		  System.out.println("Biggest number : " + maxNum + "\nSmallest number : " + minNum +
				  "\nTotal Summation : "+totalValue);
		 }

}
