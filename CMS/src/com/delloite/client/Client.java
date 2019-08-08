package com.delloite.client;

import java.sql.SQLException;
import java.util.Scanner;

import com.delloite.customer.db.CustomerJDBCOperations;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("\n Menu");
		System.out.println("1. Display All Customers");
		System.out.println("2. Insert the records ");
		System.out.println("3. Insert the records through Prepared Statement");
		System.out.println("4. Delete the records through Prepared Statement");
		
		
		Scanner sc= new Scanner(System.in);
		int opt= sc.nextInt();
		
		if(opt==1)
			CustomerJDBCOperations.printAllRecords();
		else if (opt==2)
		{	
			System.out.println("Enter customer ID");
			int cId=sc.nextInt();
			System.out.println("Enter customer name");
			String cName=sc.next();
			System.out.println("Enter customer Address");
			String cAddress=sc.next();
			System.out.println("Enter customer billamount");
			int cBill=sc.nextInt();
			CustomerJDBCOperations.insertrecords(cId,cName,cAddress,cBill);
		}
		else if (opt==3)
		{	
			System.out.println("Enter customer ID");
			int cId=sc.nextInt();
			System.out.println("Enter customer name");
			String cName=sc.next();
			System.out.println("Enter customer Address");
			String cAddress=sc.next();
			System.out.println("Enter customer billamount");
			int cBill=sc.nextInt();
			CustomerJDBCOperations.insertrecordsThruPS(cId, cName, cAddress, cBill);
		}
		else if (opt==4)
		{	
			System.out.println("Enter customer ID");
			int cId=sc.nextInt();
			CustomerJDBCOperations.deleterecordsThruPS(cId);
		}
	}

}
