package com.te.Hybernate;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App4 {
	public static final Logger LOGGER = Logger.getLogger(App4.class.getName());

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("team");
		EntityManager createEntityManager = emf.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();

		Team yuvi = createEntityManager.find(Team.class, 12);// we need to find the entity everytime before performing
																// an operation

////	
////here we are deleting a data from the db	
//	transaction.begin();
//	createEntityManager.remove(yuvi);
//	transaction.commit();
//	
////here we are updating the data to the database
		Team ms = createEntityManager.find(Team.class, 1);
		if (ms != null) {
			transaction.begin();
			ms.setDesignation("Player");
			transaction.commit();
			System.out.println("updated");

		}
	}
}
