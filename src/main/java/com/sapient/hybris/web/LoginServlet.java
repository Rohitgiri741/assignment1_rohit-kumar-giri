package com.sapient.hybris.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();
			String userid = request.getParameter("userid");
			String password = request.getParameter("password");
			// validation
			// generally we verify the credentials by looking database table
			if (userid.equals("admin") && password.equals("admin@123")) {
				out.println("<html><body><h1>" + "Welcome, " + userid);
			} else {
				throw new Exception("Invalid Credentials");
			}

		} catch (Exception e) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND, e.getMessage());
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
