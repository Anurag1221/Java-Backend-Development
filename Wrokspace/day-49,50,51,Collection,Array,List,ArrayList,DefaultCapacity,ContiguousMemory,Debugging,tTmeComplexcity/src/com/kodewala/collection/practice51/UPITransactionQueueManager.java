package com.kodewala.collection.practice51;

import java.util.ArrayList;

public class UPITransactionQueueManager {

	public static void main(String[] args) {

		// Create an ArrayList with initial capacity 5
		ArrayList<String> transactionIds = new ArrayList<>(5);

		// Add 8 transaction IDs
		transactionIds.add("TXN101");
		transactionIds.add("TXN102");
		transactionIds.add("TXN103");
		transactionIds.add("TXN104");
		transactionIds.add("TXN105");
		transactionIds.add("TXN106");
		transactionIds.add("TXN107");
		transactionIds.add("TXN108");
		
		
		transactionIds.add(0, "TXN100"); // TL - O(n)
		transactionIds.remove(3); // TL - O(n)
		transactionIds.remove(4); // TL - O(n)
		transactionIds.add(2,  "TXN101.5"); // TL - O(n)
		transactionIds.remove(transactionIds.size()-1); // TL - O(1)
		
		System.out.println(transactionIds);
		
	}

}
