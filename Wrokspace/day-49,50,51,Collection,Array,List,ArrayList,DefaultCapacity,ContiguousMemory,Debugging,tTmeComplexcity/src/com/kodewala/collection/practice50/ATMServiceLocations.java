package com.kodewala.collection.practice50;

import java.util.ArrayList;

public class ATMServiceLocations {

	public static void main(String[] args) {
		
		ArrayList<String> atmLocations = new ArrayList<String>(50);
		// Add 10 ATM locations (including duplicates)
        atmLocations.add("SBI - MP Nagar, Bhopal");
        atmLocations.add("HDFC - Arera Colony, Bhopal");
        atmLocations.add("ICICI - New Market, Bhopal");
        atmLocations.add("Axis Bank - TT Nagar, Bhopal");
        atmLocations.add("SBI - MP Nagar, Bhopal");
        atmLocations.add("PNB - Kolar Road, Bhopal");
        atmLocations.add("HDFC - Arera Colony, Bhopal");
        atmLocations.add("BOB - Bittan Market, Bhopal");
        atmLocations.add("Canara Bank - Habibganj, Bhopal");
        atmLocations.add("Union Bank - Shahpura, Bhopal");
        
        atmLocations.set(2, "Union Bank - Shahpura, Bhopal");
        atmLocations.remove(5);
        
        System.out.println(atmLocations);
        
        for (int i = 0; i < atmLocations.size(); i++) {
			
        		System.out.println(atmLocations.get(i));
		}
        
//        for (String location : atmLocations) {
//            System.out.println(location);
//        }
		

	}

}
