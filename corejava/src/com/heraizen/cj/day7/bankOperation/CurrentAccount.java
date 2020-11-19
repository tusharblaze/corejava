package com.heraizen.cj.day7.bankOperation;

public class CurrentAccount implements BankAccount {

	private int accNo;
	protected String custName;
	private String accType;
	private float balance;
	public float MIN_BALANCE;

	public CurrentAccount(int accNo, String custName, String accType, float balance) {

		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		MIN_BALANCE = 5000;

		try {
			if (balance < 0) {
				this.balance = 0;
				throw new NegativeAmount(
						"Amount cannot be Negative Value . Money Withdrawl got restricted on Your Current Account. Please deposit the amount again to meet the Minimum balance");
			}else if (balance < MIN_BALANCE) {
				this.balance = balance;
				throw new InsufficientFunds(
						"Please Maintain the Minimum Balance !! Money Withdrawl got restricted on Your Current Account. Please deposite money on Your account. ");
			}  else {
				this.balance = balance;
			}
			
		} catch (InsufficientFunds e) {
			System.out.println("\n" + e.getMessage()+"\n");
		} catch (NegativeAmount e) {
			System.out.println("\n" + e.getMessage()+"\n");
		}

	}

	@Override
	public void deposit(float amt) {
		 if (amt < 0) {
				throw new NegativeAmount(
						"Amount cannot be Negative Value . Money Withdrawl got restricted on Your Current Account. Please deposit the amount again to meet the Minimum balance");
			}else {
				balance +=amt;
			}
 
	}

	@Override
	public void withdraw(float amt) {
		if((balance - amt) < 1000) {
			System.out.println("\nPlease Maintain the Minimum balance in your Current Account . Withdrawl operation cannot be done .Operation Terminating.....\n");
		}else {
			balance -= amt;
			System.out.printf("\nRs %.2f Amount is Credited from your Account .\nCurrent Balance is Rs %.2f \n",amt,balance);
		}

	}

	@Override
	public float getBalance() {
		
		return balance;
	}

	@Override
	public void displayDetails() {
		System.out.println("\t\t<-------- Bank Account Details ---------->");
		System.out.println("\n\t\t  @ Account Holder Name : "+custName);
		System.out.println("\n\t\t  @ Account Number : "+accNo);
		System.out.println("\n\t\t  @ Current Balance : "+balance);
		System.out.println("\n\t\t  @ Account Type : "+accType);
		System.out.println("\n\t\t  @ Minimum Balance : "+MIN_BALANCE);
	}

	@Override
	public float getMinimumBalance() {
		return MIN_BALANCE;
	}

	
}
