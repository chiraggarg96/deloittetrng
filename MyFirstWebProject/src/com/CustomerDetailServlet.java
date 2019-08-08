package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.dao.impl.CustomerDAOImpl;
import com.deloitte.cms.model.Customer;

/**
 * Servlet implementation class CustomerDetailServlet
 */
public class CustomerDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int customerID =Integer.parseInt(request.getParameter("customerId"));
		String customerName =request.getParameter("customerName");
		String customerAddress =request.getParameter("customerAddress");
		int billAmount =Integer.parseInt(request.getParameter("billAmount"));
		
		//response.setContentType("text/html");
		//response.getWriter().println("<h1>Hello " + customerID + customerName + customerAddress +billAmount );
		
		Customer customer= new Customer();
		customer.setCustomerName(customerName);
		customer.setCustomerId(customerID);
		customer.setCustomerAddress(customerAddress);
		customer.setBillAmount(billAmount);
		
		CustomerDAO customerDAO=new CustomerDAOImpl();
		
		customerDAO.insertCustomer(customer);
		
		
	}

}
