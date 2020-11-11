/*
 * In a shopping mall, privileged customers (if they have a membership card) are being given a 10% discount on 
 * the billed amount, and the others are being given a 3% discount. Write a program to accept the billing amount 
 * and confirm the membership card from the customer; calculate and display the net amount to be paid by the customer.

Expected output:

Enter the bill amount:
5000
Do you have a membership card?
Y
Thank you! Your total bill amount is Rs 5000, discount is Rs 500 and net amount payable is Rs 4500.


Enter the bill amount:
5000
Do you have a membership card?
N
Thank you! Your total bill amount is Rs 5000, discount is Rs 150 and net amount payable is Rs 4850.
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class MembershipDiscount {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter the bill amount:");
		int billAmount = readVal.nextInt();
		
		System.out.println("Do you have a membership card?");
		char answer = readVal.next().charAt(0);
		float discount;
		
		if(Character.toUpperCase(answer) == 'Y') {
		  discount = billAmount / 10;
		  System.out.printf("Thank you! Your total bill amount is Rs %d, discount is Rs %.2f and net amount payable is Rs %.2f.",
				               billAmount,discount,billAmount - discount);
		}else if(Character.toUpperCase(answer) == 'N') {
			discount = (billAmount / 100)*3;
			System.out.printf("Thank you! Your total bill amount is Rs %d, discount is Rs %.2f and net amount payable is Rs %.2f.",
					               billAmount,discount,billAmount - discount);
		}else {
			System.out.println("Wrong answer !!");
		}
		
		
		readVal.close();

	}

}
