/*
 * 51.   Write a program to accept a character from the user and check whether it is a vowel or consonant using 
 *       switch statement.
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		System.out.println("Enter any character:");
		char value = readVal.next().toLowerCase().charAt(0);
		
		switch(value) {
				case 'a': System.out.println("The input character is a vowel ");
							break;
				case 'e': System.out.println("The input character is a vowel ");
							break;
				case 'i': System.out.println("The input character is a vowel ");
							break;
				case 'o': System.out.println("The input character is a vowel ");
							break;
				case 'u': System.out.println("The input character is a vowel ");
							break;
				default:  System.out.println("The input character is a Consonent ");
							break;
		}
		
		readVal.close();
		

	}

}
