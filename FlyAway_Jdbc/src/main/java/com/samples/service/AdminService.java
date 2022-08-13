package com.samples.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.samples.domain.Admin;

public class AdminService {

	private static DataSource datasource;
	
	public AdminService(DataSource datasource) {
		this.datasource = datasource;
	}
	
	public void addadmin(Admin a1) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = datasource.getConnection();
			String sql = "insert into admin (name, email, password) values (?,?,?)";
			st = conn.prepareStatement(sql);
			
			st.setString(1, a1.getName());
			st.setString(2, a1.getEmail());
			st.setString(3, a1.getPassword());
			
			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, st);
		}
	}

	public static boolean checkadmin(String name, String email, String password) {
		
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		boolean b =false;
		
        try {
        	
        	conn = datasource.getConnection();
        	String sql = "select * from admin where name =? and email=? and password=?";
			st = conn.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, email);
            st.setString(3, password);
            rs =st.executeQuery();
            b = rs.next();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return b;                 
	}
	
	public void changepassword(Admin a1) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = datasource.getConnection();
			String sql = "update admin set password = ? where email =?";
			st = conn.prepareStatement(sql);
			
//			st.setString(1, a1.getName());
			st.setString(1, a1.getPassword());
			st.setString(2, a1.getEmail());
			
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, st);
		}
		
	}
	
	private void close(Connection conn, Statement st) {
		try {
			if (st != null)
				st.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}
