class CountWords {
	
	public static void main(String args[]){
		
		String ch = "Anurag Ramtekkar";
		int count = 0;
		
		for(int i = 0; i < ch.length(); i++){
			
			if(ch.charAt(i) == ' '){
				count++;
			}	
		}
		
		System.out.println("Count Words" + count);
		
	}
} 