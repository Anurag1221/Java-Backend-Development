package com.kodewala.practice05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TransactionRecoveryEngine {

	public PaymentTransaction readcFile() throws IOException, ClassNotFoundException {
		
		FileInputStream fileInputStream = new FileInputStream("payment.ser");
		
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		
		PaymentTransaction paymentTransaction = (PaymentTransaction) inputStream.readObject();
		
//		System.out.println("transactionID;" + paymentTransaction.transactionID);
//		System.out.println("transactionAmount;" + paymentTransaction.transactionAmount);
//		System.out.println("paymentMode;" + paymentTransaction.paymentMode);
//		System.out.println("transactionStatus;" + paymentTransaction.transactionStatus);
//		System.out.println("internalSecurityKey;" + paymentTransaction.internalSecurityKey);
//		
//		System.out.println("update details");
//		
//		paymentTransaction.transactionStatus = "REFUND_INITIATED";
//		
//		System.out.println("Updated transactionStatus; " + paymentTransaction.transactionStatus);
		
		inputStream.close();
		return paymentTransaction;
	}
}	
