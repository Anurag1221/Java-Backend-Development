package com.kodewala.practice05;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// create object PaymentTransaction
		PaymentTransaction paymentTransaction = new PaymentTransaction();

		// serialization
		TransactionBackupEngine backupEngine = new TransactionBackupEngine();
		backupEngine.createFile(paymentTransaction);

		// de-serialization
		TransactionRecoveryEngine engine = new TransactionRecoveryEngine();
		engine.readcFile();

		PaymentTransaction recoveredTransaction = engine.readcFile();

		// Step 4: Display recovered transaction details
		System.out.println("\n--- Recovered Transaction ---");

		System.out.println("Transaction ID: " + recoveredTransaction.transactionID);
		System.out.println("Payment Mode: " + recoveredTransaction.paymentMode);
		System.out.println("Transaction Status: " + recoveredTransaction.transactionStatus);
		System.out.println("Internal Security Key: " + recoveredTransaction.internalSecurityKey);

		// Step 5: Update transaction status
		recoveredTransaction.transactionStatus = "REFUND_INITIATED";
		System.out.println("\n--- Updated Transaction ---");
		System.out.println("Transaction Status: " + recoveredTransaction.transactionStatus);

		// Step 6: Serialize the updated object again
		backupEngine.createFile(recoveredTransaction);
		
		System.out.println("\nUpdated transaction saved successfully.");

	}
}
