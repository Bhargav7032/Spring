package com.ciq.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		
		Connection connection = null;	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
			System.out.println(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
