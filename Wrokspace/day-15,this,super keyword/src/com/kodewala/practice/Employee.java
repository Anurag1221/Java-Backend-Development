package com.kodewala.practice;

public class Employee {
	String name;
	int salary;
	
	Employee(String _name, int _salary){
		this.name = _name;
		this.salary = _salary;
		
	}
	
	void displayEmployee() {
		System.out.println("name :" + name);
		System.out.println("salary :" + salary);
	}
}

class Manager extends Employee{
	
	String department;
	
	Manager(String name, int salary, String _department){
		
		super(name, salary);
		this.department = _department;
	}
	
	void displayManager() {
		super.displayEmployee();
		System.out.println("department :" + department);
	}
}
