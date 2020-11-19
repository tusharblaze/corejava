package com.heraizen.cj.day7.bankOperation;

public interface BankAccount {

	void deposit(float amt);

	void withdraw(float amt);

	float getBalance();

	void displayDetails();

	float getMinimumBalance();
}
