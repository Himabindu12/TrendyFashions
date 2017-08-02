package com.niit.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity 
@Table
@Component
public class Cart {

	@Id
	private String cartId;
	private double grandtotal=0.0;
	private int totalitem=0;
	
	@OneToOne
    @JoinColumn(name="uid")
    private User user;
	public Cart() {
		
		this.cartId ="CART"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public double getGrandtotal() {
		return grandtotal;
	}
	public void setGrandtotal(double grandtotal) {
		this.grandtotal = grandtotal;
	}
	public int getTotalitem() {
		return totalitem;
	}
	public void setTotalitem(int totalitem) {
		this.totalitem = totalitem;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}