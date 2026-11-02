package com.kodewala.functional.practice01;

public class UPITransactionService {

	public void processTransaction(PaymentVerification verification, String transactionId, double amount) {

		//call method displayVerificationMessage();
		verification.displayVerificationMessage();

		//store result 
		boolean result = verification.verifyTransaction(transactionId, amount);

		System.out.println("Transaction ID: " + transactionId);
		System.out.println("Transaction Amount: ₹" + amount);
		System.out.println("Verification Result: " + result);
		
		if (result) {
			System.out.println("Transaction is valid.");
		} else {
			System.out.println("Transaction is invalid.");
		}
	}

}
