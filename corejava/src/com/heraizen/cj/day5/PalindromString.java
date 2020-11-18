package com.heraizen.cj.day5;
import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		System.out.println("Enter your String => ");
		
		String str = readVal.nextLine();
		StringBuffer str1 = new StringBuffer(str);

		
		if(str1.reverse().toString().equalsIgnoreCase(str)) {
			System.out.println("String is Palindrom");
		}else {
			System.out.println("String is not Palindrom");
		}
     readVal.close();
     
	}

}
