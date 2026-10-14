package com.kodewala.oops.encapsulation;

public class Transaction {

	String accountHolderName;
	String accountNo; 
	private int balance; // Data is Variable

	public Transaction(String accountHolderName, String accountNo, int balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNo = accountNo;
		this.balance = balance;
	}

	// setter
	public void doDebit(int _amount) {

		// Modifying the data
		balance = balance - _amount;
	}
	
	//transfer
	public void doTransfer(int _amount) {

		if(_amount > 0 && _amount <= balance) {
			
			balance = balance - _amount;
		
		}
	}
	
	//set balance
	public void doCredit(int _amount) {

		if (_amount > 0) {
			// Modifying the data
			balance = balance + _amount;
		}
	}
	
	//getter
	public int getBalance() {

		return balance;
	}

}
