package com.kodewala.polymorphism.down_casting;
	
class Person{
		
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Person p = (Person) obj;
		return p.name.equals(this.name);
	}
	
	
}

public class Driver {

	public static void main(String[] args) {
		
		Person p = new Person("shreya");
		Person p1 = new Person("shreya");
		System.out.println(p.equals(p1));

	}

}
