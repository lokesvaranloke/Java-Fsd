package com.storedprocedures.demo;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readaccountservlet") 
public class ReadAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection conn;
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		try {
			ServletContext context = config.getServletContext();
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(context.getInitParameter("dburl"),context.getInitParameter("dbuname"),context.getInitParameter("dbpass"));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doGet");
		try(Statement st = conn.createStatement();) {
			
			ResultSet rs = st.executeQuery("select * from account");
			PrintWriter pw = response.getWriter();
			pw.println("<table>");
			pw.println("<tr>");
			pw.println("<th>Account No</th>");
			pw.println("<th>First Name</th>");
			pw.println("<th>Last Name</th>");
			pw.println("<th>Balance</th>");
			pw.println("</tr>");
			while(rs.next()) {
				pw.println("<tr>");
				pw.println("<td>" + rs.getString(1) + "</td>");
				pw.println("<td>" + rs.getString(2) + "</td>");
				pw.println("<td>" + rs.getString(3) + "</td>");
				pw.println("<td>" + rs.getString(4) + "</td>");
				pw.println("</tr>");
			}
			pw.println("</table>");
			pw.write("<p><a href=\"home.html\">Home</a></p>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}
