package com.filters.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/filterservlet")
public class filterservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		System.out.println("In servlet");
		
		int uid = Integer.parseInt(request.getParameter("uid"));
		String uname = request.getParameter("uname");
		
		pw.println("Welcome "+uname+" your Id is "+uid);
	}



}
