package com.Project.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
@Id
@GeneratedValue
	private int cartid;
	private String cartname;
	
	
	public Cart() {
		super();
	}
	public Cart(int cartid, String cartname) {
		super();
		this.cartid = cartid;
		this.cartname = cartname;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public String getCartname() {
		return cartname;
	}
	public void setCartname(String cartname) {
		this.cartname = cartname;
	}
	
	
	
}
