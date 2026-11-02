package com.kodewala.interfacee.practice02;

public class UPIProcessor implements PaymentGateway {

	@Override
	public String processPayment(double amount) {

		if (amount <= 0) {
			System.out.println("Invalid UPI payment amount");
			return null;
		}

		System.out.println("UPI payment successful: Rs. " + amount);

		return "UPI-TXN-501";
	}

	@Override
	public boolean refundPayment(String transactionId) {

		if (transactionId == null || !transactionId.startsWith("UPI-TXN-")) {
            return false;
        }

        System.out.println("UPI refund processed: " + transactionId);
        return true;
	}

}
