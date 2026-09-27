package com.kodewala.practice;

public class Employees {
	int employeeId;
	String name;
	String department;
	int salary;
	
	Employees() {
		System.out.println("Product()");
	}
	
	Employees(int _employeeId, String _name) {
		this.employeeId = _employeeId;
		this.name = _name;
	}
	
	Employees(int _employeeId, String _name,String _department) {
		this.employeeId = _employeeId;
		this.name = _name;
		this.department = _department;
	}

	Employees(int _employeeId, String _name, String _department, int _salary) {
		this.employeeId = _employeeId;
		this.name = _name;
		this.department = _department;
		this.salary = _salary;
	}
	
	void displayDetails() {

		System.out.println("Employee Id :" + employeeId);
		System.out.println("name :" + name);
		System.out.println();
	}
	
	void displayDetails1() {

		System.out.println("Employee Id :" + employeeId);
		System.out.println("name :" + name);
		System.out.println("department :" + department);
		System.out.println();
	}

	void displayDetails2() {

		System.out.println("Employee Id :" + employeeId);
		System.out.println("name :" + name);
		System.out.println("department :" + department);
		System.out.println("salary :" + salary);
		System.out.println();
	}
}


//6. Employee Constructor Overloading + Chaining
//
//Create an Employee class:
//
//employeeId
//name
//department
//salary
//
//Create:
//
//Employee()
//Employee(int employeeId, String name)
//Employee(int employeeId, String name, String department)
//Employee(int employeeId, String name, String department, double salary)
//
//Requirements:
//
//Use constructor chaining with this().
//Avoid repeating the same initialization code.
//Create objects using all four constructors.
//Display the final values.