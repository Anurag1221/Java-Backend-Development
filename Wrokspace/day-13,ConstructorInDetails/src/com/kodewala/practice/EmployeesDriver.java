package com.kodewala.practice;

public class EmployeesDriver {

	public static void main(String[] args) {
		
		Employees emp = new Employees();
		Employees emp1 = new Employees(101, "Anurag");
		Employees emp2 = new Employees(102, "arth" ,"IT");
		Employees emp3 = new Employees(103, "Rahul", "Farma", 17000);
		
		emp.displayDetails();
		emp1.displayDetails();
		emp2.displayDetails1();
		emp3.displayDetails2();
		
	}

}
