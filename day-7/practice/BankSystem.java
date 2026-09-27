class BankSystem{
	
	//Instance Vaariable or Static Variable
	int balance;
	static String bankName;
	static int interestRate;
	
	public static void main(String args[]){
		
		//Creation of 2 objects
		BankSystem account1 = new BankSystem();
		BankSystem account2 = new BankSystem();
		
		//assign value in variable
		account1.balance=10000;
		account2.balance=25000;
		
		account1.bankName = "SBI";
		account1.interestRate = 6;
		
		//print the company Name
		System.out.println("Account Details 1 or 2");
		System.out.println("Account Balance1: " + account1.balance);
		System.out.println("Account Balance2: " + account2.balance);
		System.out.println("Bank Name: " + account1.bankName);
		System.out.println("Interest Rate: " + account1.interestRate);
	
	}
	
}
