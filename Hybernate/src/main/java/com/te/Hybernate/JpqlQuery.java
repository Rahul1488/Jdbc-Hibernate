package com.te.Hybernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlQuery {
	public static void main(String[] args) {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("team");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
//		String query = "from Team";
//		Query createQuery = createEntityManager.createQuery(query);
//		
//		List<Team> resultList = createQuery.getResultList();
//		for (Team team : resultList) {
//			System.out.println(team);
//		}

		// query for minimum salary using jpql
		String query1 = "from Team where name='Yuzi'";
		Query createQuery2 = createEntityManager.createQuery(query1);
		Object singleResult = createQuery2.getSingleResult();
		System.out.println(singleResult);

//		//query for updating data of data table
//		EntityTransaction transaction = createEntityManager.getTransaction();
//		String query2 = "update Team set salary=1500 where id=19";
//		transaction.begin();
//		Query createQuery3 = createEntityManager.createQuery(query2);
//		int executeUpdate = createQuery3.executeUpdate();
//		transaction.commit();

//		//query to delete data from db
//		String query3 = "delete from Team where id=19";
//		EntityTransaction transaction = createEntityManager.getTransaction();
//		transaction.begin();
//		Query createQuery3 = createEntityManager.createQuery(query3);
//		int executeUpdate = createQuery3.executeUpdate();
//		transaction.commit();
//
//		EntityTransaction transaction = createEntityManager.getTransaction();
//		String query4 = "update Team set salary=:sal where id=:od";
//		transaction.begin();
//		Query createQuery3 = createEntityManager.createQuery(query4);
//		createQuery3.setParameter("sal", 320.0);
//		createQuery3.setParameter("od", 15);
//		int executeUpdate = createQuery3.executeUpdate();
//		transaction.commit();

	}
}
