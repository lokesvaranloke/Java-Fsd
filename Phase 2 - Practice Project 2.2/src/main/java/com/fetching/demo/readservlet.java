package com.fetching.demo;

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

@WebServlet("/readservlet")
public class readservlet extends HttpServlet {
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
		response.setContentType("text/html");
		
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from productdetails");
			PrintWriter pw = response.getWriter();
			pw.println("<html><body><table>");
			pw.println("<tr>");
			pw.println("<th>Product ID|</th>");
			pw.println("<th>Product Name|</th>");
			pw.println("<th>Product Colour|</th>");
			pw.println("<th>Product Price|</th>");
			pw.println("</tr>");
			
			while(rs.next()) {
				pw.println("<tr>");
				pw.println("<td>"+rs.getString(1)+"</td>");
				pw.println("<td>"+rs.getString(2)+"</td>");
				pw.println("<td>"+rs.getString(3)+"</td>");
				pw.println("<td>"+rs.getString(4)+"</td>");
				pw.println("</tr>");
			}
			pw.println("</table></body></html>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
