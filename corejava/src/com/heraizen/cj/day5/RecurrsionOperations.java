package com.heraizen.cj.day5;

import java.util.Scanner;

public class RecurrsionOperations {
    static Scanner readVal = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("\n\t\t\t<============= Recurssion Operations ============>\n");
		System.out.println("\t\t1. GCD\t\t2. fibonnanci Series\t\t 3. Sum of Natural Number\n");
		
		System.out.printf("Enter the Number = ");
		int choice = readVal.nextInt();
		
		if(choice == 1) {
			
			System.out.println("Enter First Number  = ");
			int num1 = readVal.nextInt();
			
			System.out.println("Enter Second Number  = ");
			int num2 = readVal.nextInt();
			
			System.out.println(GCDOfNumber(num1 > num2?num1:num2,num1 > num2?num2:num1));
			
			
		}else if(choice == 2) {
			
			System.out.println("Enter a Number  = ");
			int num = readVal.nextInt();
			
			System.out.println(fibonnanciSeriesOfNumber(num));
			
		}else if(choice == 3) {
			System.out.println("Enter a Number  = ");
			int num = readVal.nextInt();
			
			System.out.println(sumOfNumber(num) - 1 );
			
			
		}else {
			System.out.println("\n\n\t\t\t\t\t Wrong Choice");
		}
		
		readVal.close();

	}
	public static int GCDOfNumber(int num1,int num2) {
		
		
		
		if (num2 != 0)
            return GCDOfNumber(num2, num1 % num2);
        else
            return num1;
		
	}
	public static int fibonnanciSeriesOfNumber(int num) {
		
		if (num <= 1) {
			return num; 
		}
		
		return fibonnanciSeriesOfNumber(num-1) + fibonnanciSeriesOfNumber(num-2); 
		
	}
	public static int sumOfNumber(int num) {
		
		 if (num > 0)
	            return  num + sumOfNumber(num - 1);
	        else
	            return 1;
		
	}

}
