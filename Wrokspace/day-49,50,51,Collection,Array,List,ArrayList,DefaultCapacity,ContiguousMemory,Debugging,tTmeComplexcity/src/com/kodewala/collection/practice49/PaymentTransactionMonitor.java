package com.kodewala.collection.practice49;

import java.util.ArrayList;
import java.util.Iterator;

public class PaymentTransactionMonitor {

	public static void main(String[] args) {

		ArrayList<String> transactionMonitoring = new ArrayList<String>();
		transactionMonitoring.add("TXN-501");
		transactionMonitoring.add("TXN-502");
		transactionMonitoring.add("TXN-503");
		transactionMonitoring.add("TXN-501");
		transactionMonitoring.add("TXN-504");
		transactionMonitoring.add("TXN-502");

		ArrayList<String> duplicateTransaction = new ArrayList<String>();

		for (int i = 0; i < transactionMonitoring.size(); i++) {

			String currentTransaction = transactionMonitoring.get(i);

			for (int j = i + 1; j < transactionMonitoring.size(); j++) {

				if (currentTransaction.equals(transactionMonitoring.get(j))) {
					
					if (!duplicateTransaction.contains(currentTransaction)) {

						duplicateTransaction.add(currentTransaction);
					}
				}
			}
		}

		System.out.println("Original Transactions: " + transactionMonitoring);

		System.out.println("Duplicate Transactions: " + duplicateTransaction);

		System.out.println("Total Duplicate IDs: " + duplicateTransaction.size());
	}

}
