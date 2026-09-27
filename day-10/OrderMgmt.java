class OrderMgmt {

	private int orderValue = 1200;
	
    public static void placeOrder(String itemName){
		
		OrderMgmt objMgmt = new OrderMgmt();
		
		//using private variable with in the same class
		System.out.println("Order valur :" + objMgmt.orderValue);
		
		System.out.println("Placing an order for :" + itemName);
		
    }

}