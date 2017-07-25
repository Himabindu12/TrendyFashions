package com.niit.TrendyBackend.dao;

import com.niit.TrendyBackend.model.Product;

public interface ProductDao {
	public boolean saveorupdate(Product product);
	public boolean delete(Product product );
	public Product getProduct(String productId);
	
}
