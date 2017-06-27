package com.niit.TrendyBackend.dao;

import com.niit.TrendyBackend.model.Category;

public interface CategoryDao {
	public boolean saveorupdate(Category category);
	public boolean delete(Category category);
	public Category getCategory(String catId);
	
}
