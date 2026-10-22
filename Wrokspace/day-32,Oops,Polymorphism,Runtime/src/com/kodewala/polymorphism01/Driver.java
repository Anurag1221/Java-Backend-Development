package com.kodewala.polymorphism01;


//Runtime polymorphism means the method to be called is decided at runtime,
//based on the actual object.
//- It is achieved through method overriding.
//- It requires inheritance.
//- The parent and child classes have the same method signature.
//- It is also called dynamic polymorphism.

class Employee {

	public void markIn() {

		System.out.println("Employee.markIn()............. Employee Marking In");
	}
}

class HRManager extends Employee {
	
	@Override
	public void markIn() {

		System.out.println("HRManager.markIn()......... HRManager Marking IN");
	}
	
//	public void hashCode() {
//
//		System.out.println("HRManager.markIn()......... HRManager Marking IN");
//	}
	
}

public class Driver {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(); 
		e1.markIn();
		
		//Runtime Polymorphism
		Employee e2 = new HRManager(); // Parent class refer to the child class
		
		e2.markIn();// Same method will have differently based on the actual object.
		//System.out.println(e2.hashCode());
		//1.At the time of compilation, it will check the method's exist in class
		//2. at the time execution(while running), it will call the method on actual object
	}

}
