package com.kodewala.shallo_deep_copy.practice05;

public class PaymentTransaction implements Cloneable {

	String transactionId;
	double amount;
	PaymentDeviceInfo deviceInfo;

	public PaymentTransaction(String transactionId, double amount, PaymentDeviceInfo deviceInfo) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.deviceInfo = deviceInfo;
	}

	public Object clone() throws CloneNotSupportedException {

		 // Creating shallow copy
		PaymentTransaction p = (PaymentTransaction) super.clone();
		
		// Creating deep copy of nested object
		p.deviceInfo = (PaymentDeviceInfo) deviceInfo.clone();
		return p;

	}

}
