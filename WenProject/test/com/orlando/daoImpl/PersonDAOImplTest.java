package com.orlando.daoImpl;

import org.junit.Test;

import com.orlando.dao.PersonDAO;
import com.orlando.daoimpl.PersonDAOImpl;
import com.orlando.model.Person;

public class PersonDAOImplTest {
	
	@Test
	public void insertTest(){
		PersonDAO personDao = new PersonDAOImpl();
		Person person = new Person();
		person.setName("Mario");
		person.setLastName("Benedetti");
		person.setEmail("marioB@gmail.com");
		person.setAge(24);
		person.setAddress("mty");
		person.setState("NL");
		person.setCity("San Nicolas");
		person.setPassword("password");
		
		personDao.insert(person);
	}
	
}
