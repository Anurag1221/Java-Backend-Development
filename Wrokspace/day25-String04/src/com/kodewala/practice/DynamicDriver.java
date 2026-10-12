package com.kodewala.practice;

public class DynamicDriver {

	public static void main(String[] args) {
		
		DynamicQueryComposer query = new DynamicQueryComposer();

		StringBuilder store = query.composeQuery(0, "gfgyt66");

		System.out.println(store);
	}

}
