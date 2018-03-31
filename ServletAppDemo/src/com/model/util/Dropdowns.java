package com.model.util;

import java.util.List;

import com.demo.dao.CityDAO;
import com.demo.dao.StateDAO;
import com.demo.dao.UserDAO;
import com.demo.daoimpl.CityDAOImpl;
import com.demo.daoimpl.StateDAOImpl;
import com.demo.daoimpl.UserDaoImpl;
import com.demo.model.City;
import com.demo.model.State;
import com.demo.model.User;

public class Dropdowns {
	
	private List<State> stateDrop;
	
	private List<City> cityDrop;
	
	private List<User> userList;

	public List<State> getStateDrop() {
		StateDAO stateDAO = new StateDAOImpl();
		stateDrop = stateDAO.getAllStates();
		return stateDrop;
	}

	public void setStateDrop(List<State> stateDrop) {
		this.stateDrop = stateDrop;
	}

	public List<City> getCityDrop(int stateId) {
		CityDAO cityDao = new CityDAOImpl();
		cityDrop = cityDao.findAllByStateId(stateId);
		return cityDrop;
	}

	public void setCityDrop(List<City> cityDrop) {
		this.cityDrop = cityDrop;
	}

	public List<User> getUserList() {
		UserDAO userDao = new UserDaoImpl();
		userList = userDao.getAllUsers();
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	
}
