package com.te.transactioncontrollanguage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		Savepoint setSavepoint = null;
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		try {
			connection = DriverManager.getConnection(url,"root","1668");
			statement = connection.createStatement();
			connection.setAutoCommit(false);
			statement.execute("insert into trans values(1,'unlocking by fingerprint')");
			statement.execute("insert into trans values(2,'enter the pin')");
			statement.execute("insert into trans values(3,'checking the balance')");
			System.out.println("Balance is 250000");
			setSavepoint = connection.setSavepoint();
			statement.execute("insert into trans values(4,'debiting the amount')");
			statement.execute("insert into trans values(5,'transfer through the network')");
			statement.execute("insert into trans values(6,'crediting to amound')");
			System.out.println("the amount transfered!!!notify");
			connection.commit();
		} catch (SQLException e) {
//			try {
//				if (setSavepoint!=null) {
//					connection.rollback(setSavepoint);
//					connection.commit();
//				}
//				
//			} catch (SQLException e1) {
//
//			}
			System.out.println("transaction failes!!!!!!!!");
		}
	}
}
