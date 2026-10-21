class ReverseArray{
	
	public static void main(String args[]){		
		
		int arr[] = {10,40,50,60,70};
		
		for(int i=0; i<arr.length; i++){
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		reverse(arr);
	}
	
	static void reverse(int arr[]){
		
		int size = arr.length;
		int start = 0;
		int end = size-1;
		
		
		while(start <= end){
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}	
			
		for(int i=0; i<arr.length; i++){
			
			System.out.print(arr[i] + " ");
		}
	}
	
}

//1.	Find the reverse element in an array. 