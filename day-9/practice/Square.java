class Square{
	
	public static void main(String args[]){
		
		//command line argument
		int num1 = Integer.parseInt(args[0]);
		
		System.out.println("Number :" + num1);
		
		//calling method 
		Square.findSquare(num1);
		
	}
	
	//creation of method
	static int findSquare(int num1){
	
		System.out.println("Square :" + (num1*num1));
		
		return 0;
	}
}

	