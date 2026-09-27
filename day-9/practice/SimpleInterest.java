class SimpleInterest{
	
	public static void main(String args[]){
		
		//command line argument
		double principal = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		double time = Double.parseDouble(args[2]);
		
		//calling method 
		double SI = SimpleInterest.calculateInterest(principal,rate,time);
		
		System.out.println("Simple Interest :" + SI);
		
	}
	
	//creation of method
	static double calculateInterest(double principal,double rate,double time){
		
		return ( (principal*rate*time)/100 );
	}
}

	