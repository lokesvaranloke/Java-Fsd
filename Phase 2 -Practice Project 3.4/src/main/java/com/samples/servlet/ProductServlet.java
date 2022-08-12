package com.samples.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samples.domain.Product;
import com.samples.service.ProductService;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	ProductService productService;
	
	public void init() throws ServletException {
		super.init();
		this.productService=new ProductService();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<Product> products = this.productService.getProducts();
		request.setAttribute("products", products);
		
		RequestDispatcher rd = request.getRequestDispatcher("/viewproducts.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String productname = request.getParameter("productname");
		String productcolor = request.getParameter("productcolor");
		int productprice = Integer.parseInt(request.getParameter("productprice"));
		
		if(productname.length()==0 || productcolor.length()==0) {
			
			out.println("Values are missing - Empty field not accepted");
		} else {
			Product product = new Product(productname, productcolor, productprice);
			this.productService.addbook(product);
		
			List<Product> products = this.productService.getProducts();
			request.setAttribute("products", products);
		
			RequestDispatcher rd = request.getRequestDispatcher("/viewproducts.jsp");
			rd.forward(request, response);
		}
	}

}
