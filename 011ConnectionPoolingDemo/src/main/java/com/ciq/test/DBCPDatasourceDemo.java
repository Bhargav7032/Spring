package com.ciq.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class DBCPDatasourceDemo {
	public  static void main(String []args) {
		BasicDataSource basicDataSource = new BasicDataSource() ;
		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/joins");
		basicDataSource.setUsername("root");
		basicDataSource.setPassword("root");
		
		
		
		// DBCP configuration
		basicDataSource.setInitialSize(5); // Initial number of connections
		basicDataSource.setMaxTotal(10);    // Maximum number of connections
		basicDataSource.setMaxIdle(5);     // Maximum number of idle connections
		basicDataSource.setMinIdle(2);     // Minimum number of idle connections
		basicDataSource.setMaxWaitMillis(10000); // Maximum time to wait for a connection (milliseconds)

		
		try {
			Connection connection=basicDataSource.getConnection();
			System.out.println(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
