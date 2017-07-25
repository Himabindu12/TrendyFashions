package com.niit.TrendyBackend.dao;

import com.niit.TrendyBackend.model.User;

public interface UserDao {
	public boolean saveorupdate(User user);
	public boolean delete(User user);
	public User getUser(String userId);
	

}
