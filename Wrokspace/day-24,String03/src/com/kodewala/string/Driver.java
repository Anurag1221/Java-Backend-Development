package com.kodewala.string;

public class Driver {

	public static void main(String[] args) {
		 
		String s1 = "This " + "is from" + " kodewala academy";
		
		String s5  = "This is from kodewala academy";
		System.out.println(s1);
		System.out.println(s5 == s1);
		
		String s2 = "kodewala"; //scp
		String s3 = "Academy"; //scp
		
		String s4 = s2 + s3; //heap --> new StringBuilder();
		
		String s6 = "kodewalaAcademy"; //scp store in 
		System.out.println(s6 == s4.intern()); // intern use to move the object heap to scp,
										     //and if object previously available in scp, 
											//that new object locate the same object(pre created) address
		
		
		
		String ss = new String("kodewala"); // store heap
		String ss1  = new String("kodewala"); // store heap
		
		System.out.println(ss.intern() == ss1.intern()); // intern use to move to heap to scp object
														// ss or ss1 move into scp firstly
														// that if previously created that same so use it ,if not created so new object in scp
														// in current case object created previously s2 --> ss and ss1 object use the same address, not created new object in scp
  
	}

}
