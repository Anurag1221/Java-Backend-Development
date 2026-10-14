package com.kodewala.practice;

public class BankAccount {

	private int balance;
	private int PIN;

	public BankAccount(int balance, int pIN) {
		super();
		this.balance = balance;
		PIN = pIN;
	}
	
	//setter ,set balance
	void doDeposit(int amount, int pin) {

		if (amount > 0 && PIN == pin) {

			balance = balance + amount;
		}
		else 
		{
			System.out.println("Invalid Pin,Deposit not allow");
		}
	}
	
	// setter ,set withdraw
	void doWithdraw(int amount, int pin) {

		if (amount > 0 && amount <= balance && PIN == pin) {

			balance = balance - amount;
		}
		else 
		{
			System.out.println("Invalid Pin,Withdraw not allow");
		}
	}
	
	//getter get balance
	public int getBalance(int pin) {
		
		if (PIN == pin) {
			
			return balance;
		}
		System.out.println("Invalid Pin");
		return -1;
	}
	
}
