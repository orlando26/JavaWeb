package com.demo.daoimpl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.demo.dao.CityDAO;
import com.demo.dao.HibernateSession;
import com.demo.model.City;

public class CityDAOImpl implements CityDAO{
	private static final String FIND_BY_STATE = "FROM City WHERE Id_State = :id";
	@Override
	public List<City> findAllByStateId(int stateId) {
		// TODO Auto-generated method stub
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		TypedQuery<City> query = session.createQuery(FIND_BY_STATE);
		query.setParameter("id", stateId);
		List<City> list = query.getResultList();
		session.close();
		
		return list;
	}

}
