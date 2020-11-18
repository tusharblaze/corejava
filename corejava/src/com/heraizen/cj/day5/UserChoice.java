package com.heraizen.cj.day5;
import java.util.Scanner;

public class UserChoice {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		int choice;
		int value;
		System.out.println("\t\t\t<========== Operations List ==========>");
		System.out.println("\n\t  1.Factorial\t\t 2.Tabulation\t\t 3.Prime Or Not");
		
		System.out.printf("\n @ Enter Your Choice => ");
		choice = readVal.nextInt();
		
		switch(choice) {
		
			case(1) :   System.out.printf("\n @ Enter the Value for Factorial => ");
			 			value = readVal.nextInt();
			 			System.out.printf("\n > Factorial of Number %d is %d ",value,UserChoiceOperations.factorialOfNumber(value));
						
						break;
			case(2) :   System.out.printf("\n @ Enter the Value for Tabulation => ");
 						value = readVal.nextInt();
 						UserChoiceOperations.tabulationOfNumber(value);
 						break;
			
			case(3) :   System.out.printf("\n @ Enter the Value for Finding Prime ot Not  => ");
						value = readVal.nextInt();
						if(UserChoiceOperations.primeOrNot(value)) {
							System.out.printf("\n > The Given Number %d is a Prime Number ",value);
						}else {
							System.out.printf("\n > The Given Number %d is not a Prime Number ",value);
						}
						break;
			default :   System.out.println("\n\n\t\t\t\tWrong Choice Selection");
		}
		
		readVal.close();
	}

}
