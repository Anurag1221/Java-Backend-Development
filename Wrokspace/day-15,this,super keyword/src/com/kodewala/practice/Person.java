package com.kodewala.practice;

public class Person {
	String name = "Vijay";
	
}

class Student extends  Person{
	String name = "Anurag";
	
	void displayStudent() {
		System.out.println("Name :" + name);
		System.out.println("Name :" + super.name);
		
	}
}

//4. Student Name
//
//Create a parent class Person:
//
//String name = "Parent Name";
//
//Create a child class Student:
//
//String name = "Student Name";
//
//Create a method that prints:
//
//Student's name
//Parent's name using super.name
//
//Focus: super.variable.
