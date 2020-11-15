package com.heraizen.cj.day4;
//import java.util.Arrays;
//import java.util.InputMismatchException;
import java.util.Scanner;

public class ContactCURD {
	  static Scanner readVal = new Scanner(System.in);
  
	  public static void showUserDetails(ContactDetailsEntity[] userDetailsArray) {
		    
			try {   
				    if(userDetailsArray[0] == null) {
				    	throw new NullPointerException();
				    }else {
				    	System.out.println("\t\t\t\t<================ Contact Book Details =================> \n");
				    	System.out.println("\t\t1. Search User\t\t2. Sort All User\t\t3. Go Back Home \n");
				    	System.out.println("\t\t\t\t|**************** User Details *****************| \n");
						System.out.println("\t\tUserID\tName\t\t     Phone Number\t  Address\n");
						for (ContactDetailsEntity user:userDetailsArray) {
							System.out.printf("\t\t%-7s %-20s %-20s %-30s\n",user.userId,user.fullName,user.ph_Number,user.address);
						}
						System.out.printf("\nEnter your Choice : ");
						
						
						
						int	choice = readVal.nextInt();
						
						
						if(choice == 1) {
							searchUser(userDetailsArray);
						}else if (choice == 2) {
							sortUsers(userDetailsArray);
						}else if (choice == 3) {
							
						}else {
							System.out.println("\n\t\t\t\t     Wrong Selection exit.. Going back to Home");
						}
				    }
					
				
				
			}
			catch(NullPointerException e) {
				System.out.println("\n\n\t\t\t\t\t\tData Not Present\n\n");
			}
			
			
		}
	  
	  public static ContactDetailsEntity[] updateUserDetails(ContactDetailsEntity[] userDetailsArray) {
		  	int choice;
		    System.out.println("\n\t\t\t\t<================ Contact Book Update =================> \n");
			System.out.println("\t1. Name\t2. Phone Number\t3. Address\t4.All \n");
			System.out.print("Enter Your Choice : ");
			choice = readVal.nextInt();
		  try {
			  
			  System.out.println("Enter the User Id Which you want to update");
			  String selectedUserId  = readVal.next();
			  
			  switch(choice) {
			  	
			  	case(1)	: 
			  			  System.out.print("\n\t\t\t\t      Enter the person's First Name : ");
			  			  String firstName = readVal.next();
				
			  			  System.out.print("\n\t\t\t\t      Enter the person's Last Name : ");
			  			  String lastName = readVal.next();
			  		      for(ContactDetailsEntity arr:userDetailsArray) {
			  		    	
			  		    	  if(arr.userId.equals(selectedUserId)) {
			  		    		
			  		    		arr.fullName = firstName + " " +lastName;
			  		    		System.out.println(arr.userId+" "+arr.fullName);
			  		    		  break;
			  		    	  }
			  		      }
			  		      break;
			  	case(2)	: 
			  				System.out.print("\n\t\t\t\t      Enter the person Phone Number : ");
			  				String ph_Number = readVal.next();
				
			  				if(ph_Number.length() != 10) {
			  						System.out.print("\n\t\t\t\t      Please re-enter the Phone Number Again ");
			  						while(ph_Number.length() != 10) {
			  							System.out.print("\n\t\t\t\t      Enter the person's Phone Number : ");
			  							ph_Number = readVal.next();
			  						}
					
			  				}
			  				for(ContactDetailsEntity arr:userDetailsArray) {
			  					if(arr.userId == selectedUserId) {
			  						arr.ph_Number = ph_Number;
			  						break;
			  					}
			  				}
			  				break;
			  	case(3)	: 
			  				System.out.print("\n\t\t\t\t      Enter the person Address : ");
			  				System.out.print("\n\t\t\t\t      Enter the Local Area Name : ");
			  				String localName = readVal.next();
			  				System.out.print("\n\t\t\t\t      Enter the City Name : ");
			  				String cityName = readVal.next();
			  				System.out.print("\n\t\t\t\t      Enter the State Name : ");
			  				String stateName = readVal.next();
			  				
			  				for(ContactDetailsEntity arr:userDetailsArray) {
			  					if(arr.userId == selectedUserId) {
			  						arr.address = localName +", "+cityName+", "+stateName;
			  						break;
			  					}
			  				}
			  				break;
			  }
			  
		  }
		  catch(ArrayIndexOutOfBoundsException e) {
			  System.out.println("Details is full now");
		  }
		  
		  return userDetailsArray;
	  }
	  
	  public static ContactDetailsEntity[] deleteUserDetails(ContactDetailsEntity[] userDetailsArray) {
		  int size = userDetailsArray.length -1;
		  ContactDetailsEntity[] updatedUserDetails = new ContactDetailsEntity[size];
		  System.out.printf("\nEnter the User's User-ID Which you want to Delete : ");
		  String selectedUserId  = readVal.next();
		  int counter1 = 0;
		  int counter2 = 0;
		  while(counter1 < updatedUserDetails.length) {
			  if(userDetailsArray[counter2].userId.equals(selectedUserId)) {
				  counter2++;
				  continue;
			  }else {
				  updatedUserDetails[counter1] =  userDetailsArray[counter2];
				  counter2++;
				  counter1++;
			  }
		  }
		  return updatedUserDetails;
	  }
	  
	  public static void searchUser(ContactDetailsEntity[] userDetailsArray) {
	
		  System.out.printf("\nEnter the User Id Which you want to Search => ");
		  String selectedUserId  = readVal.next();
		  boolean flag =false;
		  for(ContactDetailsEntity arr:userDetailsArray) {
		    	
		    	  if(arr.userId.equals(selectedUserId)) {
		    		System.out.printf("\nSearched User Detail is :- ");
		    		System.out.println("\nUSER ID => "+arr.userId);
		    		System.out.println("\nFULL NAME => "+arr.fullName);
		    		System.out.println("\nPHONE NUMBER => "+arr.ph_Number);
		    		System.out.println("\nADDRESS => "+arr.address);
		    		flag =true;
		    		break;
		    	  }
		      }
		  if(!flag) {
			  System.out.println("\n User Detail Not Found");
		  }
	  }
	  
	  public static void sortUsers(ContactDetailsEntity[] userDetailsArray) {
		  String[][] val = new String[userDetailsArray.length][2];
		  String pattern = "(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)";
		  ContactDetailsEntity tempUser;
		  int k = 0;
		  for(ContactDetailsEntity arr : userDetailsArray) {
			  val[k] = arr.userId.split(pattern);
			  k++;
		  }
		  
		  for(int i=0; i< userDetailsArray.length-1; i++) {
			  for (int j=i+1; j<userDetailsArray.length; j++) {
				  if(Integer.parseInt(val[i][1]) > Integer.parseInt(val[j][1]) ) {
					  tempUser = userDetailsArray[i];
					  userDetailsArray[i] = userDetailsArray[j];
					  userDetailsArray[j] = tempUser;
				  }
			  }
		  }
		  
		  System.out.println("\t\t\t     |**************** Sorted User Details *****************| \n");
			System.out.println("\t\tUserID\tName\t\t     Phone Number\t  Address\n");
			for (ContactDetailsEntity user:userDetailsArray) {
				System.out.printf("\t\t%-7s %-20s %-20s %-30s\n",user.userId,user.fullName,user.ph_Number,user.address);
			}
	  }

}
