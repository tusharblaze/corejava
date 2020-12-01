package com.heraizen.cj.day8.collection.levelthree.collectionEmployee.phnbook.main;

import java.util.Scanner;

import com.heraizen.cj.day8.collection.levelthree.collectionEmployee.phnbook.service.PhoneBook;

public class BookManager {

	public static void main(String[] args) {
		
		PhoneBook bkOperate = new PhoneBook();
		Scanner readVal = new  Scanner(System.in);
		
		while(true) {
			
			System.out.println("\n\t\t\t<================ Phone Book =============>");
			System.out.println("\n1.Add User\t\t2.Search User\t\t3.Exit");
			
			System.out.printf("\n\n@ Enter your Choice = ");
			int choice = readVal.nextInt();
			
			switch(choice) {
			case 1: System.out.printf("\n\nEnter User Name = ");
					readVal.nextLine();
					String Name = readVal.nextLine();
					System.out.printf("\n\nEnter the Phone Number = ");
					String ph_no = readVal.next();
					bkOperate.addDetails(ph_no,Name);
					break;
			case 2 : System.out.printf("\n\nEnter The Phone number to see User's Name...\n=> ");
			   		
			 		 System.out.printf("\nThe User Associated with this Phone Number is %s ",bkOperate.getName(readVal.next()));
			 		 break;
			case 3 : break;
			default :System.out.println("Wrong Choice Selection !! Please select again"); 
				     break;
			
			}
			
			if(choice == 3) {
				break;
			}
			
		}
		
		readVal.close();
	}

}
