class BankStatic{
	
	//Static Variable
	static int interestRate = 5;
	
	public static void showInterestRate(){
		
		System.out.println("Interest Rate: " + interestRate);
	}
	
	public static void main(String args[]){
		
		//call the showInterestRate method
		BankStatic.showInterestRate();
		
	}
}
