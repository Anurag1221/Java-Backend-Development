package com.kodewala.shallo_deep_copy.practice05;

public class TransactionSnapshotManager {

	public PaymentTransaction createSnapshot(PaymentTransaction paymentTransaction) throws CloneNotSupportedException {
		
		return (PaymentTransaction) paymentTransaction.clone();
	}
}
