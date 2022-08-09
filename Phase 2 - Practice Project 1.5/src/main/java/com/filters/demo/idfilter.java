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
public class idfilter extends HttpFilter implements Filter {

	private static final long serialVersionUID = 1L;

	public void destroy() {

	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("In filter");
		
		PrintWriter pw = response.getWriter();

		int uid = Integer.parseInt(request.getParameter("uid"));
		
		if(uid>=1) {
			chain.doFilter(request, response);
		} else {
			pw.println("Invalid id .. Id must be greater than 0");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
