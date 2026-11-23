package com.kodewala.UserDefine.Exception;

import java.io.IOException;

public class PaymentMgmt {
	
	public void doPayment(String account, int amount) {
		
		//check the balance
		try {
			checkBalance(account, amount);
		} 
		catch (InsufficientBalanceException | IOException e ) { // miltiCatch -> java 7
				
				//e.printStackTrace();
			throw new FundTransferException("You do not have enough balance OR" 
					+ "in case you have opend the account recently"
					+ "please wait for 24hr before doing fund tranfer");
		}
	}
	
	private boolean checkBalance(String account, int amount) throws InsufficientBalanceException, IOException{
		boolean checkBalanceStatus = false;
		int balance = 1000; //from database
		
		if(amount > balance) {
			//balance is not enough
			throw new InsufficientBalanceException(account + "does not have enogh balance and current balance is " + balance);
		}
		else {
			//allow to transfer fund
			checkBalanceStatus = true;
		}
		return checkBalanceStatus;
	}
}
