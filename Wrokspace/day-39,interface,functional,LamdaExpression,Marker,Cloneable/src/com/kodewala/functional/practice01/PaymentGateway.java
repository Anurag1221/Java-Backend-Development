package com.kodewala.functional.practice01;

public class PaymentGateway {

	public static void main(String[] args) {

		//create lamdaExpression
		PaymentVerification paymentVerification = (transactionId, amount) -> {
			
			return !transactionId.isEmpty() && amount > 0;
			
		};
		
		 UPITransactionService service = new UPITransactionService();
		
		 service.processTransaction(paymentVerification,  "UPI-TXN-501", 300);
	}

}
