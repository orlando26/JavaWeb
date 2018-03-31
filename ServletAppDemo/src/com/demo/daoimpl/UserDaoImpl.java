package com.demo.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.demo.dao.DAOFactory;
import com.demo.dao.HibernateSession;
import com.demo.dao.UserDAO;
import com.demo.model.State;
import com.demo.model.User;

public class UserDaoImpl implements UserDAO{

	private static final String FIND_BY_EMAIL = "FROM User where Email = :email";
	
	private static final String GET_ALL_USERS = "FROM User";
	
	
	@Override
	public void insert(User user) {
		HibernateSession.saveObject(user);
	}

	@Override
	public User findUserByEmail(String email) {
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		TypedQuery<User> query = session.createQuery(FIND_BY_EMAIL);
		query.setParameter("email", email);
		List<User> list = query.getResultList();
		session.close();
		return list.get(0);
	}

	@Override
	public List<User> getAllUsers() {
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		TypedQuery<User> query = session.createQuery(GET_ALL_USERS);
		List<User> list = query.getResultList();
		session.close();
		return list;
	}

	@Override
	public void deleteUser(User user) {
		HibernateSession.deleteObject(user);
	}

	@Override
	public void updateUser(User user) {
		HibernateSession.updateObject(user);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		User user = (User) HibernateSession.getObjectByPrimaryKey(User.class, id);
		return user;
	}


}
