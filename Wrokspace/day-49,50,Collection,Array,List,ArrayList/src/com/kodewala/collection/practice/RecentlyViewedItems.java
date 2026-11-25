package com.kodewala.collection.practice;

import java.util.ArrayList;
import java.util.Iterator;

//contain method :- use to check arraylist contain data or not
//remove method :- remove method use to remove data from arraylist
public class RecentlyViewedItems {

	public static void main(String[] args) {
		
		ArrayList<String> item = new ArrayList<String>();
		item.add("ITEM101");
		item.add("ITEM102");
		item.add("ITEM103");
		item.add("ITEM104");
		
		// Checking whether ITEM102 exists
		boolean iteamExists = item.contains("ITEM102");
		System.out.println(iteamExists);
		
		 // Checking whether ITEM999 exists
		boolean iteamExists1 = item.contains("ITEM999");
		System.out.println(iteamExists1);
		
		// Removing ITEM103
		boolean removed = item.remove("ITEM103");
		System.out.println("ITEM103 removed: " + removed);
		
		// Printing updated list
        System.out.println("Updated Recently Viewed Items: ");
        
        for (int i = 0; i < item.size(); i++) {
			
        		System.out.println(item.get(i));
		}

	}

}
