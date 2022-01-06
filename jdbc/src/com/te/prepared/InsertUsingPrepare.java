package com.te.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUsingPrepare {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "1668");
			statement = connection.prepareStatement("insert into sweets values(?,?,?,?)");
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the sweet ID");
			int id = scan.nextInt();
			System.out.println("enter the sweet");
			String sweetName = scan.next();
			statement.setInt(1, id);
			statement.setString(2, sweetName);
			System.out.println("enter the price");
			double price= scan.nextDouble();
			statement.setDouble(3, price);
			statement.setInt(4, 1);
			int executeUpdate = statement.executeUpdate();
			System.out.println(executeUpdate);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
