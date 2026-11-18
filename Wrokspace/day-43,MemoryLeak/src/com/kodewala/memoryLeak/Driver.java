package com.kodewala.memoryLeak;

//Unwanted objects are available in the heap , and thus object occupite the space, because of thus object are unable to create new objects 
//if space is not available ,application will be crash, and application throw outofmemory error
//this seanario called memoryLeak in java 

// Temprorary solve memory leak
//Increase the heap size if possible
//Restart the application - Workaround

//How to identity permanent fix //memory leak
//Thread Dump :- It is type of MRI
// Thread Dump will capture the all satate of the threat during that time when memory , out of memory occur
// Thread Dump If out of memory error, please capture the thread dump


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
		
		
		address = null; // deallocate the memory of the address object // can be removed by GC
		employee = null; //deallocate the memory of the employee object //  can be removed by GC
		employee1 = null; // //deallocate the memory of the employee1 object // can be removed by GC
		
		// 500 more lines.......
		
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Driver driver =  new Driver();
		driver.doSomeThing();
	}

}
