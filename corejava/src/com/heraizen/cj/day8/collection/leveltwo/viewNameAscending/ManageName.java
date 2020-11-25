package com.heraizen.cj.day8.collection.leveltwo.viewNameAscending;

import java.util.Scanner;

public class ManageName {

	public static void main(String[] args) {
		
		Scanner readVal = new Scanner(System.in);
		int count =0 ;
		
		while(count != 5) {
			System.out.println("Enter the Names = >");
			NameDetails.addStates(readVal.next());
			count++;
		}
		
		NameDetails.viewStates();
		readVal.close();

	}

}
