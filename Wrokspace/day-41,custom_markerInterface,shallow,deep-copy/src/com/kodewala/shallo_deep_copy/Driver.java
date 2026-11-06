package com.kodewala.shallo_deep_copy;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address("Sunder tola lanji", "balaghat,lanji", "lanji");
		
		Employee employee = new Employee("Auurag", "2566945", address);
		
		Employee employee1 = (Employee) employee.clone();
		
		employee.address.city = "Bangalore";
		
		System.out.println(employee.address.city);
		System.out.println(employee1.address.city);

	}

}
