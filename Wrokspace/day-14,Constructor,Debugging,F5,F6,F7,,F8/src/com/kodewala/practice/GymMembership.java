package com.kodewala.practice;

public class GymMembership {
	int membershipId;
	String memberName;
	String plan;
	int durationMonths;
	
	
	GymMembership(){
		this(0, "Unknown");
		System.out.println("call first constructor");
	}
	
	GymMembership(int _membershipId, String _memberName){
		
		this(_membershipId, _memberName, "unknown");
		System.out.println("call second constructor");
	}
	
	GymMembership(int _membershipId, String _memberName, String _plan){
		
		this(_membershipId, _memberName, _plan, 0);
		System.out.println("call third constructor");
	}
	
	GymMembership(int _membershipId, String _memberName, String _plan, int _durationMonths){
		
		membershipId = _membershipId;
		memberName = _memberName;
		plan = _plan;
		durationMonths = _durationMonths;
		System.out.println("call fourth constructor");
	}
	
	void displayDetails() {
		System.out.println("membershipId :" + membershipId);
		System.out.println("memberName :" + memberName);
		System.out.println("plan :" + plan);
		System.out.println("durationMonths :" + durationMonths);
		System.out.println();
	}
}
