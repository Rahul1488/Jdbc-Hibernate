package com.te.Hybernate;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App3 {
	public static void main(String[] args) {//class to add objects dynamically
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of objects you want to create");
		int num = scanner.nextInt();
		Team player = new Team();
		for (int i = 0; i < num; i++) {
			System.out.println("enter the id ");
			int id = scanner.nextInt();
			player.setId(id);
			System.out.println("enter the player name");
			String s1 = scanner.next();
			player.setName(s1);
			System.out.println("Enter the salary");
			double sal = scanner.nextDouble();
			player.setSalary(sal);
			System.out.println("enter the designation");
			String s2 = scanner.next();
			player.setDesignation(s2);
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("team");// here im passing name from xml
																						// file
			// persistance class is returning entity manager factory
			EntityManager createEntityManager = emf.createEntityManager();
			EntityTransaction transaction = createEntityManager.getTransaction();
			transaction.begin();
			createEntityManager.persist(player);
			transaction.commit();
		}
	}
}
