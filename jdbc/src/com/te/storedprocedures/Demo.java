package com.te.storedprocedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Demo {
//	CREATE DEFINER=`root`@`localhost` PROCEDURE `put`(in id int,in name varchar(50),in cost double ,in  quantity int)
//			BEGIN
//			insert into sweets values(id,name,cost,quantity);
//			END
	// here i have mentioned the query in the above for creating stored procedure
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		Connection connection = null;
		CallableStatement callstatement = null;
		try {
			connection = DriverManager.getConnection(url, "root", "1668");
			
			callstatement = connection.prepareCall("call put (?,?,?,?)");
			// taking the inputs from the user
			Scanner scanner = new Scanner(System.in);
			while (true) {
				System.out.println("enter the esweet id");
				int id = scanner.nextInt();
				if (id == 0) {
					break;
				}
				System.out.println("enter the name of the sweet");
				String name = scanner.next();
				System.out.println("enter the cost of the sweet");
				double cost = scanner.nextDouble();
				System.out.println("enter the quantity");
				int quantity = scanner.nextInt();
				// assigning the values to tables
				callstatement.setInt(1, id);
				callstatement.setString(2, name);
				callstatement.setDouble(3, cost);
				callstatement.setInt(4, quantity);
				// execute statements
				callstatement.execute();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
