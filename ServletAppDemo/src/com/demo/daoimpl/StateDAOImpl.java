package com.demo.daoimpl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.demo.dao.HibernateSession;
import com.demo.dao.StateDAO;
import com.demo.model.State;

public class StateDAOImpl implements StateDAO{
	
	private static final String SELECT_ALL_QUERY = "FROM State";
	@Override
	public List<State> getAllStates() {
		// TODO Auto-generated method stub
		
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		TypedQuery<State> query = session.createQuery(SELECT_ALL_QUERY);
		List<State> list = query.getResultList();
		session.close();
		return list;
	}

}
