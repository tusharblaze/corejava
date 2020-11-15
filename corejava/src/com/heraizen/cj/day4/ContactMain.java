package com.heraizen.cj.day4;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import com.heraizen.cj.day4.ContactDetailsEntity;
import com.heraizen.cj.day4.ContactCURD;

public class ContactMain {

	public static void main(String[] args) {
		
		
		ContactDetailsEntity[] userDetailsArray = new  ContactDetailsEntity[10];
		int countDetails = userDetailsArray.length;
		for(int i=0; i<userDetailsArray.length; i++) {
			userDetailsArray[i] = new ContactDetailsEntity("USER10"+i,"Tushar Anand","6303365085","Ekangarsari , Nalanda, Bihar");
		}
		
		Scanner readVal = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\n\t\t\t\t<================ Contact Book Home =================> \n");
			System.out.println("\t1. Create Contact\t2. Check Contact\t3. Update Contact\t4. Delete Contact\t5. Exit \n");
			System.out.print("Enter Your Choice : ");
			
			
			int choice = readVal.nextInt();
			
			
			switch (choice) {

			case (1):       countDetails++;
				            ContactDetailsEntity[] details = new ContactDetailsEntity[countDetails];
				            System.arraycopy(userDetailsArray, 0, details, 0, userDetailsArray.length); 
				            
				   			System.out.println("\n\t\t\t\t<================ Contact Book Create =================> \n");
							System.out.println("\n\t\t\t\t<============== Create Contact Details =================>  \n");
							System.out.println("\n\t\t\t\t    @ Enter the User Details Properly  \n");
							
							System.out.print("\n\t\t\t\t     > Enter the person's First Name : ");
							String firstName = readVal.next();
							
							System.out.print("\n\t\t\t\t     > Enter the person's Last Name : ");
							String lastName = readVal.next();
				  
							String newUserName = firstName + " " +lastName;
							
							System.out.print("\n\t\t\t\t     > Enter the person's Phone Number : ");
							String ph_Number = readVal.next();
							
							if(ph_Number.length() != 10) {
								System.out.print("\n\t\t\t\t     > Please re-enter the Phone Number  ... Phone number is wrong !!! ");
								while(ph_Number.length() != 10) {
									System.out.print("\n\t\t\t\t     > Enter the person's Phone Number : ");
									ph_Number = readVal.next();
								}
								
							}
				            
							System.out.print("\n\t\t\t\t    @ Enter the person's Address :- ");
							
							System.out.print("\n\t\t\t\t     > Enter the Local Area Name : ");
							readVal.nextLine();
							String localName = readVal.nextLine();
							
							System.out.print("\n\t\t\t\t     > Enter the City Name : ");
							String cityName = readVal.next();
							readVal.nextLine();
							System.out.print("\n\t\t\t\t     > Enter the State Name : ");
							String stateName = readVal.nextLine();
							
							String newUserAddress = localName +", "+cityName+", "+stateName;
	
							String empId = "USER"+ ThreadLocalRandom.current().nextInt(100,1000);
							System.out.printf("\n\t\t\t\t     ( %s Random ID Generated for %s )\n\n",empId,newUserName);
							
							details[countDetails-1] = new ContactDetailsEntity(empId,newUserName,ph_Number,newUserAddress);
							
							userDetailsArray = new ContactDetailsEntity[countDetails];
							userDetailsArray = details.clone();
							
							break;
			
			case (2):		ContactCURD.showUserDetails(userDetailsArray);
			  		  		break;
			  		  
			case (3): 		userDetailsArray = ContactCURD.updateUserDetails(userDetailsArray);
			 		  		break;
			 		  
			case (4): 		countDetails--;
					  		ContactDetailsEntity[] details2 = new ContactDetailsEntity[countDetails];
					  		details2 = ContactCURD.deleteUserDetails(userDetailsArray);
					  		userDetailsArray = new ContactDetailsEntity[countDetails];
					  		System.arraycopy(details2, 0, userDetailsArray, 0, userDetailsArray.length);
					  		System.out.printf("\n\t\t\t\t\t\tDeleted Successfully \n\n");
					  		break;
			          
			case (5): 		System.out.println("\n\n\t\t\t  xxxxxxxxxxxxxxxxxxxxxx Program Terminated xxxxxxxxxxxxxxxxxxxxxxx");
				   			break;
			
			default: 		System.out.println("Wrong Choice Selection");
			
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
