package com.samples.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.samples.domain.Flight;
import com.samples.service.FlightService;

@WebServlet("/ListFlightServlet")
public class ListFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private FlightService flightService;
	
	@Resource(name = "jdbc/FlyAway_Jdbc")
	private DataSource datasource;
	
	public void init() throws ServletException {
		super.init();
		this.flightService = new FlightService(datasource);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String date = request.getParameter("date");
		
		List<Flight> flights = flightService.checkflight(source, destination, date);
		request.setAttribute("flights", flights);
		
		RequestDispatcher rd = request.getRequestDispatcher("/searchresults.jsp");
		rd.forward(request, response);
		
	}

}
