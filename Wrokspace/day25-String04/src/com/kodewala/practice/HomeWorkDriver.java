package com.kodewala.practice;

public class HomeWorkDriver {

	public static void main(String[] args) {
		
		HomeWorkQuestion work = new HomeWorkQuestion();
		
		StringBuilder store = work.displayQuery(null, 7000, null);
		
		System.out.println(store);
	}

}
