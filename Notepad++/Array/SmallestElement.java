class SmallestElement{

	public static void main(String args[]){
		
		int number[] = {20,30,90,40,10,70};
		int smallest = number[0];
		
		for(int i=1; i<number.length; i++){
			
			if(number[i] <  smallest){
				
				smallest = number[i];
			}
		}
		System.out.println("Smallest Element is :" + smallest);
	
	}
	
}

//1.	Find the smallest element in an array. 