package com.kodewala.shallo_deep_copy.practice02;

//shallow copy point the same reference
public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {

		// Creating transaction metadata
		TransactionMetadata metadata = new TransactionMetadata("DC101", "Lanji");

		// Creating original UPI transaction
		UPITransactionRecord record = new UPITransactionRecord("TR101", 25000, metadata);

		// Creating shallow copy
		UPITransactionRecord record2 = (UPITransactionRecord) record.clone();

		// Modifying original transaction location
		record.metadata.location = "Bangalore";

		System.out.println("Original Amount: ₹" + record.amount);
		System.out.println("Original Location;" + record.metadata.location);

		System.out.println("--------------------------------");

		System.out.println("Cloned Transaction ID: " + record2.transactionId);
		System.out.println("Cloned Amount: ₹" + record2.amount);
		System.out.println("Cloned Location;" + record2.metadata.location);
	}
}
