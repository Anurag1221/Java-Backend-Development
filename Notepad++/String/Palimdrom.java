class Palimdrom{
	
	public static void main(String args[]){
		
		int num =  1861;
		int temp = num;
		int rev = 0;
		
		while(num != 0){
			
				int digit = num % 10;
				rev = rev * 10 + digit;
				num = num / 10;
		}
		
		if(temp == rev){
			
			System.out.println("No. is Palimdrom");
		}
		else{
			
			System.out.println("No. is not Palimdrom");
		}
	}
}