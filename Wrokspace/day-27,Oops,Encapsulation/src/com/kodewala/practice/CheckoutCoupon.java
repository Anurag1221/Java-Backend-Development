package com.kodewala.practice;

public class CheckoutCoupon {

	private int orderAmount;
	private int discountPercent;

	public CheckoutCoupon(int _orderAmount, int _discountPercent) {
		super();
		this.orderAmount = _orderAmount;
		this.discountPercent = _discountPercent;
	}

	void applyDiscount() {

		if (orderAmount <= 0) {

			System.out.println("please enter valid order amount");
			return;
		}

		if (discountPercent > 0 && discountPercent <= 50) {
			orderAmount = orderAmount - (orderAmount / 10);
		} else {
			System.out.println("Discount percentage invalid, minimum below 50%");

		}
	}

	public int getFinalAmount() {

		return orderAmount;
	}

}


//04
//
//E-commerce Coupon Validation
//Classes: CheckoutCoupon, OrderCheckoutConsole
//An online store applies a discount to an order.
//Requirements:
//- Keep orderAmount private.
//- Keep discountPercent private.
//- Accept discount percentages only from 0 to 50.
//- Create applyDiscount().
//- Reject negative order amounts.
//- Create getFinalAmount().
//Example: Order amount = ₹2,000, discount = 10%. Expected final amount = ₹1,800.
//New concept: Setters with validation and calculated values.
