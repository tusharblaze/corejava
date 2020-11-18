package com.heraizen.cj.day5;

public class ValueFounder {

	public static void main(String[] args) {
		String str = "I am in Bangalore my house number is 6 and my phone number is 6307853285";
		 
		
	
		String[] str1 = String.join("", str.split("[0-9]+")).split(" ");
		int totalCharacter = String.join("",str1).length();
		int totalSpaces = str.split(" ").length - 1;
	
		System.out.println("Number of Character : " + totalCharacter);
		System.out.println("Number of Spaces : " + totalSpaces);
		System.out.println("Number of Digits : "+(str.length() - (totalCharacter + totalSpaces) ) );
		
	}

}
