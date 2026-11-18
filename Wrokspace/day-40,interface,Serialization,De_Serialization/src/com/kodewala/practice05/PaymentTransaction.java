package com.kodewala.practice05;

import java.io.Serializable;

public class PaymentTransaction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String transactionID = "UPI-TXN-501";
	double transactionAmount = 12500.75;
	String paymentMode = "UPI";
	String transactionStatus = "SUCCESS";
	transient String internalSecurityKey = "SECURE@501";
}
