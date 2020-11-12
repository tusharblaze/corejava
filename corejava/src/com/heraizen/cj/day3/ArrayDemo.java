package com.heraizen.cj.day3;

public class ArrayDemo {

	public static int findBiggest(int[] arr) {
		int maxVal = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(maxVal <= arr[i]) {
				maxVal= arr[i];
			}
		}
		return maxVal;
	}
	
	public static int findSmallest(int[] arr) {
		int minVal = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(minVal >= arr[i]) {
				minVal= arr[i];
			}
		}
		return minVal;
	}
	
	public static int findSummation(int[] arr) {
		int totalval = 0;
		for(int j=0; j<arr.length; j++) {
			totalval += arr[j];
		}
		return totalval;
	}
	
	public static int findAverage(int[] arr) {
		int totalval = 0;
		for(int j=0; j<arr.length; j++) {
			totalval += arr[j];
		}
		return totalval/arr.length;
	}
	
	/**
	 * This function Add all the value inside the multidimensional Array
	 * @param arr
	 * @return
	 */
	
	public static int findMatrixSummation(int[][] arr,int M,int N) {
		int totalval = 0;
		for(int j=0; j < M; j++) {
			for(int i=0; i<N;i++) {
				totalval += arr[j][i];
			}
		}
		return totalval;
	}
	
	/**
	 * This function Find Biggest value inside the multidimensional Array
	 * @param arr
	 * @return
	 */
	
	public static int findMatrixBiggest(int[][] arr,int M,int N) {
		int maxVal = arr[0][0];
		for(int i=0; i< M; i++) {
			for(int j=0; j< N; j++) {
				if(maxVal <= arr[i][j]) {
					maxVal= arr[i][j];
				}
			}
		}
		return maxVal;
	}
	
	/**
	 * This function Add all digonal  values inside the multidimensional Array
	 * @param arr
	 * @return
	 */
	
	public static int summationDigonalMatrix(int[][] arr,int M,int N) {
		int totalval = 0;
		for(int j=0; j< M; j++) {
			for(int i=0; i< N; i++) {
				if(i==j) {
					totalval += arr[j][i];
				}
				
			}
		}
		return totalval;
	}
	
	/**
	 * This function return transpose of the multidimensional Array
	 * @param arr
	 * @return
	 */
	
	public static int[][] transposeOfMatrix(int[][] arr,int M,int N) {
		int[][] transposeArray = new int[N][M];
		for(int j=0; j<M; j++) {
			for(int i=0; i<N;i++) {
				transposeArray[i][j] = arr[j][i];
			}
		}
		return transposeArray;
	}

}
