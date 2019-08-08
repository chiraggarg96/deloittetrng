package com.deloitte.cms.dao;

import java.util.List;

import com.deloitte.cms.model.Customer;

public interface CustomerDAO {
	public List<Customer>  getAllCustomer();
	public boolean insertCustomer(Customer customer);
	public boolean updateCustomer(Customer customer);
	public boolean deleteCustomer(int customerID);
	public Customer searchCustomerById(int customerID);
	public boolean isCustomerExists(int customerId);
}
