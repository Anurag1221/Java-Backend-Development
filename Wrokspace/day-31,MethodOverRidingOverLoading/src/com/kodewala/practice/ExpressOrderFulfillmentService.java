package com.kodewala.practice;

//Method overloading and overriding together.
//Parent references and child objects.
//Runtime polymorphism.
//Reusing validation logic.
//Method selection based on parameters and object type.

//parent class 
class OrderFulfillmentService {
	
	//valid  the order
	public void validateOrder(String orderId) {

		if (orderId == null) {
			System.out.println("Invalid order ID.");
		} else {
			System.out.println("Order validated: " + orderId);
		}
	}

	//process the order
	public void processOrder(String orderId) {

		validateOrder(orderId);

		if (orderId == null) {
			return;
		}

		System.out.println("Normal order processing: " + orderId);
	}

	//process the in priority level
	public void processOrder(String orderId, int priorityLevel) {

		validateOrder(orderId);

		if (orderId == null) {
			return;
		}

		System.out.println("Standard fulfillment with priority level: " + priorityLevel);
	}
}

//child class
public class ExpressOrderFulfillmentService extends OrderFulfillmentService {

	@Override
	public void processOrder(String orderId) {

		validateOrder(orderId);

		if (orderId == null) {
			return;
		}

		System.out.println("Normal order processing: " + orderId);
	}

	@Override
	public void processOrder(String orderId, int priorityLevel) {

		validateOrder(orderId);

		if (orderId == null) {
			return;
		}

		System.out.println("Standard fulfillment with priority level: " + priorityLevel);
	}

}

//E-commerce Order Fulfillment

//Classes: OrderFulfillmentService, ExpressOrderFulfillmentService, OrderFulfillmentConsole
//
//An e-commerce company processes normal and express orders. Normal orders follow the standard fulfillment process, while express orders need priority handling. Different callers can submit orders using an order ID or an order ID with a delivery priority.
//
//Requirements
//1. Create processOrder(String orderId) in the parent class.
//2. Overload it with processOrder(String orderId, int priorityLevel).
//3. Override both methods in ExpressOrderFulfillmentService.
//4. Add a validateOrder(String orderId) method in the parent class.
//5. Make both child methods validate the order before processing.
//6. Display different messages for normal and express processing.
//7. In OrderFulfillmentConsole, create a parent-class reference pointing to a child-class object.
//8. Call both overloaded methods using that reference.
//9. Observe which implementation executes for each call.
//New concepts:
//- Method overloading and overriding together.
//- Parent references and child objects.
//- Runtime polymorphism.
//- Reusing validation logic.
//- Method selection based on parameters and object type.
//Bonus challenge: What happens if you override only processOrder(String orderId) but not the two-parameter version?
