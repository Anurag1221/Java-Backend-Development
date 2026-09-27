package com.kodewala.practice;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Employee emp = new Employee(101, "Anurag", 27000);
		Employee emp1 = new Employee(102, "kunal", 70000);
		
		emp.displayDetails();
		emp1.displayDetails();

	}

}
