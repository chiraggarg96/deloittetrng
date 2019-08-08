package com.deloitte.cust.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomAddressTag extends TagSupport {
	
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		JspWriter out= pageContext.getOut();
		
		try {
			out.println("<h2>hi everyone</hy2>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return super.doStartTag();
	}
	

}
