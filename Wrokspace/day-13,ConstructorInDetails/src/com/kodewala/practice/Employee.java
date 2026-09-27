package com.kodewala.practice;

public class Employee {
	int employeeId;
	String employeeName;
	int salary;

	Employee(int _employeeId, String _employeeName, int _salary) {
		this.employeeId = _employeeId;
		this.employeeName = _employeeName;
		this.salary = _salary;
	}

	void displayDetails() {

		System.out.println("Employee Id :" + employeeId);
		System.out.println("Employee Name :" + employeeName);
		System.out.println("Salary :" + salary);
		System.out.println();
	}
}

//2. Employee Parameterized Constructor
//
//Create an Employee class with:
//
//employeeId
//employeeName
//salary
//
//Requirements:
//
//Create a parameterized constructor accepting all three values.
//Assign constructor parameters to instance variables using this.
//Create two Employee objects with different values.
//Display their details.