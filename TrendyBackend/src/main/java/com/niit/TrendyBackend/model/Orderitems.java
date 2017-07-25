//package com.niit.TrendyBackend.model;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import org.springframework.stereotype.Component;
//
//@Entity
//@Table
//@Component
//public class Orderitems {
//	@Id
//	private String item_Id;
//	private String Product_Id;
//	@ManyToOne
//	@JoinColumn(name="order_Id")
//	private Order order;
//	public String getItem_Id() {
//		return item_Id;
//	}
//	public void setItem_Id(String item_Id) {
//		this.item_Id = item_Id;
//	}
//	public String getProduct_Id() {
//		return Product_Id;
//	}
//	public void setProduct_Id(String product_Id) {
//		Product_Id = product_Id;
//	}
//	
//}
