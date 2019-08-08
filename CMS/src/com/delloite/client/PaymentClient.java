package com.delloite.client;

public class PaymentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment payment1=Payment.getPaymentObj();
		Payment payment2=Payment.getPaymentObj();
		Payment payment3=Payment.getPaymentObj();
		
		payment1.pay(9000);
		payment2.pay(9000);
		payment3.pay(9000);
		
	}

}
