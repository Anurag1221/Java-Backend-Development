class ShiftArray{
	
	public static void main(String args[]){		
		
		int arr[] = {10,40,50,60,70};
		
		for(int i=0; i<arr.length; i++){
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		shiftArray(arr);
	}
	
	static void shiftArray(int arr[]){
		
		int size = arr.length;
		int team = arr[size-1];
	
		//shift the array by 1 position
		for(int i= size-1; i>0; i--){
			
			arr[i] = arr[i-1];
		}
		arr[0] = team;
		
		
		//shift 1 position array print
		for(int i=0; i<arr.length; i++){
			
			System.out.print(arr[i] + " ");
		}
	}
	
}

//1.	shift array element by 1 position