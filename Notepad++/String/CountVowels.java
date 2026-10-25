class CountVowels {
	
	public static void main(String args[]){
		
		String ch = "Anurag Ramtekkar";
		int count = 0;
		
		for(int i = 0; i < ch.length(); i++){
			
			char str = ch.charAt(i);
			
			 if (str == 'a' || str == 'i' || str == 'o' ||
                str == 'u' || str == 'e' || str == 'A' ||
                str == 'I' || str == 'O' || str == 'U' ||
                str == 'E'){
				
				count++;
			}
		}
		
		//System.out.println("Count vowels" + str[0]);
		System.out.println("Count vowels" + count);
		
	}
} 