package com.products;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/productdetails")
public class productdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection conn;

	@Override
	public void init(ServletConfig config) throws ServletException {
		ServletContext context = config.getServletContext();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(context.getInitParameter("dburl"), context.getInitParameter("dbuname"),
					context.getInitParameter("dbpass"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		try (PreparedStatement st = conn.prepareStatement("select * from productdetails where productid=?");) {
			String productid = request.getParameter("productid");
			st.setNString(1, productid);
			
			PrintWriter pw = response.getWriter();
			ResultSet rs = st.executeQuery();
			if(productid==null) {
				pw.println("Invalid");
			} else {				

				if (rs.next()) {
					pw.println("<html><body><table>");
					pw.println("<tr>");
					pw.println("<th>ProductId</th>");
					pw.println("<th>ProductName</th>");
					pw.println("<th>ProductColour</th>");
					pw.println("<th>ProductPrice</th>");
					pw.println("</tr>");
					pw.println("<tr>");
					pw.println("<td>" + rs.getString(1) + "</td>");
					pw.println("<td>" + rs.getString(2) + "</td>");
					pw.println("<td>" + rs.getString(3) + "</td>");
					pw.println("<td>" + rs.getString(4) + "</td>");
					pw.println("</tr>");
					pw.println("</table></body></html>");
				} else {
					pw.println("No details found for id : "+productid);
				}
			}
			
		} catch (

		SQLException e) {
			e.printStackTrace();
		}

		
	}

}
