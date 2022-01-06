package com.te.Hybernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App2 {
	public static void main(String[] args) {// class to find the data
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("team");// here im passing name from xml file
		// persistance class is returning entity manager factory
		EntityManager createEntityManager = emf.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		Team find = createEntityManager.find(Team.class, 18);
		System.out.println(find);
	}
}
