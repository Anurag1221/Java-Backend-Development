package com.kodewala.marker.interfacee;

public class Account implements Cloneable{ //  cloneable give the permission to clone the current class object in another object

	String name;
	String address;
	String accNo;

	public Account(String name, String address, String accNo) {
		super();
		this.name = name;
		this.address = address;
		this.accNo = accNo;
	}
	
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("AccNo: " + accNo);
	}

	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	

}
