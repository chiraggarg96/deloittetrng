package com.delloite.client;

public class Payment {
	static Payment payment=new Payment();
	
	private Payment() {
		System.out.println("Object of Payment created");
	}

	public static Payment getPaymentObj() {
		return payment;
		
	}
	public void pay(int amount) {
		System.out.println("Payment done of INR:" + amount);
	}
}
