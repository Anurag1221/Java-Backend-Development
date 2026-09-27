class OrderTracking {

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


//✓ Order Tracking System:
//- Write a method trackOrder(int orderId) that simulates fetching the current status of
//an order.
