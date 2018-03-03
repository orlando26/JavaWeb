package test;

import java.util.List;

import com.demo.dao.StateDAO;
import com.demo.daoimpl.StateDAOImpl;
import com.demo.model.State;

public class Test {
	public static void main(String[] args) {
		StateDAO stateDao = new StateDAOImpl();
		List<State> stateList = stateDao.getAllStates();
		
		for (State state : stateList) {
			System.out.println(state.getName());
		}
		
		
	}
}
