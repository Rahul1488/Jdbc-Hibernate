package com.te.addBatchDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class BatchStatement {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		FileReader fileReader;
		Statement statement = null;
		Connection connection = null;
		try {
			fileReader = new FileReader("G:\\Java files external\\crudfile.txt");
			Properties properties = new Properties();
			properties.load(fileReader);
			connection = DriverManager.getConnection(url, properties);
			statement = connection.createStatement();
			statement.addBatch("insert into employees values(101,'kumar')");
			statement.addBatch("update employees set name ='manju' where id =101");
			statement.addBatch("insert into employees values(103,'siddu')");
			statement.executeBatch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
