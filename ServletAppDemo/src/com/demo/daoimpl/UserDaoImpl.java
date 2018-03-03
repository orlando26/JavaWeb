package com.demo.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.demo.dao.DAOFactory;
import com.demo.dao.HibernateSession;
import com.demo.dao.UserDAO;
import com.demo.model.User;

public class UserDaoImpl implements UserDAO{

	private static final String INSERT_QUERY =
			"INSERT INTO USER (Id, Name, Last_Name, Email, Age, Address, Password) VALUES (NULL, ?, ?, ?, ?, ?, ?)";
	
	@Override
	public void insert(User user) {
		HibernateSession.saveObject(user);
	}


}
