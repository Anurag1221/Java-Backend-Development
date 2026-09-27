class Car {

    double calculateFinalPrice(int price) {

        // Local variable
        double discountRate = 10.0;

        // Calculate discount
        double discountAmount = price * discountRate / 100;

        // Calculate final price
        double discountedPrice = price - discountAmount;

        return discountedPrice;
    }

    public static void main(String args[]) {

        Car car = new Car();

        double finalPrice = car.calculateFinalPrice(500000);

        System.out.println("Final Price: " + finalPrice);
    }
}