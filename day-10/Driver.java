class Driver {

    public static void main(String args[]){
		
		System.out.println("Start driver class :");
		
		//create object of OrderMgmt class
		OrderMgmt objMgmt = new OrderMgmt();
		
		//calling the placeOrder method of class OrderMgmt
		objMgmt.placeOrder("Iphone");
		
		System.out.println("End driver class :");
		
    }

}