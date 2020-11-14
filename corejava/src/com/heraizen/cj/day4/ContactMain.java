package com.heraizen.cj.day4;
import java.util.Scanner;
import com.heraizen.cj.day4.ContactDetailsEntity;
import com.heraizen.cj.day4.ContactCURD;

public class ContactMain {

	public static void main(String[] args) {
		
		int countDetails = 1;
		ContactDetailsEntity[] userDetailsArray = new  ContactDetailsEntity[2]; 
		userDetailsArray[0] = new ContactDetailsEntity("Tushar", "56564665", "uyfrddf fdghh");
		
		Scanner readVal = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n\t\t\t\t<================ Contact Book =================> \n");
			System.out.println("\t1. Create Contact\t2. Check Contact\t3. Update Contact\t4. Delete Contact\t5. Exit \n");
			System.out.print("Enter Your Choice : ");
			
			
			 int choice = readVal.nextInt();
			
			
			switch (choice) {
			
			case (1): ContactCURD.createContact(userDetailsArray,countDetails);
					  countDetails++;
			          break;
			
			case (2): ContactCURD.showUserDetails(userDetailsArray);
			          
			case (5): break;
			
			default: System.out.println("Wrong Choice Selection");
			
			}
			
			if(choice == 5) {
				break;
			}
			
		}
		
		readVal.close();
		


	}
	
	public static void showUserDetails(ContactDetailsEntity[] detailList) {
		
		try {   
			    if(detailList[0] == null) {
			    	throw new NullPointerException();
			    }else {
			    	System.out.println("\t\t\t\t<================ Contact Book =================> \n");
					System.out.println("\tName\t\tPhone Number\t\tAddress\n");
					for (ContactDetailsEntity user:detailList) {
						System.out.printf("\t%s\t\t%s\t\t%s\n",user.fullName,user.ph_Number,user.address);
					}	
			    }
				
			
			
		}
		catch(NullPointerException e) {
			System.out.println("\n\n\t\t\t\t\t\tData Not Present\n\n");
		}
		
		
	}

}
