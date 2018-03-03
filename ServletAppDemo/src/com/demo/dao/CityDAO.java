package com.demo.dao;

import java.util.List;

import com.demo.model.City;

public interface CityDAO{
	
	public List<City> findAllByStateId(int stateId);
}
