/*
 * 4. Write a program that accepts two numbers in the range from 1 to 50 from the user. It then compares these numbers
 *  against the single dimension array of 5 integer elements ranging in value from 1 to 50. The program displays the
 *   message success if the two inputted values are found in the array element. Otherwise print it as fail.
 */
package com.heraizen.cj.day3;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.Scanner;

public class RandomValueArray {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int randomVal1 =  readVal.nextInt();
		
		System.out.println("Enter Second number :");
		int randomVal2 =  readVal.nextInt();
		
		int[] randArray = new int[5];
		
		for(int i=0; i<5; i++) {
			randArray[i] = ThreadLocalRandom.current().nextInt(1,51);
		}
		
		System.out.println("The Given Random Array is "+Arrays.toString(randArray));
		
		
		if(checkValue(randomVal1,randArray) && checkValue(randomVal2,randArray)) {
			System.out.println("Value found inside the Random Value Array");
		}else {
			System.out.println("Value not found inside the Random Value Array");
		}
		
		
		readVal.close();

	}
	
	public static boolean checkValue(int val,int[] arr) {
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == val) {
				flag = true;
				break;
			}
			
		}
		
		return flag;
	}

}
