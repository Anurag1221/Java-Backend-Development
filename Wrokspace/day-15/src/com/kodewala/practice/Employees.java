package com.kodewala.practice;

public class Employees {
	int employeeId;
	String name;
	
	Employees(){
		this(0);
	}
	
	Employees(int _employeeId){
		this(_employeeId,"Unknown");
	}
	
	Employees(int _employeeId, String _name){
		employeeId = _employeeId;
		name = _name;
	}
	
	void displayEmployees() {
		System.out.println("employeeId :" + employeeId);
		System.out.println("name :" + name);
	}
	
}

class Developer extends Employees {
	
	int employeeId;
	String name;
	String programmingLanguage;
	
	Developer(){
		super();
		this.programmingLanguage = "Not Assignrd";
	}
	
	Developer(int _employeeId){
		super(_employeeId);
		this.programmingLanguage = "Not Assignrd";
	}
	
	Developer(int _employeeId, String _name){
		super(_employeeId, _name);
		this.programmingLanguage = "Not Assignrd";
	}
	
	Developer(int _employeeId, String _name, String _programmingLanguage){
		super(_employeeId, _name);
		this.programmingLanguage = _programmingLanguage;
	}
	
	void displayDeveloper() {
		super.displayEmployees();
		
		System.out.println("programmingLanguage :" + programmingLanguage);
	}
	
	
}

//6. Employee Constructor Chaining
//
//Create a parent class Employee with:
//
//Employee()
//Employee(int employeeId)
//Employee(int employeeId, String name)
//
//Create a child class Developer with:
//
//Developer()
//Developer(int employeeId)
//Developer(int employeeId, String name)
//Developer(int employeeId, String name, String programmingLanguage)
//
//Requirements:
//
//Use super() from the child constructors.
//Use constructor chaining wherever appropriate.
//Do not duplicate initialization unnecessarily.
//Display all employee and developer details.
//
//Focus: super() with constructor overloading and chaining.
