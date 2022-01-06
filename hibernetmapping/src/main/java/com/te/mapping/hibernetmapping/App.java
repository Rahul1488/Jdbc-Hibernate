package com.te.mapping.hibernetmapping;

import javax.persistence.EntityManager;//this class is for one to one mapping
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//public class App {
//	public static void main(String[] args) {
//		Girl girl = new Girl();
//		girl.setGid(1);
//		girl.setName("ashi");
//		Boy boy = new Boy();
//		boy.setBalance(1200000);
//		boy.setBid(101);
//		boy.setName("abbbbbh");
//		girl.setBoy(boy);
//		boy.setGirl(girl);
//		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("Rahul");
//		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
//		EntityTransaction transaction = createEntityManager.getTransaction();
//		transaction.begin();
//		createEntityManager.persist(boy);
//		createEntityManager.persist(girl);
//		transaction.commit();
//	}
//}
