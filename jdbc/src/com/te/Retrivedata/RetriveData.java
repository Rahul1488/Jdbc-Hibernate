package com.te.Retrivedata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class RetriveData {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "1668");
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from sweets");
			while(result.next()) {
//				System.out.print(result.getString(1)+",");
//				System.out.print(result.getString(2)+",");
//				System.out.print(result.getString(3)+",");
//				System.out.println(result.getString(4)+",");
				//==========================================//here we can use string to fetch the data
				System.out.print(result.getInt(1)+",");
				System.out.print(result.getString(2)+",");
				System.out.print(result.getDouble(3)+",");
				System.out.println(result.getInt(4)+",");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
