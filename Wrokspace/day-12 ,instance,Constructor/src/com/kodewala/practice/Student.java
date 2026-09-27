package com.kodewala.practice;

public class Student {

	public static void main(String[] args) {
		
		StudentDriver student1 = new StudentDriver(101, "Anurag", 24, "Java Backend");
		StudentDriver student2 = new StudentDriver(102, "Ashay", 25, "Marketing");
		
		student1.displayDetails();
		student2.displayDetails(); 
	}

}

