package com.kodewala.collection.practice50;

import java.util.ArrayList;

public class NetworkTowerMaintenanceScheduler {

	public static void main(String[] args) {

		// 1. Create ArrayList with initial capacity 3
		ArrayList<String> towerIds = new ArrayList<String>(3);

		// 2. Add 5 tower IDs (including duplicate IDs)
		towerIds.add("TOWER-101");
		towerIds.add("TOWER-102");
		towerIds.add("TOWER-103");
		towerIds.add("TOWER-102");
		towerIds.add("TOWER-105");

		System.out.println("Original Tower IDs:");
		System.out.println(towerIds);

		// 3. Insert high-priority tower ID at index 1
		towerIds.add(1, "PRIORITY-TOWER-999");

		System.out.println("\nAfter Inserting High-Priority Tower:");
		System.out.println(towerIds);

		// 4. Remove tower ID using its value
		towerIds.remove(2);

		System.out.println("\nAfter Removing TOWER-102:");
		System.out.println(towerIds);

		// 5. Check whether a tower ID exists
		System.out.println("\nDoes TOWER-103 exist? " + towerIds.contains("TOWER-103"));

		// 6. Find index of a tower ID
		System.out.println("Index of TOWER-105: " + towerIds.indexOf("TOWER-105"));

		// 7. Print first tower ID
		System.out.println("\nFirst Tower ID: " + towerIds.get(0));

		// 8. Print last tower ID
		System.out.println("Last Tower ID: " + towerIds.get(towerIds.size() - 1));

		// 9. Display total number of tower IDs
		System.out.println("Total Tower IDs: " + towerIds.size());

	}

}
