class OrderDetails {
	
	//library file connected with LibraryBook
	int orderId;
	String customerName;
	double totalAmount;
	
	//default access modifire
	void addDeliveryCharge(double charge){
		
		totalAmount = totalAmount + charge;
			
	}
	
	//default access modifire
	void showOrderSummary(){
		
		System.out.println("Order Id :" + orderId);
		System.out.println("Customer Name :" + customerName);
		System.out.println("Total Amount :" + totalAmount);
	}
	
}



