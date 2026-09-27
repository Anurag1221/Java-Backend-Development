class PrimeCheck{
	
	public static void main(String args[]){
		
		int firstNo = Integer.parseInt(args[0]);
		int count = 0;
		
		for(int i=1;i<=firstNo;i++){
			
			if(firstNo % i == 0){
				count++;
			}
		}
		
		
		if(count == 2){
			System.out.println("Prime no :" + firstNo);
		}else {
			System.out.println("Not a prime no :" + firstNo);
		}	
		
	}
}