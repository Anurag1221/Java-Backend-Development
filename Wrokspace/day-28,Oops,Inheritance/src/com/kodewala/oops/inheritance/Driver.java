package com.kodewala.oops.inheritance;

class Employee{ //parent class
	
	String name = "Amit";
	String address = "Bangalore";
	
	private String empCode = "IC1234";
	
	public void markID(String empID) {
		
		System.out.println("Marking IN :" + empID);
	}
}

//child class
class Manager extends Employee{ // Manager IS-A Employee
	
	public void doSomeThing(){
		
		System.out.println(name); //using the parent class attributes
		System.out.println(address);
		//System.err.println(empcode); // private variable not extend to another class,use within the class only
		markID("AR6272"); //using the parent class method
	}
}
public class Driver { 

	public static void main(String[] args) {
		
		// account --> savingAccount
//		SavingAccount bank = new SavingAccount();
//		bank.openSavingAccount("Anurag" , "Lanji", "Saving Account");

		Manager manager = new Manager();
		
		manager.doSomeThing();
	}

}
