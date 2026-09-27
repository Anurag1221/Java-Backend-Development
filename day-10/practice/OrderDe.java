class OrderDe{
	
	public static void main(String args[]){
		
		OrderDetails OrDe = new OrderDetails();
		
		OrDe.orderId = 101;
		OrDe.customerName = "Arth";
		OrDe.totalAmount = 10000;
		
		OrDe.addDeliveryCharge(100);
		OrDe.showOrderSummary();
		
	}
}



