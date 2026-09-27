class DrivingEligibility{
	
	public static void main(String args[]){
	
		int  age = 22;
		boolean hasLicense = true;
		
		if(age >= 18 && hasLicense==true){
			System.out.println("Eligible For Bike Ride");
		}else{
			System.out.println("Not Eligible For Bike Ride");
		}
	}
}