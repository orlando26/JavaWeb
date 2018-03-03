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
//		Connection connection = DAOFactory.getMySqlDB().openConnection();
//
//		try{
//			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY);
//			preparedStatement.setString(1, user.getName());
//			preparedStatement.setString(2, user.getLastName());
//			preparedStatement.setString(3, user.getEmail());
//			preparedStatement.setInt(4, user.getAge());
//			preparedStatement.setString(5, user.getAddress());
//			preparedStatement.setString(6, user.getPassword());
//			preparedStatement.executeUpdate();
//			System.out.println("User saved correctly");
//			preparedStatement.close();
//			connection.close();
//		}catch (SQLException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		HibernateSession.saveObject(user);

	}


}
