package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Enter 1 for insert records , any other number for print records");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		if(opt==1)
		insertrecords();
		else
		printrecords();
		sc.close();
	}

	private static void printrecords() throws ClassNotFoundException, SQLException {
		//1. Load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. Make the connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:HR/HR@localhost:1521:XE", "system", "system");
			System.out.println("Siraa hi lag gya");
		
	// create statement
			Statement statement=connection.createStatement();
			
		//execute the Statement 
			ResultSet res = statement.executeQuery("select * from hr.employee");
			
			while(res.next())
			System.out.println(res.getString(4));
	}
	
	private static void insertrecords() throws ClassNotFoundException, SQLException {
		
		//1. Load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. Make the connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:HR/HR@localhost:1521:XE", "system", "system");
			//System.out.println("Siraa hi lag gya");
		
	// create statement
			Statement statement=connection.createStatement();
			
		//execute the Statement 
			int noOfRecords=statement.executeUpdate("insert into hr.employee values(1,'nfr','mumbai',952365 )");
			
			
			//res.next();
		System.out.println(noOfRecords);
	}

}
