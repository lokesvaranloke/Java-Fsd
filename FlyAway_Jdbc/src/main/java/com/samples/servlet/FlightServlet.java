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

@WebServlet("/FlightServlet")
public class FlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private FlightService flightService;
	
	@Resource(name = "jdbc/FlyAway_Jdbc")
	private DataSource datasource;
	
	public void init() throws ServletException {
		super.init();
		this.flightService = new FlightService(datasource);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Flight> flights = flightService.getflight();
		request.setAttribute("flights", flights);
		
		RequestDispatcher rd = request.getRequestDispatcher("/viewflight.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		int price = Integer.parseInt(request.getParameter("price"));
		
		if(name.length()==0 || source.length()==0||destination.length()==0||date.length()==0 || time.length()==0){
			out.println("Details missing..");
		} else {
			Flight f1 = new Flight(0, name, source, destination,date,time,price);
			flightService.addflight(f1);
			System.out.println("New Flight Inserted Successfully");
			List<Flight> flights = flightService.getflight();
			request.setAttribute("flights", flights);
			RequestDispatcher rd = request.getRequestDispatcher("/viewflight.jsp");
			rd.forward(request, response);
		}
	}

}
