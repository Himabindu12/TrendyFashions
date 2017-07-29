package com.niit.Dao;

import java.util.List;

import com.niit.model.CartItems;

public interface CartItemsDao {

	public boolean saveorupdate(CartItems crtms);

	public boolean delete(CartItems crtms);

	public CartItems get(String crtmsId);

	public List<CartItems> list();
}


