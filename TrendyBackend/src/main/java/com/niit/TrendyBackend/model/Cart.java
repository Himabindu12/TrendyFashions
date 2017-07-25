//package com.niit.TrendyBackend.model;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import org.springframework.stereotype.Component;
//
//@Entity
//@Table
//@Component
//public class Cart {
//	@Id
//	private String cart_Id;
//	private double grand_total=0.0;
//	private int total_item=0;
//	@OneToMany(mappedBy="cart")
//	private List<Cartitems> cartitems;
//	
//	public String getCart_Id() {
//		return cart_Id;
//	}
//	public void setCart_Id(String cart_Id) {
//		this.cart_Id = cart_Id;
//	}
//	public double getGrand_total() {
//		return grand_total;
//	}
//	public void setGrand_total(double grand_total) {
//		this.grand_total = grand_total;
//	}
//	public int getTotal_item() {
//		return total_item;
//	}
//	public void setTotal_item(int total_item) {
//		this.total_item = total_item;
//	}
//	
//	
//	
//
//}
