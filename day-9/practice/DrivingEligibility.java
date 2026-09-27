class DrivingEligibility{
	
	public static void main(String args[]){
		
		//command line argument
		int age = Integer.parseInt(args[0]);
		
		System.out.println("Age :" + age);
		
		//calling method 
		DrivingEligibility.checkEligibility(age);
		
	}
	
	//creation of method
	static int checkEligibility(int age){
		
		if(age >= 18){
			System.out.println("Eligible to drive");  
		}else{
			System.out.println("Not eligible");  
		}
		
		return 0;
	}
}

	