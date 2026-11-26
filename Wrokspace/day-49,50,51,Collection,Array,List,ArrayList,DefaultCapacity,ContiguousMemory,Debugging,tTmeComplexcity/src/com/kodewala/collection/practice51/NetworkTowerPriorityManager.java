package com.kodewala.collection.practice51;

import java.util.ArrayList;

public class NetworkTowerPriorityManager {

	public static void main(String[] args) {

		// Create an ArrayList to store tower IDs
		ArrayList<String> towerIds = new ArrayList<>();

		// Add 5 tower IDs
		towerIds.add("TWR101");
		towerIds.add("TWR102");
		towerIds.add("TWR103");
		towerIds.add("TWR104");
		towerIds.add("TWR105");
		
		
		towerIds.add(0, "TWR100"); //TL - O(n)
		towerIds.add(2, "TWR102"); // TL - O(n)
		
		towerIds.remove(0); //TL - O(n)
		towerIds.remove(towerIds.size()-1); // In the end remove element TL is - O(1)
		
		System.out.println(towerIds);
	}

}
