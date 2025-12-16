package com.jdbc.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchProcessing {
	private static Connection connection;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String URL = "jdbc:mysql://localhost:3306/javajdbc";
		String USERNAME = "root";
		String PASSWORD = "admin";
		PreparedStatement pstmt;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);

			Program2.display(connection);

			String INSERT="insert into employee (id,name,email,department,salary)"
					+ "values(?,?,?,?,?)";

			Scanner sc = new Scanner(System.in);
			String choice;
			pstmt=connection.prepareStatement(INSERT);
			do {

				System.out.println("enter the id");
				int id=sc.nextInt();
				System.out.println("enter the name");
				String name=sc.next();
				System.out.println("enter the email");
				String email=sc.next();
				System.out.println("enter the department");
				String dept=sc.next();
				System.out.println("enter the salary");
				int salary=sc.nextInt();



				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setString(3, email);
				pstmt.setString(4,dept);
				pstmt.setInt(5, salary);

				pstmt.addBatch();				

				System.out.println("do you want to enter more employees?(yes/no)");
				choice =sc.next();
				
			}while(choice.equalsIgnoreCase("yes"));
			
			int []res =pstmt.executeBatch();
			
			for(int i:res) {
				System.out.println(i);
			}
			
			Program2.display(connection);

		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
