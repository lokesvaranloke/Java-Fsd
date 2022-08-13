package com.samples.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.samples.domain.Flight;

public class FlightService {

	private static DataSource datasource;
	
	public FlightService(DataSource datasource) {
		this.datasource = datasource;
	}

	public void addflight(Flight f1) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = datasource.getConnection();
			String sql = "insert into flight (name, source, destination,date,time,price) values (?,?,?,?,?,?)";
			st = conn.prepareStatement(sql);
			
			st.setString(1, f1.getName());
			st.setString(2, f1.getSource());
			st.setString(3, f1.getDestination());
			st.setString(4, f1.getDate());
			st.setString(5, f1.getTime());
			st.setInt(6, f1.getPrice());
			
			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, st, null);
		}
	}

	public List<Flight> getflight() {
		List<Flight> flights = new ArrayList<>();;
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			conn = datasource.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("select * from flight");

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String source = rs.getString(3);
				String destination = rs.getString(4);
				String date = rs.getString(5);
				String time = rs.getString(6);
				int price = rs.getInt(7);

				Flight f = new Flight(id,name, source, destination,date,time,price);
				flights.add(f);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, st, rs);
		}
		return flights;
	}
	
	private void close(Connection conn, Statement st, ResultSet rs) {
		try {
			if(rs !=null)
				rs.close();
			if (st != null)
				st.close();
			if (conn != null)
				conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Flight> checkflight(String sourcef, String destinationf, String datef) {
		List<Flight> flights = new ArrayList<>();;
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			conn = datasource.getConnection();
			String sql = "select * from flight where source =? and destination =? and date=?";
			st = conn.prepareStatement(sql);
			
			st.setString(1, sourcef);
			st.setString(2, destinationf);
			st.setString(3, datef);
			rs = st.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String source = rs.getString(3);
				String destination = rs.getString(4);
				String date = rs.getString(5);
				String time = rs.getString(6);
				int price = rs.getInt(7);

				Flight f = new Flight(id,name, source, destination,date,time,price);
				flights.add(f);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, st, rs);
		}
		return flights;
	}

}
