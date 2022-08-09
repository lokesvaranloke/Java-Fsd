package com.storedprocedures.demo;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/increasesalaryforaccounts") 
public class increasesalaryforaccounts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection conn;

	@Override
	public void init(ServletConfig config) throws ServletException {

		try {
			ServletContext context = config.getServletContext();
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(context.getInitParameter("dburl"), context.getInitParameter("dbuname"),
					context.getInitParameter("dbpass"));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		try {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			System.out.println("before");
			CallableStatement st = conn.prepareCall("call increase_salary_account(?,?)");
			st.setInt(1, 2);
			st.setInt(2, 23000);
			st.executeUpdate();
			pw.println("Stored Procedure executed");
			System.out.println("after");
			pw.write("<p><a href=\"home.html\">Home</a></p>");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}



}
