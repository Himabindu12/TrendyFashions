package com.niit.TrendyBackend.dao;

import java.util.List;

import com.niit.TrendyBackend.model.Category;

public interface CategoryDao {
	public boolean saveorupdate(Category category);
	public boolean delete(Category category);
	public Category getCategory(String catId);
	public List<Category> list();
	
	
}
