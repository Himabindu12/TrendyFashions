package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity 
@Table
@Component
public class OrderItems {

	@Id
	private String orderitemId;
	private String productid;
	public String getOrderitemId() {
		return orderitemId;
	}
	public void setOrderitemId(String orderitemId) {
		this.orderitemId = orderitemId;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
}
