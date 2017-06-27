package com.niit.TrendyBackend.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Product {

	private String Product_Id;
	private String Product_Name;
	private float Product_Price;
	private int Product_Quantity;
	private String Product_Description;
	public String getProduct_Id() {
		return Product_Id;
	}
	public void setProduct_Id(String product_Id) {
		Product_Id = product_Id;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public float getProduct_Price() {
		return Product_Price;
	}
	public void setProduct_Price(float product_Price) {
		Product_Price = product_Price;
	}
	public int getProduct_Quantity() {
		return Product_Quantity;
	}
	public void setProduct_Quantity(int product_Quantity) {
		Product_Quantity = product_Quantity;
	}
	public String getProduct_Description() {
		return Product_Description;
	}
	public void setProduct_Description(String product_Description) {
		Product_Description = product_Description;
	}
	
	
	
	
}
