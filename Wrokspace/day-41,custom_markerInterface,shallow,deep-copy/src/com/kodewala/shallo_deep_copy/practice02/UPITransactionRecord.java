package com.kodewala.shallo_deep_copy.practice02;

public class UPITransactionRecord implements Cloneable{
	
	String transactionId;
	double amount;
	TransactionMetadata metadata;
	
	//assigning values
	public UPITransactionRecord(String transactionId, double amount, TransactionMetadata metadata) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.metadata = metadata;
	}
	
	//shallow copy
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
}
