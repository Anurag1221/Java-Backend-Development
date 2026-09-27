class DigitalWallet {
	
	//private variable
	private String ownerName;
	private double walletBalance;
	//private int securityPin;
	
	//add money
	public void addMoney(double amount){
		
		if(amount > 0){
			walletBalance += amount; 
		}
		
		
	}
	
	//spend money
	public void spendMoney(double amount){
		
		if(amount > 0 && walletBalance >= amount){
			walletBalance -= amount; 
		}
	}
	
	//check Balance 
	public double checkBalance(){
		return walletBalance;
	}
	
}

class WalletApp{
	
	public static void main(String args[]){
		
		DigitalWallet DiWal = new DigitalWallet();
		
		//set values
		DiWal.addMoney(1000);
        DiWal.spendMoney(500);
       
		
		//get values
		System.out.println("Wallet Balance" + DiWal.checkBalance());
			
	}
}







