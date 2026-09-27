class StudentResult{
	
	public static void main(String args[]){
		
		//command line argument
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		
		//calling method 
		int totalMark = StudentResult.calculateTotal(num1,num2,num3);
		System.out.println("Total Marks :" + totalMark);
		
		double average = StudentResult.calculateAverage(totalMark);
		System.out.println("Average :" + average);
		
		String result = StudentResult.findResult(average);
		System.out.println("Result :" + result);
	
	}
	
	//creation of method
	static int calculateTotal(int num1,int num2,int num3){
		
		return ( (num1+num2+num3) );
	}
	
	static double calculateAverage(int totalMark){
		
		return ( (totalMark)/3.0 );
	}
	
	static String findResult(double average){
		
		return average>=40 ? "Pass": "Fail";
	}
	
}

	