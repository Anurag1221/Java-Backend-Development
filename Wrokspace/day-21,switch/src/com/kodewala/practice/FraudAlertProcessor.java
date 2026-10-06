package com.kodewala.practice;

import java.util.Scanner;

public class FraudAlertProcessor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Fraud Alert Processing System");
		System.out.println("Enter 10 transaction risk levels:");

		for (int i = 1; i <= 10; i++) {

			System.out.print("Enter payment option: ");
			int option = sc.nextInt();

			if (option == 0) {
				System.out.println("Fraud processing stopped.");
				return;
			}

			switch (option) {

			case 1:
				System.out.println("LOW");
				break;

			case 2:
				System.out.println("MEDIUM");
				break;

			case 3:
				System.out.println("HIGH");
				break;

			case 4:
				System.out.println(" CRITICAL");
				break;
			default:
				System.out.println("Invalid Risk Level");
				continue;
			}

		}
		System.out.println("\nFraud Alert Processing Completed.");
		sc.close();
	}

}
