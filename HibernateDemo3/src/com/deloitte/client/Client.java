package com.deloitte.client;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.deloitte.cms.model.Address;
import com.deloitte.cms.model.Customer;
import com.deloitte.cms.model.EmployeeDetails;

public class Client {

	public static void main(String[] args) {
		//Customer customer=new Customer(175,"Preeti","Delhi",9800);
		
		//creates db connection
		Configuration configuration = new Configuration().configure();
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		
		Transaction transaction = session.beginTransaction();
		Set allAddress=new HashSet();
		
		EmployeeDetails emp1= new EmployeeDetails(1,"Arun",95000);
		EmployeeDetails emp2= new EmployeeDetails(2,"Mohan",15000);
		EmployeeDetails emp3= new EmployeeDetails(3,"Amit",35000);
		
		Address address1= new Address(1,"Hyd","Telangana");
		Address address2= new Address(2,"Blr","Karanataka");
		
		allAddress.add(address1);
		allAddress.add(address2);
		
		emp1.setEmployeeAddress(allAddress);
		emp2.setEmployeeAddress(allAddress);
		
		
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		
		System.out.println("Succesfully");
		transaction.commit();
		session.close();
		factory.close();
	}
}
