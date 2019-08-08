package com.deloitte.client;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

import com.deloitte.cms.model.*;

public class Client {

	public static void main(String[] args) {
		//Customer customer=new Customer(175,"PreetIi","Delhi",9800);
		Customer customer=new PremiumCustomer(175,"PreetIi","Delhi",9800,99);
		//creates db connection
		Configuration configuration = new Configuration().configure();
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction transaction = session.beginTransaction(); 
		
		session.save(customer);
		transaction.commit();
		session.close();
		factory.close();
		
		
	}
}
