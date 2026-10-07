package com.kodewala.string;

public class Driver {

	public static void main(String[] args) {
		
		//create a string object
		String firstName = "kodewala"; // obj created in SCP --> firsName's address --> xyz321
		String lastName = "kodewala"; // Object with content "kodewala" already created
									// and lastName willl refer to existing object.
									//lastName is aslo poining to address xyz321
		
		// String city = new String("Bangalore");
		
		System.out.println(firstName == lastName);

	}

}
