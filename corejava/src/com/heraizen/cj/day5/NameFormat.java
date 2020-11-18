package com.heraizen.cj.day5;
import java.util.Scanner;

public class NameFormat {

	public static void main(String[] args) {
		
		Scanner readVal = new Scanner(System.in);
		
		System.out.printf("\nEnter First name :- ");
		String firstName = readVal.next();
		
		System.out.printf("\nEnter Middle name :- ");
		String middleName = readVal.next();
		
		System.out.printf("\nEnter Last name :- ");
		String lastName = readVal.next();
        
		String fullName = String.join("-",firstName,middleName,lastName);
		
		System.out.println("\nThe given Patter wise String is : "+fullName);
		
		readVal.close();
	}

}
