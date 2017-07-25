package com.niit.TrendyBackend.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class Supplier
{
	@Id
private String Supplier_ID;
private String Supplier_Name;
private String Supplier_Address;
private String Supplier_phoneNumber;
@OneToMany(mappedBy="supplier")
private List<Product> product;


public List<Product> getProduct() {
	return product;
}
public void setProduct(List<Product> product) {
	this.product = product;
}
public String getSupplier_ID() {
	return Supplier_ID;
}
public void setSupplier_ID(String supplier_ID) {
	Supplier_ID = supplier_ID;
}
public String getSupplier_Name() {
	return Supplier_Name;
}
public void setSupplier_Name(String supplier_Name) {
	Supplier_Name = supplier_Name;
}
public String getSupplier_Address() {
	return Supplier_Address;
}
public void setSupplier_Address(String supplier_Address) {
	Supplier_Address = supplier_Address;
}
public String getSupplier_phoneNumber() {
	return Supplier_phoneNumber;
}
public void setSupplier_phoneNumber(String supplier_phoneNumber) {
	Supplier_phoneNumber = supplier_phoneNumber;
}

}
