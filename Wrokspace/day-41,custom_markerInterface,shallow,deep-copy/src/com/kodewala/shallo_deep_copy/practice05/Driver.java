package com.kodewala.shallo_deep_copy.practice05;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {

		// Creating payment device information
		PaymentDeviceInfo deviceInfo = new PaymentDeviceInfo("DEVICE-101", "192.168.1.10");

		// Creating original payment transaction
		PaymentTransaction paymentTransaction = new PaymentTransaction("TXN-75001", 75000, deviceInfo);

		// Creating snapshot manager
		TransactionSnapshotManager manager = new TransactionSnapshotManager();

		// Creating deep copy snapshot
		PaymentTransaction snapshot = manager.createSnapshot(paymentTransaction);

		// Changing original device IP address
		paymentTransaction.deviceInfo.ipAddress = "192.168.1.50";

		// Printing original transaction details
		System.out.println("Original Transaction Details");
		System.out.println("Transaction ID: " + paymentTransaction.transactionId);
		System.out.println("Amount: " + paymentTransaction.amount);
		System.out.println("Device ID: " + paymentTransaction.deviceInfo.deviceId);
		System.out.println("IP Address: " + paymentTransaction.deviceInfo.ipAddress);

		System.out.println("-----------------------------");

		// Printing snapshot details
		System.out.println("Snapshot Transaction Details");
		System.out.println("Transaction ID: " + snapshot.transactionId);
		System.out.println("Amount: " + snapshot.amount);
		System.out.println("Device ID: " + snapshot.deviceInfo.deviceId);
		System.out.println("IP Address: " + snapshot.deviceInfo.ipAddress);

	}
}
