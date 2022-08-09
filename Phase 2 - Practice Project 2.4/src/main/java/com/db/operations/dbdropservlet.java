package com.db.operations;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dbdropservlet")
public class dbdropservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	Connection conn;
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		try {
			ServletContext context = config.getServletContext();
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(context.getInitParameter("dburl"),context.getInitParameter("dbuname"),context.getInitParameter("dbpass"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			PrintWriter pw = response.getWriter();
			Statement st = conn.createStatement();
			st.executeUpdate("drop database sampledb");
			pw.println("Database Droped : sampledb");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
