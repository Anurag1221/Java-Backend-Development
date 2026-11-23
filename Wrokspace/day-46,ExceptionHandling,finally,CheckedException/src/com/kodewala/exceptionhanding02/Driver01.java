package com.kodewala.exceptionhanding02;

//checked exception
public class Driver01 {

	public static void main(String[] args) {

//		String name = null;
//		System.out.println(name.length()); // NullPou=interException

		String className = "com.kodewala.exceptionhanding02.Driver01";

		try {
			Class.forName(className); // loading the class into memory
			System.out.println("class loaded..");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block run");
		}
	}

}
