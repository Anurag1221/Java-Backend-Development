package com.kodewala.collection.practice51;

import java.util.ArrayList;

public class DeliveryPartnerAssignmentManager {

	public static void main(String[] args) {
		// Create an ArrayList to store partner IDs
		ArrayList<String> partnerIds = new ArrayList<>();

		// Add 5 partner IDs (including duplicates)
		partnerIds.add("PTR101");
		partnerIds.add("PTR102");
		partnerIds.add("PTR103");
		partnerIds.add("PTR101");
		partnerIds.add("PTR104");
		
		partnerIds.add(1, "PTR101.5");
		partnerIds.remove(1);
		partnerIds.add(partnerIds.size(), "PTR105");
		
		System.out.println(partnerIds);

	}

}
