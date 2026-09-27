class Discount {

    public static void main(String args[]) {

        double Price = 2000;
        double Discount = 10;
		double discountAmount = (Price/Discount);
		double finalPrice = Price-(Price/Discount);
		
        System.out.println("Price " + Price);
        System.out.println("Discount: " + Discount);
		System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Price: " + finalPrice);
    }
}