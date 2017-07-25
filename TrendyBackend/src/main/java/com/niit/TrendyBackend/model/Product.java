package com.niit.TrendyBackend.model;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Product {

	@Id
	private String Product_Id;
	private String Product_Name;
	private float Product_Price;
	private int Product_Quantity;
	private String Product_Description;
	@ManyToOne
	@JoinColumn(name="cat_Id")
	private Category category;
	@ManyToOne
	@JoinColumn(name="Supplier_ID")
	private Supplier supplier;
	
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
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
		
}
