package com.samples.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BookUserDetails")
public class BookUserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String number = request.getParameter("number");
		String cardnumber = request.getParameter("cardnumber");
		String expiremonth = request.getParameter("expiremonth");
		String cvv = request.getParameter("cvv");
		if(name.equals("")||email.equals("")||number.equals("")) {
			out.println("Please provide correct details");
		} else {
			out.print("<html>");
	        out.print("<body>");
	        out.print("<h3>");
	        out.println(" Name : "+name);
	        out.print("<br/>");
	        out.println(" Email : "+email);
	        out.print("<br/>");
	        out.println(" Number : "+number);
	        out.print("<br/>");
	        out.println(" CardNumber : "+cardnumber);
	        out.print("</h3>");
	        out.print("<br/>");
			out.println("<h2>Hello "+name+" .. Your flight ticket is successfully booked.</h2>");
			
	        out.print("<br/>");
	        out.print("<a href='searchflight.jsp'>Home</a>");
	        out.print("</body>");
	        out.print("</html>");
		}
	}

}
