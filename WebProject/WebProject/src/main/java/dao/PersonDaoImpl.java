package dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import model.Person;

public class PersonDaoImpl implements PersonDao{
	//DAO(Data Access Object)
	
	private static final String GET_ALL_PERSONS = "FROM Person";
	
	public List<Person> findAll() {
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		TypedQuery<Person> query = session.createQuery(GET_ALL_PERSONS);
		List<Person> list = query.getResultList();
		session.close();
		return list;
	}

	public Person findById(Integer id) {
		Person person = (Person)HibernateSession.getObjectByPrimaryKey(Person.class, id);
		return person;
	}

	public void insert(Person person) {
		HibernateSession.saveObject(person);
	}

	public void update(Person person) {
		HibernateSession.updateObject(person);
	}

	public void delete(Person person) {
		HibernateSession.deleteObject(person);
	}

}
