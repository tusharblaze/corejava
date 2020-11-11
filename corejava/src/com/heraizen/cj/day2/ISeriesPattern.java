/*
 *  35.
* 	  * * * * * * * *
             *
             *
             *
             *
             *
* 	  * * * * * * * *
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class ISeriesPattern {

	public static void main(String[] args) {
	
		Scanner readVal = new Scanner(System.in);
		System.out.println("Enter the upper bound:");
		int value = readVal.nextInt();
        
		for(int i =1 ;i <= value; i++) {
			for (int j=1; j<=value;j++) {
				if(i == 1 || i == value) {
					System.out.print('*');
				}else {
					System.out.print(' ');
				}
				
				if(j == value / 2) {
					System.out.print('*');
				}
				
			}
			System.out.printf("\n");
		}
		
		readVal.close();
		
	}

}
