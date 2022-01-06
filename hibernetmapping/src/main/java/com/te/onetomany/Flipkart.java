package com.te.onetomany;

import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Flipkart {
	public static void main(String[] args) {
		Item item = new Item();
		item.setItemNum(1);
		Cart cart = new Cart();
		cart.setId(101);
		cart.setName("Iphone");
		cart.setCost(65000);
		item.setPriceCart(65000);

		Item item2 = new Item();
		item2.setItemNum(2);
		cart.setName("oneplus");
		cart.setCost(45000);
		item2.setPriceCart(110000);

		Item item3 = new Item();
		item3.setItemNum(3);
		cart.setName("Samsung");
		cart.setCost(5000);
		item3.setPriceCart(115000);

		List<Item> asList = Arrays.asList(item, item2, item3);
		cart.setItem(asList);
		item.setCart(cart);
		item2.setCart(cart);
		item3.setCart(cart);
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("Rahul");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(cart);
		createEntityManager.persist(item);
		createEntityManager.persist(item2);
		createEntityManager.persist(item3);
		transaction.commit();

	}
}
