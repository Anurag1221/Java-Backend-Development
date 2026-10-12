package com.kodewala.biulder;

public class QueryDriver {

	public static void main(String[] args) {
		
		QuiryGenerator quiry = new QuiryGenerator();
		
		StringBuilder store = quiry.generateQuery(0 , "AHH666");
		
		System.out.println(store);
	}

}
