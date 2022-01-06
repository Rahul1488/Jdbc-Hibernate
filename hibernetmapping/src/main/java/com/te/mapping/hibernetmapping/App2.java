package com.te.mapping.hibernetmapping;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App2 {// this class is for one to many

	public static void main(String[] args) {
		Girl girl = new Girl();
		girl.setGid(1);
		girl.setName("ashi");
		Boy boy = new Boy();
		boy.setBid(1000);
		boy.setName("vivek");
		boy.setBalance(12020);

		Boy boy2 = new Boy();
		boy2.setBid(1001);
		boy2.setName("Salaman");
		boy2.setBalance(12054);

		Boy boy3 = new Boy();
		boy3.setBid(1002);
		boy3.setName("Salaman");
		boy3.setBalance(12054);
		List<Boy> asList = Arrays.asList(boy, boy2, boy3);

		girl.setBoy(asList);
		boy.setGirl(girl);
		boy2.setGirl(girl);
		boy3.setGirl(girl);

		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("Rahul");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(boy);
		createEntityManager.persist(boy2);
		createEntityManager.persist(boy3);
		createEntityManager.persist(girl);
		transaction.commit();
	}
}
