class LargestReturn{
	
	public static void main(String args[]){
		
		//command line argument
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println("Number :" + num1);
		System.out.println("Number :" + num2);
		
		//calling method 
		int Largest = LargestReturn.findLargest(num1,num2);
		System.out.println("Largest No. :" + Largest);
		
	}
	
	//creation of method
	static int findLargest(int num1,int num2){
		
		return (num1>num2 ? num1 : num2);
	}
}

	