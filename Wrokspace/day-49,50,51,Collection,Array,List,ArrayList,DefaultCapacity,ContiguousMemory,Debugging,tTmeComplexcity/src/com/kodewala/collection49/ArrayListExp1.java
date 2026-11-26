package com.kodewala.collection49;
// list store the data in same order
// allow duplicate data
//allow multiple null value
import java.util.ArrayList;

public class ArrayListExp1 {

	public static void main(String[] args) {
		
		//create a container which will hold something(Objects)
		ArrayList<String> learner = new ArrayList<String>();
		
		//Storing the data
		learner.add("Anurag");
		learner.add("Arth");
		learner.add("Vishal");
		learner.add("Anurag");
		learner.add("Ashay");
		learner.add(null);
		learner.add("Rohit");
		learner.add("Aman");
		learner.add(null);
		
		System.out.println(learner);
	}

}
