class ShoppingBill{
	
	public static void main(String args[]){
	
		int price = 500;
		int quantity = 3;
		
		System.out.println("Total amount :" + (price*quantity));
		
		int discount = 100;
		
		int finalAmount = (price*quantity)-discount;
		
		System.out.println("Final amount :" + finalAmount);
	}
}