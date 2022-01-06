package com.te.trywithresourse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TryWithResources {//which class is autoclosable we can write try with resources
	public static void main(String[] args) {
		try (Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=1668");
				Statement smt =con.createStatement();) {
			boolean execute = smt.execute("select * from sweets");
			System.out.println(execute);

		} catch (Exception e) {
			
		}
	}
}
