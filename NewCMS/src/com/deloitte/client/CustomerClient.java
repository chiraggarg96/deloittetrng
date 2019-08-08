package com.deloitte.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.dao.impl.CustomerDAOImpl;
import com.deloitte.cms.model.Customer;

public class CustomerClient {

	public static void main(String[] args) {
	
		
		CustomerDAO customerDAO=new CustomerDAOImpl();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Menu");
		System.out.println("1. To check if Customer Exist by Id");
		System.out.println("2. Delete Customer by Id");
		System.out.println("3. Search Customer by Id");
		System.out.println("4. Update Customer by Id");
		System.out.println("5. Insert Customer");
		System.out.println("6. Get all Customer");
		
		int i=sc.nextInt();
		
		switch(i) {
		case 1:
		{
			System.out.println("Enter the ID");
			int id=sc.nextInt();
			boolean result=customerDAO.isCustomerExists(id);
			System.out.println(result);
			break;
		}
		case 2:
		{
			System.out.println("Enter the ID");
			int id=sc.nextInt();
			boolean result=customerDAO.deleteCustomer(id);
			System.out.println(result);
			break;
			
		}
		case 3:
		{
			System.out.println("Enter the ID");
			int id=sc.nextInt();
			
			Customer customer1 = new Customer();
			customer1 = customerDAO.searchCustomerById(id);
			System.out.println(customer1);
			break;
			
		}
		case 4:
		{
			Customer customer = new Customer();
			customer.setCustomerId(5);
			customer.setCustomerName("Ishita");
			customer.setCustomerAddress("Pune");
			customer.setBillAmount(586870);
			boolean result=customerDAO.updateCustomer(customer);
			System.out.println(result);
			break;
		}
		case 5:
		{
			Customer customer = new Customer();
			customer.setCustomerId(5);
			customer.setCustomerName("Ishita");
			customer.setCustomerAddress("Pune");
			customer.setBillAmount(586870);
			boolean result=customerDAO.insertCustomer(customer);
			System.out.println(result);
			break;
		}
		case 6:
		{
			List<Customer> customerList= new ArrayList<>();
			customerList=customerDAO.getAllCustomer();
			for(Customer cust:customerList)
				System.out.println(cust);
		}
		}
		
	}

}
