package com.kodewala.marker.practice03;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {

		// Creating original policy object
		InsurancePolicyRecord original = new InsurancePolicyRecord("INS-2026-501", "Rahul Sharma", 18000.0, 10);

		// Cloning original object
		InsurancePolicyRecord cloned = (InsurancePolicyRecord) original.clone();

		// Changing cloned object's premium
		cloned.premiumAmount = 25000.0;

		// Display original policy
		System.out.println("Original Policy Record:");
		original.displayDetails();
		
		System.out.println();
		
		// Display cloned policy
		System.out.println("Cloned Policy Record:");
		cloned.displayDetails();

		// Creating policy management center
		PolicyManagementCenter center = new PolicyManagementCenter();
		
		// Checking original object
        center.processPolicy(original);
        
        // Checking cloned object
        center.processPolicy(cloned);

        // Checking non-eligible object
        String document = "General Information";

        center.processPolicy(document);

	}

}
