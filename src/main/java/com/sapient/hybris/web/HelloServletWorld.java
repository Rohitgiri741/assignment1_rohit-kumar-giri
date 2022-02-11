package com.sapient.hybris.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServletWorld
 */
@WebServlet( name = "HelloWorldServlet", urlPatterns = { "/hello","/hello1"})
public class HelloServletWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//To write into response object
		PrintWriter out =response.getWriter();
		//to set MIME (Multi-purpose  Internet Mail Extension) types
		//default MIME type is text/html
		
		//renders response in plain text
//		response.setContentType("text/plain");
		
		//renders response in xml format
//		response.setContentType("text/xml");
		//Dynamically generating web page
		out.println("<html><body><h1>"+"Welcome to dynamic page"+"</h1></body></html>");
		
		//dynamically generating HTML table
		out.println("<html><body><table border='1'>");
		//reading all the request header names in Enumeration object
		Enumeration<String> enumeration= request.getHeaderNames();
		while(enumeration.hasMoreElements()) {
			String headerName= enumeration.nextElement();
			String headerValue= request.getHeader(headerName);
			//rendering request header names and its values
			out.println("<tr><th>"+headerName+"</th><td>"+headerValue+"</td></tr");
		}
		out.println("</table></body></html>");
		
		String string = request.getQueryString();
		System.out.println(string);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

