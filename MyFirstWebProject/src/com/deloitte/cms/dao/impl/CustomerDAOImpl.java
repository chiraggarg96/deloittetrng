package com.deloitte.cms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.model.Customer;
import com.deloitte.utility.DbUtility;

public class CustomerDAOImpl implements CustomerDAO {

	private static final String  SELECT_ALL_CUSTOMER_QUERY= "Select * from hr.customer";
	private static final String  SELECT_CUSTOMER_QUERY= "Select * from hr.customer where customerId=(?)"; 
	private static final String  DELETE_CUSTOMER_QUERY= "Delete from hr.customer where customerID=(?)";
	private static final String  UPDATE_CUSTOMER_QUERY= "Update hr.customer set customerName=(?),customerAddress=(?),billAmount=(?) where Customerid=(?)";
	private static final String  INSERT_CUSTOMER_QUERY= "Insert into hr.customer values(?,?,?,?)";

	@Override
	public List<Customer> getAllCustomer() {
		Connection connection =DbUtility.getMyConnection();
		List<Customer> customerList= new ArrayList<>(); 
		try {
			PreparedStatement statement= connection.prepareStatement(SELECT_ALL_CUSTOMER_QUERY);
			ResultSet resultSet=statement.executeQuery();
			while(resultSet.next())
				
			{	
				Customer customer = new Customer();
				customer.setCustomerId(resultSet.getInt(1));
				customer.setCustomerName(resultSet.getString(2));
				customer.setCustomerAddress(resultSet.getString(3));
				customer.setBillAmount(resultSet.getInt(4));
				customerList.add(customer);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return customerList;
	}

	@Override
	public boolean insertCustomer(Customer customer) {
		Connection connection =DbUtility.getMyConnection();
		int result=0;
		try {
			PreparedStatement statement= connection.prepareStatement(INSERT_CUSTOMER_QUERY);
			statement.setInt(1,customer.getCustomerId());
			statement.setString(2,customer.getCustomerName());
			statement.setString(3,customer.getCustomerAddress());
			statement.setInt(4,customer.getBillAmount());
			result=statement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result>0)
			return true;
		return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		Connection connection =DbUtility.getMyConnection();
		try {
			PreparedStatement statement= connection.prepareStatement(UPDATE_CUSTOMER_QUERY);
			statement.setInt(4,customer.getCustomerId());
			statement.setString(1,customer.getCustomerName());
			statement.setString(2,customer.getCustomerAddress());
			statement.setInt(3,customer.getBillAmount());
			int result=statement.executeUpdate();
			if(result>0)
				return true;
			return false;	
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteCustomer(int customerID) {
		Connection connection =DbUtility.getMyConnection();
		try {
			PreparedStatement statement= connection.prepareStatement(DELETE_CUSTOMER_QUERY);
			statement.setInt(1,customerID);
			int result=statement.executeUpdate();
			if(result>0)
				return true;
			return false;	
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Customer searchCustomerById(int customerID) {
		Connection connection =DbUtility.getMyConnection();
		Customer customer= new Customer();
		try {
			PreparedStatement statement= connection.prepareStatement(SELECT_CUSTOMER_QUERY);
			statement.setInt(1,customerID);
			ResultSet resultSet=statement.executeQuery();
			resultSet.next();
			customer.setCustomerId(resultSet.getInt(1));
			customer.setCustomerName(resultSet.getString(2));
			customer.setCustomerAddress(resultSet.getString(3));
			customer.setBillAmount(resultSet.getInt(4));
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

		return customer;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		Connection connection =DbUtility.getMyConnection();
		boolean isexist=false;
		try {
			PreparedStatement statement= connection.prepareStatement(SELECT_CUSTOMER_QUERY);
			statement.setInt(1,customerId);
			ResultSet resultSet=statement.executeQuery();
			if (resultSet.next())
				isexist=true;


		} catch (SQLException e) {
			e.printStackTrace();
		}

		return isexist;
	}

}
