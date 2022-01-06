package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class CreateTable {
	public static void main(String[] args) {
		Connection connection = null;
		Statement createStatement = null;
		// 1st step here we are loading or register the driver
		try {
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			// 2nd step create the connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=1668");
			// 3rd step creatting a platform(statement)
			createStatement = connection.createStatement();
			// execute query
			createStatement.execute("create table sweets(id int ,name varchar(50),cost double,quantity double)");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
					
				}
			}
			if (createStatement != null) {
				try {
					createStatement.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
		}

	}
}
