package com.kodewla.control.flow;

public class MakeMyTripDiscount {
	
	public double setValues(String to, String from, double fare) {
		
		if(fare < 5000) {
			
		 System.out.println("Not applicable for discount");
			
		} else if (fare >= 5000 && fare <= 10000)
		{	
			fare = fare / 10;
			System.out.println("You are getting 10% discount :" + fare);
		}
		else if (fare >= 10000)
		{	
			
			fare = fare / 15;
			System.out.println("You are getting 15% discount :" + fare);
		}	
		else
		{
			fare = fare / 12.5;
			System.out.println("Maximum discount per person is 12.5% only :" + fare);
			
		}	
		
		return 0;
	}
}
