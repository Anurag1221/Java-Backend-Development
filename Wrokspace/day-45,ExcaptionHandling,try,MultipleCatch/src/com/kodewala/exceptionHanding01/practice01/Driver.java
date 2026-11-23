package com.kodewala.exceptionHanding01.practice01;

public class Driver {

	public static void main(String[] args) {

		DigitalPaymentProcessor processor = new DigitalPaymentProcessor();

		TransactionAuditLogger logger = new TransactionAuditLogger();

		processor.processPayment();

		logger.logTransactionStatus();
	}
}

//5. FinTech – Digital Payment Processing
//Concept: Multiple risky statements in one try block
//
//Scenario: A payment gateway receives transaction data, validates the payment reference, calculates instalments and converts the transaction reference into a number. The data may contain different errors.
//
//Classes:
//- DigitalPaymentProcessor
//- TransactionAuditLogger
//- Driver
//Requirements:
//1. Declare String transactionAmount = "5000".
//2. Convert the amount into an integer.
//3. Declare int numberOfInstallments = 0.
//4. Calculate the instalment amount.
//5. Handle NumberFormatException.
//6. Handle ArithmeticException.
//7. Declare String transactionReference = null.
//8. Handle NullPointerException if the reference is accessed.
//9. Print "Transaction processing completed" after the catch blocks.
//New thing you will learn: One try block can contain multiple risky statements, but once an exception occurs, the remaining statements inside that try block are skipped.
