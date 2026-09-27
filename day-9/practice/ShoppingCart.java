//Write a method to calculate the total price of items in a shopping cart.
class ShoppingCart {
	
	static int finalPrice(int Iphone,int vivo,int oppo){
		return Iphone+vivo+oppo;
	}
	
    public static void main(String args[]) {

        int totalPrice = ShoppingCart.finalPrice(10000,20000,30000);
		
		System.out.println("Total Price :" + totalPrice);
    }
}
