package com.te.crud;
//this is as similar to  create table but we have used Class.forname here

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) {
		Statement createStatement = null;
		Connection connection = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");// here I have passed driver object in form of package
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "1668");
			createStatement = connection.createStatement();
			boolean execute = createStatement.execute("Insert into sweets values(102,'ButterMysorePak',35,1)");
			boolean execute2 = createStatement.execute("Insert into sweets values(103,'Peda',20,1)");

		} catch (ClassNotFoundException | SQLException e) {
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
