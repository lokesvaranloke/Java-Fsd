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

import com.samples.domain.Admin;
import com.samples.service.AdminService;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AdminService adminService;
	
	@Resource(name = "jdbc/FlyAway_Jdbc")
	private DataSource datasource;
	
	public void init() throws ServletException {
		super.init();
		this.adminService = new AdminService(datasource);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
			
		if(AdminService.checkadmin(name,email, password)) {
			System.out.println("Admin Login Successfull");
			session.setAttribute("name", name);
			response.sendRedirect("adminhome.jsp");
		} else {
			out.println("Invalid Admin Credentials..");
			RequestDispatcher rd = request.getRequestDispatcher("adminlogin.html");
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
			Admin a1 = new Admin(0, name, email, password);
			adminService.addadmin(a1);
			System.out.println("New Admin Created Successfully");
			RequestDispatcher rd = request.getRequestDispatcher("/adminhome.jsp");
			rd.forward(request, response);
		}
	}

}
