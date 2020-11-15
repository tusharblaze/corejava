package com.heraizen.cj.day4;
import java.util.Scanner;
/**
 * The ContactCURD class contains all the CURD operations on Contact Book Details.
 * @author Tushar Anand
 *
 */
public class ContactCURD {
	  static Scanner readVal = new Scanner(System.in); // Scanner object is common for all the operations
	  
	  /*
	   * "showUserDetails" is used to show the Contact Book details and it has having 
	   * two more operations i.e Sorting and Searching the details.
	   */
  
	  public static void showUserDetails(ContactDetailsEntity[] userDetailsArray) {
		    // if the array is empty try block will handle the NullPointerException exception here
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
						System.out.println("\nDo You want to do any operation on this data(press y|Y to do operations or press any key for returning back to Home ) : ");
						
						char yesOrNo = readVal.next().charAt(0);
						
						if(yesOrNo == 'y' || yesOrNo == 'Y') {
							System.out.printf("\nEnter your Choice : ");
							
							
							int	choice = readVal.nextInt(); 
							
							 if(choice != 1 ) {
								  if (choice != 2) {
									 if(choice != 3) {
										 while(choice < 0 || choice > 3 ) {
											  System.out.printf("\n\nWrong Choice Selection !! Select Again \n ");
											  System.out.printf("\nEnter Your choice => ");
											  choice = readVal.nextInt();
										  }  
									 }
								  }
									  
								  
							  }
							
							if(choice == 1) {
								searchUser(userDetailsArray); // Searching the User Detail
							}else if (choice == 2) {
								sortUsers(userDetailsArray); // Sorting the user Detail
							}else if (choice == 3) {
								System.out.println("\n\t\t\t\t    Going back to Home");
							}
						} else {
							System.out.println("\n\t\t\t\t    Going back to Home");
						}
				    }
					
				
				
			}
			catch(NullPointerException e) {
				System.out.println("\n\n\t\t\t\t\t\tData Not Present\n\n");
			}
			
			
		}
	  
	  /*
	   * "updateUserDetails" method is used to update specific attribute or total data of users except the user-id.
	   */
	  
	  public static ContactDetailsEntity[] updateUserDetails(ContactDetailsEntity[] userDetailsArray) {
		  	
		  int choice;
		    System.out.println("\n\t\t\t\t\t<@@@@@@@ Contact Book Update @@@@@@@> \n");
			System.out.println("\t1. Name \t 2. Phone Number \t 3. Address \t 4.All \n");
			System.out.print("Enter Your Choice : ");
			choice = readVal.nextInt();
			
			 if(choice != 1 ) {
				  if (choice != 2) {
					 if(choice != 3) {
						if(choice != 4) {
							 while(choice < 0 || choice > 4 ) {
								  System.out.printf("\n\nWrong Choice Selection !! Select Again \n ");
								  System.out.printf("\nEnter Your choice => ");
								  choice = readVal.nextInt();
							  }
						}
					 }
				  }
			  
			  }
			
		  try {
			  
			  System.out.printf("\nEnter the User Id Which you want to update => ");
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
			  	case(4)	:  
			  		      
			  				System.out.print("\n\t\t\t\t     > Enter the person's First Name : ");
			  				String firstName1 = readVal.next();
				
			  				System.out.print("\n\t\t\t\t     > Enter the person's Last Name : ");
			  				String lastName1 = readVal.next();
	  
			  				String newUserName = firstName1 + " " +lastName1;
				
			  				System.out.print("\n\t\t\t\t     > Enter the person's Phone Number : ");
			  				String ph_Number1 = readVal.next();
				
			  				if(ph_Number1.length() != 10) {
			  					System.out.print("\n\t\t\t\t     > Please re-enter the Phone Number  ... Phone number is wrong !!! ");
			  					while(ph_Number1.length() != 10) {
			  						System.out.print("\n\t\t\t\t     > Enter the person's Phone Number : ");
			  						ph_Number1 = readVal.next();
			  					}
					
			  				}
	            
			  				System.out.print("\n\t\t\t\t    @ Enter the person's Address :-\n ");
				
			  				System.out.print("\n\t\t\t\t     > Enter the Local Area Name : ");
			  				readVal.nextLine();
			  				String localName1 = readVal.nextLine();
				
			  				System.out.print("\n\t\t\t\t     > Enter the City Name : ");
			  				String cityName1 = readVal.next();
			  				readVal.nextLine();
			  				System.out.print("\n\t\t\t\t     > Enter the State Name : ");
			  				String stateName1 = readVal.nextLine();
				
			  				String newUserAddress = localName1 +", "+cityName1+", "+stateName1;
			  				
			  				for(int i=0; i< userDetailsArray.length; i++) {
			  					if(userDetailsArray[i].userId.equals(selectedUserId)) {
			  						userDetailsArray[i] = new ContactDetailsEntity(userDetailsArray[i].userId,newUserName,ph_Number1,newUserAddress);
			  						
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
	  
	  /*
	   * "deleteUserDetails" method is used to Delete the specific user details by the user-id.
	   */
	  
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
	  
	  /*
	   * "SearchUser" method is used to Search the specific user details by the user-id.
	   */
	  
	  public static void searchUser(ContactDetailsEntity[] userDetailsArray) {
	
		  System.out.printf("\nEnter the User Id Which you want to Search => ");
		  String selectedUserId  = readVal.next();
		  boolean flag =false;
		  for(ContactDetailsEntity arr:userDetailsArray) {
		    	
		    	  if(arr.userId.equals(selectedUserId)) {
		    		System.out.printf("\n\t\t @Searched User Detail is :- ");
		    		System.out.println("\n\t\t\t USER ID => "+arr.userId);
		    		System.out.println("\n\t\t\t FULL NAME => "+arr.fullName);
		    		System.out.println("\n\t\t\t PHONE NUMBER => "+arr.ph_Number);
		    		System.out.println("\n\t\t\t ADDRESS => "+arr.address);
		    		flag =true;
		    		break;
		    	  }
		      }
		  if(!flag) {
			  System.out.println("\n\t\t\t xxxxxxxxxxxxx User Detail Not Found xxxxxxxxxxxxx\n");
		  }
	  }
	  
	  /*
	   * "sortUsers" method is used to Sort the  user details by Ascending or Descending wise.
	   */
	  
	  public static void sortUsers(ContactDetailsEntity[] userDetailsArray) {
		  String[][] val = new String[userDetailsArray.length][2];
		  String pattern = "(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)";
		  ContactDetailsEntity tempUser;
		  int choice;
		  
		  int k = 0;
		  for(ContactDetailsEntity arr : userDetailsArray) {
			  val[k] = arr.userId.split(pattern);
			  k++;
		  }
		  
		  System.out.println("\t\t\t         |**************** Sort By *****************| \n");
		  System.out.println("\n\t\t\t\t1. Ascending Order \t 2. Desecnding Order  \n");
		  System.out.printf("\nEnter Your choice => ");
		  choice = readVal.nextInt();
		  
		  if(choice != 1 ) {
			  if (choice != 2) {
				  while(choice < 0 || choice > 2 ) {
					  System.out.printf("\n\nWrong Choice Selection !! Select Again \n ");
					  System.out.printf("\nEnter Your choice => ");
					  choice = readVal.nextInt();
				  }  
			  }
				  
			  
		  }
		  
		  switch (choice) {
		  
		  		  case(1) :
		  			  		for(int i=0; i< userDetailsArray.length-1; i++) {
		  			  			for (int j=i+1; j<userDetailsArray.length; j++) {
		  			  				if(Integer.parseInt(val[i][1]) > Integer.parseInt(val[j][1]) ) {
		  			  					tempUser = userDetailsArray[i];
		  			  					userDetailsArray[i] = userDetailsArray[j];
		  			  					userDetailsArray[j] = tempUser;
		  			  				}
		  			  			}
		  			  		}
		  		  			break;
		  		  case(2) :
		  			  		for(int i=0; i< userDetailsArray.length-1; i++) {
		  			  			for (int j=i+1; j<userDetailsArray.length; j++) {
		  			  				if(Integer.parseInt(val[i][1]) < Integer.parseInt(val[j][1]) ) {
		  			  					tempUser = userDetailsArray[i];
		  			  					userDetailsArray[i] = userDetailsArray[j];
		  			  					userDetailsArray[j] = tempUser;
		  			  				}
		  			  			}
		  			  		}
		  		  			break;
		  		  default : System.out.println("\n\n Wrong Selection\n\n");
		  			   		
		  }
		  
		
		  
		  System.out.println("\n\t\t\t      ||----------------    Sorted User Details   --------------------|| \n");
			System.out.println("\t\tUserID\tName\t\t     Phone Number\t  Address\n");
			for (ContactDetailsEntity user:userDetailsArray) {
				System.out.printf("\t\t%-7s %-20s %-20s %-30s\n",user.userId,user.fullName,user.ph_Number,user.address);
			}
	  }

}
