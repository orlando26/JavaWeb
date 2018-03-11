package test;

import java.util.List;

import com.demo.dao.CityDAO;
import com.demo.dao.StateDAO;
import com.demo.daoimpl.CityDAOImpl;
import com.demo.daoimpl.StateDAOImpl;
import com.demo.model.City;
import com.demo.model.State;

public class Test {
	public static void main(String[] args) {
		StateDAO stateDao = new StateDAOImpl();
		List<State> stateList = stateDao.getAllStates();
		
		for (State state : stateList) {
			System.out.println(state.getName());
		}
		
		CityDAO cityDao = new CityDAOImpl();
		List<City> cities = cityDao.findAllByStateId(28);
		for (City city : cities) {
			System.out.println(city.getName());
		}
		
	}
}
