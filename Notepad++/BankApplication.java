class BankApplication{
	
	double balance = 0;
	
	public double deposit(double _amount){
		balance = balance + _amount;
		return balance;
	}
	
	
	public static void main(String args[]){
		
		BankApplication bank = new BankApplication();
		
		System.out.println("Chack Balance :" + bank.deposit(500));
		
	}
}


//✓ Bank Application:
//- Implement methods like deposit(double amount) and checkBalance() for basic
//banking operations.
