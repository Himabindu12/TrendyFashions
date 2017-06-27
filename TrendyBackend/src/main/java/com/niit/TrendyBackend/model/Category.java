package com.niit.TrendyBackend.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Category {
	
	private String cat_Id;
	private String cat_Name;
	
	public String getCat_Id() {
		return cat_Id;
	}
	public void setCat_Id(String cat_Id) {
		this.cat_Id = cat_Id;
	}
	public String getCat_Name() {
		return cat_Name;
	}
	public void setCat_Name(String cat_Name) {
		this.cat_Name = cat_Name;
	}
	
	

}
