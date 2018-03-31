package com.demo.dao;

import java.util.List;

import com.demo.model.User;

public interface UserDAO {
	
	public void insert(User user);
	
	public User findUserByEmail(String email);
	
	public List<User> getAllUsers();
	
	public void deleteUser(User user);
	
	public void updateUser(User user);
	
	public User findById(int id);

}
