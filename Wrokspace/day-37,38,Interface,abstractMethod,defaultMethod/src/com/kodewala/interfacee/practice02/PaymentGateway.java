package com.kodewala.interfacee.practice02;

public interface PaymentGateway {
	
	public abstract String processPayment(double amount);
	public abstract boolean refundPayment(String transactionId);
}
