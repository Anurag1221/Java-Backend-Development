package com.kodewala.marker.interfacee;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//object 1
		Account acc = new Account("Anurag", "Balaghat", "7667355336");
		
		// object 2 copy the data of the object 1
		Account acc1 = (Account) acc.clone(); //trying to clone object(xerox / copy)
		acc1.displayDetails();
		
		//check the object clone done or not
		if(acc instanceof Cloneable) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
