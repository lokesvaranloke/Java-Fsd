package com.samples.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mysql.cj.protocol.Resultset;
import com.samples.domain.User;

public class UserService {

	private static DataSource datasource;
	
	public UserService(DataSource datasource) {
		this.datasource = datasource;
	}
	
	public void adduser(User u1) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = datasource.getConnection();
			String sql = "insert into user (name, email, password) values (?,?,?)";
			st = conn.prepareStatement(sql);
			
			st.setString(1, u1.getName());
			st.setString(2, u1.getEmail());
			st.setString(3, u1.getPassword());
			
			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, st);
		}
	}

	public static boolean checkuser(String name, String email, String password) {
		
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		boolean b =false;
		
        try {
        	
        	conn = datasource.getConnection();
        	String sql = "select * from user where name =? and email=? and password=?";
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
