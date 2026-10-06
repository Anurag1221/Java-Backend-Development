package com.kodewala.practice;

import java.util.Scanner;

public class LogSeverityScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LogSeverityScanner log = new LogSeverityScanner();

		System.out.println("Choose monitoring system receives log severity::");
		System.out.println("1 → INFO");
		System.out.println("2 → WARNING");
		System.out.println("3 → ERROR");
		System.out.println("4 → CRITICAL");
		System.out.println("5 → DEBUG");

		System.out.println("Check ,Enter the plan no.");
		int number = sc.nextInt();

		log.displaySeverity(number);

		sc.close();

	}

public void displaySeverity(int number) {


			if (number == 9) {
				System.out.println("Log processing stopped.");
				return;
			}

			switch (number) {
			case 1:
				System.out.println("INFO");
				break;
			case 2:
				System.out.println("WARNING");
				break;
			case 3:
				System.out.println("ERROR");
				break;
			case 4:
				System.out.println("CRITICAL");
				break;
			case 5:
				System.out.println("DEBUG");
				break;
			default:
				return;
			}
		System.out.println("Program ended.");
	}

}