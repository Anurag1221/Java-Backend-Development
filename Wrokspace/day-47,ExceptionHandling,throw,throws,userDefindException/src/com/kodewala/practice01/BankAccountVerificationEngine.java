package com.kodewala.practice01;

public class BankAccountVerificationEngine {

	public void activateCustomerAccount(String accountNumber) {

		try {
			verifyBankAccount(accountNumber);

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

	}

	public void verifyBankAccount(String accountNumber) throws IllegalArgumentException{
		
		if (!accountNumber.startsWith("SBI")) {

            throw new IllegalArgumentException("Invalid bank account");

        } else {

            System.out.println("Bank account verification successful");
        }	}
}
