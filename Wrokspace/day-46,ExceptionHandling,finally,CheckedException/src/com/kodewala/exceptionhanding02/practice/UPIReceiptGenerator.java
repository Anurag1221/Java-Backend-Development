package com.kodewala.exceptionhanding02.practice;

public class UPIReceiptGenerator {

	public void processGenerator() {

		String transactionId = "UPI20261119";
		String merchantName = "Amazon";
		String paymentStatus = null;

		try {
			System.out.println("transaction ID: " + transactionId);
			System.out.println("Merchant Name: " + merchantName);
			System.out.println("Payment Status Length: " + paymentStatus.length());
		} 
		catch (NullPointerException e) {

			System.out.println("Error: Payment status is missing.");
			e.printStackTrace();
		}
		finally { // finally block run after the try and catch block, if getting exception or not, finally block excecute mandatry block, it is use write usefull code
			System.out.println("Receipt generation process completed");
		}
	}
}

//1. FinTech – UPI Transaction Receipt Generator
//Basic 1
//Scenario: A payment application generates a transaction receipt after a successful UPI payment. Sometimes, the transaction reference number is missing.
//
//Classes:
//- UPIReceiptGenerator
//- TransactionAuditLogger
//- Driver
//Requirements:
//1. Declare String transactionId = "UPI20261119".
//2. Declare String merchantName = "Amazon".
//3. Declare String paymentStatus = null.
//4. Inside the try block, print the transaction ID.
//5. Access paymentStatus.length().
//6. Handle NullPointerException using a catch block.
//7. Print a meaningful error message.
//8. Create a method logTransactionFailure().
//9. Print "Receipt generation process completed" inside the finally block.
//New learning: Null handling in financial transactions.
