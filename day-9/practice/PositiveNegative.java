class PositiveNegative{
	
	public static void main(String args[]){
		
		//command line argument
		int num1 = Integer.parseInt(args[0]);
		
		System.out.println("Check no Positive or Negative :" + num1);
		
		//calling method 
		PositiveNegative.checkNumber(num1);
		
	}
	
	//creation of method
	static int checkNumber(int num1){
	
		if(num1>0){
			System.out.println("No is Positive");
		}else{
			System.out.println("No is Negative");
		}
		return 0;
	}
}

	