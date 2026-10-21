class AverageOfArray{
	
	static double average(int arr[]){
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++){
			
			sum += arr[i];
		}
		int size = arr.length;
		double avg = sum/size; 
			
		return avg;
	}
	
	public static void main(String args[]){		
		
		int arr[] = {10,40,50};
		
		System.out.println("Average :" + average(arr));
	}
	
}

//1.	Find the average element in an array. 