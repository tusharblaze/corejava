/*
 *  28.
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class ReversedRightTriangle {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter the upper bound:");
		int value = readVal.nextInt();
		int valueBound = value;
        
		for(int i =1 ;i <= value; i++) {
			for (int j=1; j<=valueBound;j++) {
				System.out.printf("%d ",j);
			}
			System.out.printf("\n");
			valueBound--;
		}
		
		readVal.close();
	}

}
