package com.filters.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter("/filterservlet")
public class namefilter extends HttpFilter implements Filter {

	private static final long serialVersionUID = 1L;


	public void destroy() {
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("In Filter");
		PrintWriter pw = response.getWriter();

		String uname = request.getParameter("uname");
		
		if(uname.length()>3) {
			chain.doFilter(request, response);
		} else {
			pw.println("Name length must be mini of 4 letters");
		}
		
	}


	public void init(FilterConfig fConfig) throws ServletException {

	}

}
