package com.kodewala.practice;

public class GymMembershipDriver {

	public static void main(String[] args) {
		GymMembership gym1 = new GymMembership();
		GymMembership gym2 = new GymMembership(101, "Anurag", "Monthly", 1);
		GymMembership gym3 = new GymMembership(102, "rag", "Quaterly", 6);
		
		
		gym1.displayDetails();
		gym2.displayDetails();
		gym3.displayDetails();
		

	}

}

//4. GymMembership 🏋️
//
//Create a GymMembership class with:
//
//membershipId
//memberName
//plan
//durationMonths
//
//Create constructors:
//
//GymMembership()
//GymMembership(int membershipId, String memberName)
//GymMembership(int membershipId, String memberName, String plan)
//GymMembership(int membershipId, String memberName, String plan, int durationMonths)
//
//Requirements:
//
//Use this() chaining.
//Default plan should be "Basic".
//Default duration should be 1 month.
//Create at least 3 membership objects.
//Display membership details.
