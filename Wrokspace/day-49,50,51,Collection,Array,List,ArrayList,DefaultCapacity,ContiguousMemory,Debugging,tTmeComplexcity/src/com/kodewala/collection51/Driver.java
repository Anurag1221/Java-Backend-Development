package com.kodewala.collection51;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		int amount = 100;
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Bangalore");
		cities.add("Mysore");
		cities.add("Hyd");
		cities.add("Channai");
		cities.add("Ahm");
		cities.add("DL");
		cities.add("Mumbai");
		
		cities.add(0, "Luknow"); //TL - O(n) 
		cities.remove(3); // TL - O(n)
		cities.add(cities.size()-1, "Nagpur");  // TL - O(1)
		System.out.println(cities);
		
		System.out.println(amount);
	}

}
