package com.kodewala.execptionHandling.practice01;

//import java.text.ParseException;

public class PaymentGatewayProcessor {

	TransactionAuditLogger logger = new TransactionAuditLogger();
	
	public void processPayment(String transactionAmount, int installments) {

		try {
			// Convert String into integer
			int amount = Integer.parseInt(transactionAmount);

			// Calculate installment amount
			int installmentAmount = amount / installments;

			System.out.println("Installment Amount: " + installmentAmount);

			 System.out.println("Transaction Status: SUCCESS");

		} 
		catch (NumberFormatException e) {
			
			System.out.println("Invalid transaction amount!");
			
			logger.logTransactionFailure("Invalid amount format", e);
			
			System.out.println("Transaction Status: FAILED");

			
		} catch (ArithmeticException e) {

			System.out.println("Number of installments cannot be zero!");
			
			logger.logTransactionFailure("Division by zero", e);
			
			 System.out.println("Transaction Status: FAILED");
		}
	}
}
