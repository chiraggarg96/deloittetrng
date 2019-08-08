package com.delloite.customer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.deloitte.utility.DbUtility;

public class CustomerJDBCOperations {

	
	public static void printAllRecords() throws ClassNotFoundException, SQLException {
		
		Connection connection=DbUtility.getMyConnection();
			
		
	// create statement
			Statement statement=connection.createStatement();
			
		//execute the Statement 
			ResultSet res = statement.executeQuery("select * from hr.customer");
			
			while(res.next())
			{
				System.out.print(res.getString(1)+"  ");
				System.out.print(res.getString(2)+"  ");
				System.out.print(res.getString(3)+"  ");
				System.out.println(res.getString(4));
			}
	}
	
public static void insertrecordsThruPS(int cId,String cName, String cAddress,int cBill) throws ClassNotFoundException, SQLException {
		
	
	
	Connection connection=DbUtility.getMyConnection();
			
		
	// create statement
	//		Statement statement=connection.createStatement();
		PreparedStatement statement=connection.prepareStatement("insert into hr.customer values(?,?,?,?)");
		statement.setInt(1, cId);
		statement.setString(2, cName);
		statement.setString(3, cAddress);
		statement.setInt(4, cBill);
		
		//execute the Statement 
			int noOfRecords=statement.executeUpdate();
			
			
			//res.next();
		System.out.println(noOfRecords+ " records inserted");
	}

public static void insertrecords(int cId,String cName, String cAddress,int cBill) throws ClassNotFoundException, SQLException {
	
	Connection connection=DbUtility.getMyConnection();
			
		
	// create statement
			Statement statement=connection.createStatement();
			
		//execute the Statement 
			int noOfRecords=statement.executeUpdate("insert into hr.customer values(" + cId + ",'"+ cName + "','"+cAddress+"',"+cBill+")" );
			
			
			//res.next();
		System.out.println(noOfRecords+ " records inserted");
	}


public static void deleterecordsThruPS(int cId) throws ClassNotFoundException, SQLException {
		
	
	
	Connection connection=DbUtility.getMyConnection();
			
		
	// create statement
	//		Statement statement=connection.createStatement();
		PreparedStatement statement=connection.prepareStatement("delete from hr.customer where customerID=(?)");
		statement.setInt(1, cId);
		
		
		//execute the Statement 
			int noOfRecords=statement.executeUpdate();
			
			
			//res.next();
		System.out.println(noOfRecords+ " records deletes");
	}

}