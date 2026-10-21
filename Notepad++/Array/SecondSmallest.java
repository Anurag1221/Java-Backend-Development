class SecondSmallest{

	public static void main(String args[]){
		
		int number[] = {20,30,90,40,10,70};
		int largest = number[0];
		int secondSmallest = number[0];
		
		for(int i=1; i<number.length; i++){
			
			if(number[i] <  largest){
				
				secondSmallest = largest;
				largest = number[i];
			}
			else if(number[i] < secondSmallest && number[i] != largest)
			{
				secondSmallest = number[i];
			}
		}
		System.out.println("Second Largest Element is :" + secondSmallest);
	
	}
	
}

//1.	Find the smallest element in an array. 