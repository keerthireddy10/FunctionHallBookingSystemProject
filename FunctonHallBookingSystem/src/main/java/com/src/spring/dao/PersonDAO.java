package com.src.spring.dao;

import java.util.List;

import com.src.spring.model.Person;

public interface PersonDAO {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int customerid);
	public void removePerson(int customerid);
}
