package com.kodewala.practice;

class User{
	
	String userName;

	public User(String userName) {
		super();
		this.userName = userName;
	}
	
	
}

public class UserAccessProfile {

	public static void main(String[] args) {
		
		User user = new User("Anurag");
		User user1 = new User("Anurag");
		
		System.out.println(user == user); // true, compare the address, address is same
		System.out.println(user == user1); // false, both object are store in heap in different location and address are different
										  
		System.out.println(user.equals(user1)); // false , in outside String (.equals) method compare the address
	}

}

//1. UserAccessProfile
//
//Create a class:
//
//class UserAccessProfile {
//    String userName;
//
//    UserAccessProfile(String userName) {
//        this.userName = userName;
//    }
//}
//
//In main():
//
//UserAccessProfile user = new UserAccessProfile("Anurag");
//
//Task:
//
//Print the username.
//Create another object with "Anurag".
//Compare the two objects using ==.
//Compare their userName values using .equals().

//New concept: Constructor + String field + object reference.
