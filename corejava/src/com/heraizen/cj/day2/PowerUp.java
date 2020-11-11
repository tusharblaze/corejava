/*
 * 50.   Write a program to accept 2 numbers “m” and “n” from the user and determine m^n (without using predefined functions).
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class PowerUp {
	
	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter value in m:");
		int m = readVal.nextInt();
		
		System.out.println("Enter value in n:");
		int n = readVal.nextInt();
		
		int result=1;
		for(int i=1;i<=n;i++) {
			
		result *=m;
		}
		System.out.printf("The power of %d ^ %d is %d ",m,n,result);
		
		readVal.close();
	
	}

}
