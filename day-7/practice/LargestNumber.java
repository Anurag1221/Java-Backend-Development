class LargestNumber{
	
	public static void main(String args[]){
	
		int Numbers[] = {100,50,40,70,60};
		int largest = Numbers[0];
		
		for(int i=1;i<Numbers.length;i++){
			
			if(Numbers[i] > largest){
				largest = Numbers[i];
			}
		}
		
		System.out.println(Numbers[0]);
		System.out.println(Numbers[1]);
		System.out.println(Numbers[2]);
		System.out.println(Numbers[3]);
		System.out.println(Numbers[4]);
		System.out.println("Largest " + largest);
		
	
	}
}