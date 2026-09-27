package com.kodewala.practice;

public class StudentDriver {
	
	int studentId;
	String studentName;
	int age;
	String course;
	
	StudentDriver(int _studentId, String _studentName,int _age,String _course){
		 
		studentId = _studentId;
		studentName = _studentName;
		age = _age;
		course = _course;
	}
	
	void displayDetails() {
		System.out.println("student Id :" + studentId);
		System.out.println("student Name :" + studentName);
		System.out.println("age :" + age);
		System.out.println("course :" + course);
		System.out.println();
	}
	
}



/*
 * 1. Student 
 * Create a Student class with instance variables:
 * 
 * studentId 
 * studentName
 *  age 
 *  course
 * 
 * Create a constructor and create 2 student objects. Display their details.
 */