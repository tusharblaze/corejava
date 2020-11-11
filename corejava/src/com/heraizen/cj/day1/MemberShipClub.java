/*
 *  The Sports Club registration form has the following details: name, mobile number and age.
 *  Per the membership policy, the person should be at least 18 years old to become a member.
 *   Write a program to accept the details mentioned above; if the age is >18 years then display 
 *   the entered details with a congratulatory message, else the following message should be displayed 
 *   “Sorry! You need to be at least 18 years old to get membership.”

	Expected output:

	Enter the name:
	Lakshman
	Enter the mobile number:
	989999999
	Enter the age:
	16

	“Sorry! You need to be at least 18 years old to get membership.”

	Enter the name:
	Lakshman
	Enter the mobile number:
	989999999
	Enter the age:
	30

	“Congratulations Lakshman for your successful registration.” 
 */
package com.heraizen.cj.day1;
import java.util.*;	

public class MemberShipClub {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name = readVal.next();
		System.out.println("Enter mobile number :");
		int number = readVal.nextInt();
		System.out.println("Enter the Age :");
		int age = readVal.nextInt();
		
		if(age > 18) {
			System.out.printf("Congratulations %s for your successful registration.",name);
		}else {
			System.out.println("\nSorry! You need to be at least 18 years old to get membership.");
		}
        readVal.close();
	}

}
