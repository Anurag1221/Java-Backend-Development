package com.kodewala.practice;

public class EmployeeDetails {
	int employeeId;
	String name;
	String department;
    int monthlySalary;
	
		
    EmployeeDetails(int _employeeId, String _name,String _department,int _monthlySalary){
		 
		employeeId = _employeeId;
		name = _name;
		department = _department;
		monthlySalary = _monthlySalary;
	}
	
	void displayDetails() {
		System.out.println("employee Id :" + employeeId);
		System.out.println("Name :" + name);
		System.out.println("department :" + department);
		System.out.println("monthlySalary :" + monthlySalary);
		System.out.println("Annual Salary :" + (monthlySalary*12));
		System.out.println();
	}
}

//Employee Salary
//Create an Employee class with:
//
//employeeId
//name
//department
//monthlySalary
//
//Create 3 objects. Create a method to calculate and display each employee's annual salary.
