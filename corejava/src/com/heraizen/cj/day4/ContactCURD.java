package com.heraizen.cj.day4;
import java.util.Scanner;

public class ContactCURD {
      static Scanner readVal = new Scanner(System.in);


	  public static void createContact(ContactDetailsEntity[] userDetailsArray,int countDetails) {
		      
		      
			 try{
				 System.out.println("\t\t\t\t<================ Contact Book =================> \n");
				  System.out.println("\n\t\t\t\t\t      Create Contact Details  \n");
				  System.out.println("\n\t\t\t\t      Enter the User Details Properly  \n");
				  System.out.print("\n\t\t\t\t      Enter the person Name : ");
				  String newUserName = readVal.next();
				  
				  System.out.print("\n\t\t\t\t      Enter the person Phone Number : ");
				  String ph_Number = readVal.next();
				  
				  System.out.print("\n\t\t\t\t      Enter the person Address : ");
				  String newUserAddress = readVal.next();
				  
				  userDetailsArray[countDetails] = new ContactDetailsEntity(newUserName,ph_Number,newUserAddress);
				
				   
			 }
			 catch(Exception e) {
				 
				 userDetailsArray[0] = new ContactDetailsEntity("","","");
			 }
			  readVal.close();
		  
	  }
	  
	  public static void showUserDetails(ContactDetailsEntity[] userDetailsArray) {
			
			try {   
				    if(userDetailsArray[0] == null) {
				    	throw new NullPointerException();
				    }else {
				    	System.out.println("\t\t\t\t<================ Contact Book =================> \n");
						System.out.println("\tName\t\tPhone Number\t\tAddress\n");
						for (ContactDetailsEntity user:userDetailsArray) {
							System.out.printf("\t%s\t\t%s\t\t%s\n",user.fullName,user.ph_Number,user.address);
						}	
				    }
					
				
				
			}
			catch(NullPointerException e) {
				System.out.println("\n\n\t\t\t\t\t\tData Not Present\n\n");
			}
			
			
		}

}
