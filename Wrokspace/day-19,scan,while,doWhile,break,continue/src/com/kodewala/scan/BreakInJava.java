package com.kodewala.scan;

public class BreakInJava {

	public static void main(String[] args) {
		//100k cities
		
		String[] cities = { "Mumbai", "Delhi", "Bengaluru", "Hyderabad", "Chennai", "Kolkata", "Pune", "Ahmedabad",
				"Jaipur", "Lucknow", "Bhopal", "Indore", "Nagpur", "Surat", "Patna", "Ranchi", "Chandigarh", "Kochi",
				"Bhubaneswar", "Guwahati", "Noida", "Gurugram", "Nashik", "Vadodara", "Coimbatore" };
		
		//find if bengaluru is part of the list or not
		for (int i=0; i<cities.length; i++) {
			
			String currentCity = cities[i];
			if(currentCity.equals("Bengaluru")) {
				
				System.out.println("Bangalore is the part of the list");
				break;// break the loop --> you will come out of the loop
			}
		}

	}

}
