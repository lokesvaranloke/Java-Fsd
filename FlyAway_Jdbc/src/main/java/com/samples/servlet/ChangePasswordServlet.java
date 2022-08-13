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
import javax.sql.DataSource;

import com.samples.domain.Admin;
import com.samples.service.AdminService;

@WebServlet("/ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AdminService adminService;
	
	@Resource(name = "jdbc/FlyAway_Jdbc")
	private DataSource datasource;
	
	public void init() throws ServletException {
		super.init();
		this.adminService = new AdminService(datasource);
	}
	
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if(password.length()==0){
			out.println("Empty password cannot be taken..");
		} else {
			Admin a1 = new Admin(0, name, email, password);
			adminService.changepassword(a1);
			System.out.println("Admin Password Changed Successfully");
			RequestDispatcher rd = request.getRequestDispatcher("/adminlogin.html");
			rd.forward(request, response);
		}
	
	}

}
