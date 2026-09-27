class EvenOdd{
	
	public static void main(String args[]){
		
		int num1 = Integer.parseInt(args[0]);
		
		System.out.println("Check no Even or Odd :" + num1);
		
		EvenOdd.checkEvenOdd(num1);
		
	}
	
	//creation of method
	static int checkEvenOdd(int num1){
	
		if(num1%2==0){
			System.out.println("No is even");
		}else{
			System.out.println("No is odd");
		}
		return 0;
	}
}

	