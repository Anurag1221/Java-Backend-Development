package com.kodewala.polymorphism;

class User {

	public void doSomething() {

		System.out.println("User.doSomething()");
	}
}

class AdminUser extends User {

	@Override
	public void doSomething() {

		System.out.println("AdminUser.doSomething()");
	}
}

class FinanceUser extends AdminUser {

	@Override
	public void doSomething() {

		System.out.println("FinanceUser.doSomething()");
	}
}

public class Driver {

	public static void main(String[] args) {

//		User u1 = new User(); // User class is referring User class Object
//		AdminUser au1 = new AdminUser();

		// Runtime Polymorphism
//		User au2 = (User) new AdminUser(); // Parent class can refer child class object --> auto up-casting
//		au2.doSomething();

//		Object au3 = new FinanceUser(); 
//
		AdminUser au = (AdminUser) new User();// child class is referring parent class object --> down casting
		au.doSomething();

	}

}
