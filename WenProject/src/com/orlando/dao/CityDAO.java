package com.orlando.dao;

import java.util.List;

import com.orlando.model.City;

public interface CityDAO {
	
	public List<City> findAllByStateId(int stateId);
	
}
