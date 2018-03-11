package com.demo.dao;

import com.demo.model.User;

public interface UserDAO {
	
	public void insert(User user);
	
	public User findUserByEmail(String email);
	
	public void delete(User user);

}
