package com.te.practicedemo;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
		Connection connection = null;
		Statement createStatement = null;

		try {
			FileReader fileReader = new FileReader("G:\\Java files external\\crudfile.txt");
			Properties properties = new Properties();
			properties.load(fileReader);
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", properties);
			createStatement = connection.createStatement();
			createStatement.execute("delete from sweets where id =104");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			if (createStatement != null) {
				try {
					createStatement.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}
	}
}
