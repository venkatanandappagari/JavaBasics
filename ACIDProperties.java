package com.jdbc.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ACIDProperties {
	private static final String URL = "jdbc:mysql://localhost:3306/javajdbc";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "admin";
	private static Connection connection;
	private static final String Update_Sender="update employee set salary=salary - ? where lower(trim((name))) = lower(trim(?))";
	private static final String Update_Receiver="update employee set salary=salary + ? where lower(trim((name))) = lower(trim(?))";
	private static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection =DriverManager.getConnection(URL,USERNAME,PASSWORD);

			Program2.display(connection);

			connection.setAutoCommit(false);

			transaction();

			Program2.display(connection);			

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void transaction() throws SQLException {
		System.out.println("enter the name of the sender");
		String sender=scan.next();
		
		System.out.println("enter the name of the receiver");
		String receiver=scan.next();
		
		System.out.println("enter the amount:");
		int amount=scan.nextInt();

		int sender_res=updateSender(sender, amount);

		int receiver_res=updateReceiver(receiver, amount);

		
		if(isConfirmed(sender_res,receiver_res)) {
			
			connection.commit();
			System.out.println("Transaction is Successful");
			
		}
		else {
			connection.rollback();
			System.out.println("Transaction is Failed");
		}

	}

	public static boolean isConfirmed(int sender_res,int receiver_res) {

		System.out.println("do you want to continue this transaction?(yes/No)");

		String choice=scan.next();

		return choice.equalsIgnoreCase("yes") && sender_res==1 && receiver_res==1;



	}

	public static int updateReceiver(String receiver, int amount) throws SQLException {
		PreparedStatement pstmt=connection.prepareStatement(Update_Receiver);

		pstmt.setInt(1, amount);
		pstmt.setString(2, receiver);

		int res=pstmt.executeUpdate();
		return res;
	}
	public static int updateSender(String sender, int amount) throws SQLException {
		PreparedStatement pstmt =connection.prepareStatement(Update_Sender);

		pstmt.setInt(1, amount);
		pstmt.setString(2, sender);

		int res=pstmt.executeUpdate();

		return res;
	}

}

























///---gpt code
//package com.jdbc.programs;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.util.Scanner;
//
//public class ACIDProperties {
//    private static final String URL = "jdbc:mysql://localhost:3306/javajdbc";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "admin";
//    
//    private static Connection connection;
//    private static Scanner scan = new Scanner(System.in);
//
//    // SQL Queries with TRIM() to ignore hidden spaces in database
//    private static final String Update_Sender = 
//        "update employee set salary=salary - ? where lower(trim(name)) = lower(trim(?))";
//    
//    private static final String Update_Receiver = 
//        "update employee set salary=salary + ? where lower(trim(name)) = lower(trim(?))";
//    
//    private static final String Check_Name = 
//        "select count(*) from employee where lower(trim(name)) = lower(trim(?))";
//    
//    private static final String Check_Balance = 
//        "select salary from employee where lower(trim(name)) = lower(trim(?))";
//
//    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//
//            // 1. Show initial state
//            System.out.println("--- Initial Database State ---");
//            Program2.display(connection);
//
//            // 2. Start Transaction
//            connection.setAutoCommit(false);
//            transaction();
//
//            // 3. Show final state
//            System.out.println("--- Final Database State ---");
//            Program2.display(connection);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (connection != null) connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static void transaction() throws SQLException {
//        System.out.println("Enter the name of the sender:");
//        String sender = scan.next().trim(); // removes input spaces
//
//        System.out.println("Enter the name of the receiver:");
//        String receiver = scan.next().trim();
//
//        System.out.println("Enter the amount:");
//        int amount = scan.nextInt();
//        
//        // Validation 1: Check existence
//        if (!exists(sender)) {
//            System.out.println("❌ Sender '" + sender + "' does not exist. Aborted.");
//            connection.rollback();
//            return;
//        }
//        if (!exists(receiver)) {
//            System.out.println("❌ Receiver '" + receiver + "' does not exist. Aborted.");
//            connection.rollback();
//            return;
//        }
//
//        // Validation 2: Check Balance
//        if (!hasSufficientBalance(sender, amount)) {
//            System.out.println("❌ Insufficient balance for '" + sender + "'. Aborted.");
//            connection.rollback();
//            return;
//        }
//
//        // Perform Updates
//        int sender_res = updateSender(sender, amount);
//        int receiver_res = updateReceiver(receiver, amount);
//
//        // Confirmation
//        if (isConfirmed(sender_res, receiver_res)) {
//            connection.commit();
//            System.out.println("✅ Transaction Committed Successfully");
//        } else {
//            connection.rollback();
//            System.out.println("❌ Transaction Rolled Back");
//        }
//    }
//
//    public static boolean exists(String name) throws SQLException {
//        try (PreparedStatement pstmt = connection.prepareStatement(Check_Name)) {
//            pstmt.setString(1, name);
//            var rs = pstmt.executeQuery();
//            if (rs.next()) return rs.getInt(1) > 0;
//        }
//        return false;
//    }
//
//    public static boolean hasSufficientBalance(String sender, int amount) throws SQLException {
//        try (PreparedStatement pstmt = connection.prepareStatement(Check_Balance)) {
//            pstmt.setString(1, sender);
//            var rs = pstmt.executeQuery();
//            if (rs.next()) {
//                return rs.getInt("salary") >= amount;
//            }
//        }
//        return false;
//    }
//
//    public static boolean isConfirmed(int sender_res, int receiver_res) {
//        if (sender_res == 1 && receiver_res == 1) {
//            System.out.println("Updates prepared. Do you want to commit? (yes/no)");
//            String choice = scan.next();
//            return choice.equalsIgnoreCase("yes");
//        }
//        return false;
//    }
//
//    public static int updateReceiver(String receiver, int amount) throws SQLException {
//        try (PreparedStatement pstmt = connection.prepareStatement(Update_Receiver)) {
//            pstmt.setInt(1, amount);
//            pstmt.setString(2, receiver);
//            return pstmt.executeUpdate();
//        }
//    }
//
//    public static int updateSender(String sender, int amount) throws SQLException {
//        try (PreparedStatement pstmt = connection.prepareStatement(Update_Sender)) {
//            pstmt.setInt(1, amount);
//            pstmt.setString(2, sender);
//            return pstmt.executeUpdate();
//        }
//    }
//}
