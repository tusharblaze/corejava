package com.heraizen.cj.day5;

public class UserChoiceOperations {
	
	public static int factorialOfNumber(int num) {
		int totalValue = 1;
		
		for(int i=2; i<= num ; i++) {
			totalValue *= i;
		}
		
		return totalValue;
		
	}
	
	public static void tabulationOfNumber(int num) {
		
		System.out.println("\n Tabulation of number " + num + " is \n");
		for(int i=1; i<=10 ; i++) {
			
			System.out.println(" "+num + " x "+ i +" = "+ num*i);
		}
		
	}
	public static boolean primeOrNot(int num) {
		boolean flag = true;
		
		for(int i=2; i<=num/2 ; i++) {
			if(num % i == 0) {
				flag = false;
				break;
			}
		}
		
		return flag;
	}

}
