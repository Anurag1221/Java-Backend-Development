//1].Design a class to represent a bank account where each account has a balance
//(instance variable), and all accounts share a single interest rate (static variable).


class BankAccount{
	
	//instance variable
	int accBalance;
	int accBalance1;
	
	//static variable
	static int intRate = 10;
	
    public static void main(String args[]){
		
	 	BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		
		account1.accBalance=10000;
		account2.accBalance1=20000;
		
		//insiance variable details print 
		System.out.println("Account Balance 1 :" + account1.accBalance);
		System.out.println("Account Balance 2 :" + account2.accBalance1);
		
		//static variable details print
		System.out.println("Placing an order for :" + BankAccount.intRate);
		
    }

}