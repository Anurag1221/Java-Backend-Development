package com.kodewala.memoryLeak.practice01;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	
	byte[] str;
	
	public Driver(byte[] str) {
		super();
		this.str = str;
	}
	
	public void displayDetails() {
		
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		 List<Driver> list = new ArrayList<>();
		 
		for (int i = 0; i < 1000000; i++) {
			
			Driver driver = new Driver(new byte[1024 * 1024]);
			list.add(driver);
			driver.displayDetails();
			
		}

	}

}

//task
//you create a small program 
//now you know how to set the heap size -- minimum 100mb
//write 1 for loop ,you keep on creating objects , but do not nully fied

//capture thread dump or heap dump
//when out of memory occurs

//save that file to particular location
//it will give the heap dump data, and you can analyse it.
