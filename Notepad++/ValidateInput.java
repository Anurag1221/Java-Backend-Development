class ValidateInput{
	
	public static boolean validateInput(String input){
		
		if(input == null){
			return false;
		}
		if(input.trim().isEmpty()){
			return false;
		}
		return true;
	}
	
	public static void main(String args[]){
	
	String input = "Anurag";
	
	if (validateInput(input)) {
		System.out.println("Valid input");
	} else {
		System.out.println("Invalid input");
	}	
	
	}
}

//✓ Implement utility methods like validateInput(String input) to check user input for errors.

