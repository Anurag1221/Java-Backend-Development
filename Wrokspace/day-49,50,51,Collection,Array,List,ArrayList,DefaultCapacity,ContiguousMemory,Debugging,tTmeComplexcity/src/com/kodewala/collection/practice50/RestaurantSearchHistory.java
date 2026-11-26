package com.kodewala.collection.practice50;

import java.util.ArrayList;

public class RestaurantSearchHistory {

	public static void main(String[] args) {
		
		ArrayList<String> restaurantNames = new ArrayList<String>();
		 // Store 5 restaurant names
        restaurantNames.add("Domino's Pizza");
        restaurantNames.add("Burger King");
        restaurantNames.add("KFC");
        restaurantNames.add("Subway");
        restaurantNames.add("Pizza Hut");

        // Add 3 more restaurant names
        restaurantNames.add("McDonald's");
        restaurantNames.add("Haldiram's");
        restaurantNames.add("Wow! Momo");
        
        System.out.println(restaurantNames);
        restaurantNames.remove(3);
        
        System.out.println(restaurantNames);
        System.out.println(restaurantNames.size());


	}

}
