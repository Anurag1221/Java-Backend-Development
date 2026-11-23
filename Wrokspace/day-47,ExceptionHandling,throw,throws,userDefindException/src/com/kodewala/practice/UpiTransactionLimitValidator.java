package com.kodewala.practice;

public class UpiTransactionLimitValidator {

	public void processTransaction(double transactionAmount) {

		try {
			validateTransactionLimit(transactionAmount);
			

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

	}

	public void validateTransactionLimit(double transactionAmount)  throws IllegalArgumentException{

		if (transactionAmount >= 100000) {

			throw new IllegalArgumentException("Transaction limit exceeded");
		}
		else {
			System.out.println("Transaction approved");
		}
	}

	public static void main(String[] args) {

		UpiTransactionLimitValidator limitValidator = new UpiTransactionLimitValidator();
		limitValidator.processTransaction(150000);

	}

}
