package com.deloitte;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductSum
 */
public class ProductSumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductSumServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String un =request.getParameter("product");
		String[] color=request.getParameterValues("product");
		int i=color.length;
		i=i*10;
		response.setContentType("text/html");
		
		response.getWriter().println("Hello  Your Bill Amount is "+ i );
		
		response.getWriter().println("<br><a href='LogoutServlet'>Payment</a>");
		
		
		
		
	}
}
