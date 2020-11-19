package com.heraizen.cj.day7.bankOperation;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class UserList {
	static Scanner readVal = new Scanner(System.in);
	static BankAccount accountDetail;

	public static void main(String[] args) {

		String custName;
		int accNo;
		String accType;
		float balance;

		System.out.println("\n\t\t\t<=========== BANK ACCOUNT CREATION ============>");
		System.out.println("\n\t\t1.Create Saving Account\t\t 2.Create Current Account");
		System.out.printf("\nEnter Your Choice = ");
		int choice = readVal.nextInt();

		if (choice == 1) {
			readVal.nextLine();

			System.out.printf("\nEnter Customer full Name = ");
			custName = readVal.nextLine();

			accType = "Saving";

			accNo = ThreadLocalRandom.current().nextInt(1000, 10000);
			System.out.printf("\nAccount number %d is Generated for %s . Please keep it Safe !\n", accNo, custName);

			System.out.printf("\nPlease Deposite the Intital Amount(i.e Minimum Rs 1000) to Activate Your Saving Account = ",accNo, custName);
			balance = readVal.nextFloat();

			accountDetail = new SavingAccount(accNo, custName, accType, balance);

			operateBankAccount();

		} else if (choice == 2) {
			readVal.nextLine();

			System.out.printf("\nEnter Customer full Name = ");
			custName = readVal.nextLine();

			accType = "Current";

			accNo = ThreadLocalRandom.current().nextInt(1000, 10000);
			System.out.printf("\nAccount number %d is Generated for %s . Please keep it Safe !\n", accNo, custName);

			System.out.printf(
					"\nPlease Deposite the Intital Amount(i.e Minimum Rs 5000) to Activate Your Saving Account = ");
			balance = readVal.nextFloat();

			accountDetail = new CurrentAccount(accNo, custName, accType, balance);

			operateBankAccount();

		} else {
			System.out.println("\n\t\t\t<xxxxxxxxxxxxx WRONG CHOICE SELECTION xxxxxxxxxxxxx>");

		}

		readVal.close();

	}

	public static void operateBankAccount(){
		
		while(true) {
			System.out.println("\n\t\t\t<================ Account Operation =================>\n");
			System.out.println("1. Deposit\t\t2. Withdrawl\t\t3.Check Balance\t\t4.Check Account Details\t\t5.Exit\n");
			System.out.printf("Enter Your Choice = ");
			int choice = readVal.nextInt();
			
			switch(choice) {
				case 1: System.out.println("\nEnter the Amount You Want to Deposite = ");	
						float amt = readVal.nextFloat();
						accountDetail.deposit(amt);
						 break;
						 
				case 2: System.out.println("\nEnter the Amount You Want to Withdrawl = ");	
						float withdrawlAmt = readVal.nextFloat();
						accountDetail.withdraw(withdrawlAmt);
						 break;
						 
				case 3:  
					     float currentBalance = accountDetail.getBalance();
					     
					     try {
					    	 System.out.println("\nCurrent Balance  = " + currentBalance);
					    	 if(currentBalance < accountDetail.getMinimumBalance()) {  
							       throw new LowBalanceException("The Current Balance In account is not Up to Minimum Balance please Deposite the money.");
						        
					    	 }
					    	 
					     }catch(LowBalanceException e) {
					    	 System.out.println("\n"+e.getMessage());
					     }
					     break;
					     
				case 4: accountDetail.displayDetails();
						break;
				case 5: break;
				
				default: System.out.println("********* Wrong Selection ************");
			}
			
			if(choice == 5) {
				break;
			}
			
		}
		
	}

}
