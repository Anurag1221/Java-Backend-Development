package com.kodewala.collection.practice;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
//learn size,get method
//size method use to find arraylist size :- restaurantNames.size()
//get method use get arraylist data :- restaurantNames.get(5)
public class RestaurantSearchHistory {

	public static void main(String[] args) {
		
		ArrayList<String> restaurantNames  = new ArrayList<String>();
		restaurantNames .add("Dominos");
		restaurantNames .add("Burger King");
		restaurantNames .add("KFC");
		restaurantNames .add("Dominos");
		restaurantNames .add("Pizza Hut");
		
		for (int i = 0; i < restaurantNames.size(); i++) {
			
			System.out.println(restaurantNames.get(i));
		}
		
		System.out.println(restaurantNames.get(2));
		System.out.println(restaurantNames.size());

	}

}
