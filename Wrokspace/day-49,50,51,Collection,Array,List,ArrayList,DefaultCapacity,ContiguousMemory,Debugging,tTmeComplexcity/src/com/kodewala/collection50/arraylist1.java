package com.kodewala.collection50;

import java.util.ArrayList;

//Once current capacity is full.we added 10 elements.if you are adding 11 element,
//array list will go through re-sizing and capacity will be increased by 50%.
//In this case new capacity will be 15.

public class arraylist1 {

	public static void main(String[] args) {
		
ArrayList<String> list = new ArrayList<String>(100);
		
		list.add("Bangalore");
		list.add("Chennai");
		list.add("Mysore");
		list.add("Hyderabad");
		list.add("Dehli");
		
		list.add("Bangalore");
		list.add("Channai");
		list.add("Mysore");
		list.add("Hyderabad");
		list.add("Dehli");
		
		list.add("Bangalore");
		list.add("Bangalore");
		
		System.out.println(list);

	}

}
