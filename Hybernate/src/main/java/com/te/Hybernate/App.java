package com.te.Hybernate;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {//main class to add the object explicitly
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Team player = new Team();
		player.setId(1);
		player.setName("MS Dhobi");
		player.setSalary(20000);
		player.setDesignation("Captain");

		Team player2 = new Team();
		player2.setId(18);
		player2.setName("Virat Kohli");
		player2.setSalary(7000);
		player2.setDesignation("Vice-Captain");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("team");// here im passing name from xml file
		// persistance class is returning entity manager factory
		EntityManager createEntityManager = emf.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(player);
		createEntityManager.persist(player2);
		transaction.commit();

	}
}
