package com.heraizen.cj.day7.mathematicalOperations;
import java.util.Scanner;

public class OperationHandler {

	public static void main(String[] args) {
		
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("\t\t<========== Arthematic Operations ===========>\n");
		System.out.println("1. Add\t\t2. Subtract\t\t3. Multiply\t\t4.Division");
		System.out.printf("\nEnter your Choice = ");
		int choice = readVal.nextInt();
		
		System.out.printf("\nEnter Your First Number => ");
		int num1 = readVal.nextInt();
		System.out.printf("\nEnter Your Second Number => ");
		int num2 = readVal.nextInt();
		
		MyNumber operationHandler = new MyNumber(num1, num2);
		switch(choice) {
			case 1:  System.out.printf("\nThe Summation of the %d and %d is %d",num1,num2,operationHandler.add());
					 break;
			case 2:  System.out.printf("\nThe Summation of the %d and %d is %d",num1,num2,operationHandler.sub());
			 		 break;
			case 3:  System.out.printf("\nThe Summation of the %d and %d is %d",num1,num2,operationHandler.mul());
			 		 break;
			case 4:  double returnVal = operationHandler.div();
					 if(returnVal != 0 ) {
						 System.out.printf("\nThe Summation of the %d and %d is %.2f",num1,num2,operationHandler.div());
					 }
			 		 break;
            default: System.out.println("\nWrong choice Selection");
		}
		
		readVal.close();

	}

}
