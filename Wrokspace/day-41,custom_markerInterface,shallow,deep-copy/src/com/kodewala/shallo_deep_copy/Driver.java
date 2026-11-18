package com.kodewala.shallo_deep_copy;

public class Driver {

	Address address;
	Employee employee;
	Employee employee1;

	public void doSomeThing() throws CloneNotSupportedException {

		address = new Address("Sunder tola lanji", "balaghat,lanji", "lanji");

		employee = new Employee("Auurag", "2566945", address);

		employee1 = (Employee) employee.clone();

		employee.address.city = "Bangalore";

		System.out.println(employee.address.city);
		System.out.println(employee1.address.city);
		
		
		address = null; // deallocate the memory of the address object
		employee = null; //deallocate the memory of the employee object 
		employee1 = null; // //deallocate the memory of the employee1 object 
		
		// 500 lines
		
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Driver driver =  new Driver();
		driver.doSomeThing();
	}

}
