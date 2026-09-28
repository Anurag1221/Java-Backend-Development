package com.kodewala.constructor;

public class User {
	String name;
	String type;
	String country;
	
	User(String _name, String _type, String _country){
		
		name = _name;
		type = _type;
		country = _country;
	}
	
	User(){
		//system is setting / init default value
		this("user123xs", "Guest", "India");// calling user class constructor.
	}
	
	void doSignup() {
		System.out.println("name :" + name );
		System.out.println("type :" + type);
		System.out.println("country :" + country);
	}
}
