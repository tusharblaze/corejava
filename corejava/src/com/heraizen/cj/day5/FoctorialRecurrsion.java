package com.heraizen.cj.day5;
import java.util.Scanner;

public class FoctorialRecurrsion {

	public static void main(String[] args) {
	
		Scanner readVal = new Scanner(System.in);
		System.out.printf("Enter the Number = ");
		int num = readVal.nextInt();
		
		System.out.printf("Factorial of Number %d is %d",num,factorialOfNumber(num));
		
		readVal.close();
	}
	
	public static int factorialOfNumber(int num) {
		
		 if (num >= 1)
	            return num * factorialOfNumber(num - 1);
	        else
	            return 1;
		
	}

}
