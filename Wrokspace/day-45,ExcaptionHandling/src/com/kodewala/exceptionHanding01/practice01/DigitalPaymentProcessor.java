package com.kodewala.exceptionHanding01.practice01;

public class DigitalPaymentProcessor {

	public void processPayment() {

		String transactionAmount = "5000";

		int numberOfInstallments = 5;

		String transactionReference = null;

		try {
			// Convert String into integer
			int amount = Integer.parseInt(transactionAmount);

			System.out.println("Transaction Amount: " + amount);

			// Calculate instalment amount
			int instalment = amount / numberOfInstallments;

			System.out.println("Monthly instalment: " + instalment);

			System.out.println("Transaction Reference Length: " + transactionReference.length());

		} catch (NumberFormatException e) {

			System.out.println("Invalid transaction amount format");
			e.printStackTrace();

		} catch (ArithmeticException e) {

			System.out.println("Invalid transaction amount format");
			e.printStackTrace();
			
		} catch (NullPointerException e) {

			System.out.println("Transaction reference is unavailable");
			e.printStackTrace();
		}

		System.out.println("Transaction processing completed");

	}
}
