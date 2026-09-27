class Person {

    public void trackOrder(int orderId) {

        if (orderId == 101) {
            System.out.println("Order 101: Shipped");

        } else if (orderId == 102) {
            System.out.println("Order 102: Out for Delivery");

        } else if (orderId == 103) {
            System.out.println("Order 103: Delivered");

        } else {
            System.out.println("Order not found");
        }
    }

    public static void main(String args[]) {

        OrderTracking order = new OrderTracking();

        order.trackOrder(102);
    }
}

//Design a BankAccount class where the balance is private, a protected method calculates the
//interest, and a public method displays the account details. Explain why each access modifier
//is used

