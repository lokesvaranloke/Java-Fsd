package com.samples.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.samples.domain.User;
import com.samples.service.UserService;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userService;
	
	@Resource(name = "jdbc/FlyAway_Jdbc")
	private DataSource datasource;
	
	public void init() throws ServletException {
		super.init();
		this.userService = new UserService(datasource);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
			
		if(UserService.checkuser(name,email, password)) {
			System.out.println("User Login Successfull");
			session.setAttribute("name", name);
			response.sendRedirect("searchflight.jsp");
		} else {
			out.println("Invalid User..Create New User and login again");
			RequestDispatcher rd = request.getRequestDispatcher("userlogin.html");
			rd.include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if(name.length()==0 || email.length()==0||password.length()==0){
			out.println("Details missing..");
		} else {
			User u1 = new User(0, name, email, password);
			userService.adduser(u1);
			System.out.println("New User Created Successfully");
			RequestDispatcher rd = request.getRequestDispatcher("/userlogin.html");
			rd.forward(request, response);
		}
	}

}
