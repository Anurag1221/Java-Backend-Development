package com.kodewala.practice;

public class EmployeeDriver {

	public static void main(String[] args) {
			
		EmployeeDetails Driver1 = new EmployeeDetails(101, "Anurag", "CS", 27000);
		EmployeeDetails Driver2 = new EmployeeDetails(102, "Arth", "CS", 24000);
		EmployeeDetails Driver3 = new EmployeeDetails(103, "Rahul", "Farma", 12000);
		
		Driver1.displayDetails();
		Driver2.displayDetails();
		Driver3.displayDetails();
	}

}
