/*
 * 52.   Write a program to accept two numbers num1, num2 and an operator. Simulate the calculator using switch statement.

		Enter the 1st Operand num1:
		10
		Enter the 2nd Operand num2:
		20
		1. add 2. mul 3. div 4. mod 5. div
		Enter the operator
		1
		The sum of 10 and 20 is 30
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class CalculationMonitor {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter the 1st Operand num1:");
		int num1 = readVal.nextInt();
		System.out.println("Enter the 2nd Operand num2:");
		int num2 = readVal.nextInt();
		
		System.out.println("\n\t\tOPERATIONS\n\t1.ADDITION\n\t2.MULTIPLICATION\n\t3.DIVISION\n\t4.MODULUS\n\t5.SUBTRACTION");
		int choice = readVal.nextInt();
		
		switch(choice) {
				case 1: System.out.printf("The sum of %d and %d is %d",num1,num2,num1+num2);
							break;
				case 2: System.out.printf("The Multiplication of %d and %d is %d",num1,num2,num1*num2);
							break;
				case 3: System.out.printf("The Division of %d and %d is %d",num1,num2,num1/num2);
							break;
				case 4: System.out.printf("The Modulus of %d and %d is %d",num1,num2,num1%num2);
							break;
				case 5: System.out.printf("The Subtraction of %d and %d is %d",num1,num2,num1-num2);
							break;
				default: System.out.printf("Wrong Choice !!!");
							
		}
		
		readVal.close();

	}

}
