package com.kodewala.practice;

public class DatabaseConnectionDriver {

	public static void main(String[] args) {
		DatabaseConnection data = new DatabaseConnection("apple", "Lan", "SQL101", "Anurag1221");
		
		data.displayDetails();
	}

}

//4. DatabaseConnection
//
//Create a class DatabaseConnection.
//
//Store:
//
//host
//port
//databaseName
//username
//
//Create constructors:
//
//DatabaseConnection()
//DatabaseConnection(String host)
//DatabaseConnection(String host, int port)
//DatabaseConnection(String host, int port, String databaseName, String username)
//
//Requirements:
//
//Use this() to chain constructors.
//Use default configuration values when information isn't supplied.
//Create a method that displays the connection configuration.
//
//Concept focus: Real backend configuration + constructor chaining.
