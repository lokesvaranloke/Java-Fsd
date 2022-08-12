package com.samples.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samples.domain.product;


@WebServlet("/productservlet")
public class productservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public productservlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		int id = Integer.parseInt(request.getParameter("productid"));
		String name = request.getParameter("productname");
		String color = request.getParameter("productcolor");
		double price = Double.parseDouble(request.getParameter("productprice"));
		
		product p1 = new product(id, name, color, price);
		request.setAttribute("data", p1.getproductdetails());
		RequestDispatcher rd = request.getRequestDispatcher("listproduct.jsp");
		rd.forward(request, response);
		
	}

}
