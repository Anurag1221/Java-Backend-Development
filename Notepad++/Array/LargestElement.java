class LargestElement{

	public static void main(String args[]){
		
		int number[] = {20,30,90,40,10,70};
		int largest = number[0];
		
		for(int i=1; i<number.length; i++){
			
			if(number[i] >  largest){
				
				largest = number[i];
			}
		}
		System.out.println("Largest Element is :" + largest);
	
	}
	
}

//1.	Find the largest element in an array. 