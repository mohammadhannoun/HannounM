package srs20120042;

public class Payment {

	private boolean payment;

	// default Constructor
	public Payment() {
		payment = false;
	}

	// Constructor that takes payment as an argument
	public Payment(boolean payment) {
		setPayment(payment);
	}

	// getter and setter for the payment atttribute
	public boolean isPayment() {
		return payment;
	}

	public void setPayment(boolean payment) {
		this.payment = payment;
	}

	// method to print the success of the payment process
	public void makePayment() {
		System.out.println("Payment has been made successfully");
	}

}
