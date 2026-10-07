package com.kodewala.string;

class User{
	
	String firstName;

	public User(String firstName) {
		super();
		this.firstName = firstName;
	}
	
}

public class Driver1 {

	public static void main(String[] args) {
		
		String city1 = "Bangalore";// one object create --> abc123
		
		String city2 = "Bangalore";//use the existing --> abc123

		//String city3 = "Bangalore";//use the existing --> abc123
		
		//String city4 = "Bangalore";//use the existing --> abc123
		
		//String city5 = "Bangalore";//use the existing --> abc123

		//String city6 = "Bangalore";//use the existing --> abc123
		
		System.out.println(city1 == city2); // (==) compare the referance of object in string
		//System.out.println(city1.equals(city2)); // (equals) compare the content of object in string
		
		User user1 = new User("kodewala");
		User user2 = new User("kodewala");
		
		System.out.println(user1.equals(user2)); // in object (equals method) that compare referance
		System.out.println(user1 ==  user2);
		
		String firstName = new String("Anurag");
		String lastName = new String("Anurag");

		System.out.println(firstName.equals(lastName));//in a string object equals method compare the content 

	}

}
