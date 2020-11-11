/*
 * 
27.
	 1
	 1 2
	 1 2 3
	 1 2 3 4
	 1 2 3 4 5 
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class RightTrianglePattern {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter the upper bound:");
		int value = readVal.nextInt();
        
		for(int i =1 ;i <= value; i++) {
			for (int j=1; j<=i;j++) {
				System.out.printf("%d ",j);
			}
			System.out.printf("\n");
		}
		
		readVal.close();
	}

}
