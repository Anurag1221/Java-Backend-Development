package com.kodewala.shallo_deep_copy;

public class Employee implements Cloneable{
	
	String name; // copy
	String empCode; //copy
	Address address; // HAS-A // copy only reference
	
	public Employee(String name, String empCode, Address address) {
		super();
		this.name = name;
		this.empCode = empCode;
		this.address = address;
	}
	
	public Object clone() throws CloneNotSupportedException {
		
		Employee e =  (Employee) super.clone();
		e.address = (Address) address.clone();
		return e;
	}
	
	
}
