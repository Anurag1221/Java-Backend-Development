package com.kodewala.interfacee.practice02;

public class CardProcessor implements PaymentGateway{

	@Override
	public String processPayment(double amount) {

		 if (amount <= 0) {
	            System.out.println("Invalid card payment amount");
	            return null;
	        }

	        System.out.println("Card payment successful: Rs. " + amount);

	        return "CARD-TXN-702";
	}

	@Override
	public boolean refundPayment(String transactionId) {
		
		if (transactionId == null || !transactionId.startsWith("CARD-TXN-")) {
            return false;
        }

        System.out.println("Card refund processed: " + transactionId);
        return true;
    }
}

