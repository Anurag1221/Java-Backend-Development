package com.kodewala.array;

public class SbiDriver {

	public static void main(String[] args) {
		
		SbiBank customer1 = new SbiBank("anurag", 1000, 763700909);
		SbiBank customer2 = new SbiBank("anuj", 1500, 763700909);
		SbiBank customer3 = new SbiBank("arjun", 2900, 763700909);
		SbiBank customer4 = new SbiBank("rahul", 4500, 763700909);
		SbiBank customer5 = new SbiBank("arth", 2000, 763700909);
		SbiBank customer6 = new SbiBank("ashay", 500, 763700909);
		SbiBank customer7 = new SbiBank("anjali", 1700, 763700909);
		
		SbiBank customer[] = new SbiBank[7];
		
		customer[0] = customer1;
		customer[1] = customer2;
		customer[2] = customer3;
		customer[3] = customer4;
		customer[4] = customer5;
		customer[5] = customer6;
		customer[6] = customer7;
		
		for (int i = 0; i < customer.length; i++) {
		    
			if(customer[i].balance < 2000) {
				
				System.out.println(customer[i].customerName);
				System.out.println(customer[i].balance);
				System.out.println(customer[i].number);
				System.out.println();
			}
		}
	}

}
