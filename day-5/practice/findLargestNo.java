class LargestNo{
	
	public static void main(String args[]){
		
		int firstNo = Integer.parseInt(args[0]);
		int secondNo = Integer.parseInt(args[1]);
		int thirdNo = Integer.parseInt(args[2]);
		
		if(firstNo > secondNo && firstNo > thirdNo){
			System.out.println("Largest no. is :" + firstNo);
	
		} else if (secondNo > firstNo && secondNo > thirdNo){
			System.out.println("Largest no. is :" + secondNo);
			
		} else{
			System.out.println("Largest no. is :" + thirdNo);
		}
	}
}