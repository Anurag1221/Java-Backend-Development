package com.kodewla.control.flow;


public class TripPlanner {

	public String suggestPlan(String src, String dest, int budget) {

		String suggestion = null;
		if (budget <= 1000) {
			
			suggestion = "You can be in home only!!!";
			System.out.println(suggestion);
			
		} else if (budget > 1000 && budget <= 3000) {
			
			suggestion = "You can visit with in city like lal bagh etc... or you can watch movir near by";
			System.out.println(suggestion);
			
		} else if (budget > 3000 && budget <= 5000) {
			
			suggestion = "You can hire a taxi and vsit near by places like mysore etc...";
			System.out.println(suggestion);
			
		} else {
			
			suggestion = "you can visit goa!";
			System.out.println(suggestion);
		}

		return suggestion;

	}
}
