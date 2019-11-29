package dao;

import java.util.List;

import model.Person;

public interface PersonDao {
	
	public List<Person> findAll();
	
	public Person findById(Integer id);
	
	public void insert(Person person);
	
	public void update(Person person);
	
	public void delete(Person person);
	
}
