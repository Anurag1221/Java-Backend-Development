package com.kodewala.marker.practice03;

public class PolicyManagementCenter {

	public void processPolicy(Object obj) {

		// Runtime type checking
		if (obj instanceof SensitiveDocument) {

			System.out.println("Eligible for Sensitive-Document Handling");

		} else {

			System.out.println("Not Eligible for Sensitive-Document Handling");
		}

	}

}
