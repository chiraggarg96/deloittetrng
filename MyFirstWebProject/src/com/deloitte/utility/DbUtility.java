package com.deloitte.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtility {
	public static Connection getMyConnection() {
		
		
		FileReader reader = null;
		try {
			reader = new FileReader("C:\\deloitte\\eclipse\\MyFirstWebProject\\property.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			
			e1.printStackTrace();
		}
		Properties properties=new Properties();
		try {
			properties.load(reader);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Connection connection =null;
		
		String driver=properties.getProperty("driver");
		String url=properties.getProperty("url");
		String pass=properties.getProperty("password");
		String username=properties.getProperty("username");
		//1. Load the driver
				try {
					Class.forName(driver);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//2. Make the connection
				try {
					connection=DriverManager.getConnection(url, username, pass);
					//connection=DriverManager.getConnection(url, properties);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return connection;
	}

}
