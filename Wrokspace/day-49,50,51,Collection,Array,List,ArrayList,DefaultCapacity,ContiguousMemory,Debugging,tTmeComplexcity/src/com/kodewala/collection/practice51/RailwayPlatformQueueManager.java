package com.kodewala.collection.practice51;

import java.util.ArrayList;

public class RailwayPlatformQueueManager {

	public static void main(String[] args) {
		
		int trainAmount = 500;
		// Create an ArrayList to store train IDs
		ArrayList<String> trainIds = new ArrayList<>();

		// Add 7 train IDs
		trainIds.add("TRN101");
		trainIds.add("TRN102");
		trainIds.add("TRN103");
		trainIds.add("TRN104");
		trainIds.add("TRN105");
		trainIds.add("TRN106");
		trainIds.add("TRN107");
		
		trainIds.add(0, "TRN100"); // TL - O(n)
		trainIds.remove(3); // TL - O(n)
		trainIds.add(3, "TRNS100"); // // TL - O(n)
		trainIds.remove(1); // TL - O(n)
		
		System.out.println(trainIds);
		System.out.println(trainAmount);
	}
}
