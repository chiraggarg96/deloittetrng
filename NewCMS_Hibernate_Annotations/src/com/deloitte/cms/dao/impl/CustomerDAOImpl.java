package com.deloitte.cms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	AnnotationConfiguration configuration = new AnnotationConfiguration().configure();

	SessionFactory factory = configuration.buildSessionFactory();
	Session session = factory.openSession();

	Transaction transaction = session.beginTransaction();

	@Override
	public List<Customer> getAllCustomer() {
		// Connection connection =DbUtility.getMyConnection();
		//List<Customer> customerList = new ArrayList<>();
		session=factory.openSession();
		Query query=session.createQuery("from com.deloitte.cms.model.Customer ");
		
		return query.list();
		/*Iterator<Customer> iterator=query.iterate();
		while(iterator.hasNext())
		{
			Customer customer=iterator.next();
			customerList.add(customer);
		}
		return customerList;*/
	}

	@Override
	public boolean insertCustomer(Customer customer) {

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		/* factory.close(); */
		return true;
	}

	@Override
	public boolean updateCustomer(Customer customer) {

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		session.update(customer);
		transaction.commit();
		return true;

	}

	@Override
	public boolean deleteCustomer(int customerID) {

		Session session2 = factory.openSession();

		Transaction transaction = session2.beginTransaction();
		Customer customer = new Customer();
		customer.setCustomerId(customerID);
		session.delete(customer);
		transaction.commit();
		/*
		 * session.close(); factory.close();
		 */
		return true;
	}

	@Override
	public Customer searchCustomerById(int customerID) {

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer = (Customer) session.get(Customer.class, customerID);
		transaction.commit();
		session.close();
		/* factory.close(); */

		return customer;
	}

	@Override
	public boolean isCustomerExists(int customerId) {

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer = (Customer) session.get(Customer.class, customerId);
		transaction.commit();
		session.close();
		// factory.close();
		if (customer == null)
			return false;
		return true;
	}

}
