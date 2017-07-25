//package com.niit.TrendyBackend.model;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import org.springframework.stereotype.Component;
//
//@Entity
//@Table
//@Component
//
//public class Cartitems {
//	@Id
//	private String car_Id;
//	private float price;
//	@ManyToOne
//	@JoinColumn(name="cart_Id")
//	private Cart cart;
//	@OneToOne
//	@JoinColumn(name="Product_ID")
//	private Product product;
//	public String getCar_Id() {
//		return car_Id;
//	}
//	public void setCar_Id(String car_Id) {
//		this.car_Id = car_Id;
//	}
//	public float getPrice() {
//		return price;
//	}
//	public void setPrice(float price) {
//		this.price = price;
//	}
//	
//	
//
//}
