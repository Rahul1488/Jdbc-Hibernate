package com.te.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Item {
	@Id
	private int itemNum;
	private double priceCart;
	@ManyToOne
	private Cart cart;
	public int getItemNum() {
		return itemNum;
	}
	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}
	public double getPriceCart() {
		return priceCart;
	}
	public void setPriceCart(double priceCart) {
		this.priceCart = priceCart;
	}
	
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	@Override
	public String toString() {
		return "Item [itemNum=" + itemNum + ", priceCart=" + priceCart + ", cart=" + cart + "]";
	}

	
	

}
