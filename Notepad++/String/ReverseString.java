class ReverseString{
	
	public static void main(String args[]){
		
		String str = "Anurag";
		String temp = "";
		
		for(int i = str.length()-1; i >= 0; i--){
			
			temp = temp +  str.charAt(i); 
		}
		
		System.out.println(str);
		System.out.println(temp);
	}
} 