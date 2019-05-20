package co.in.springmvcjpa.service;

import java.util.List;

import co.in.springmvcjpa.model.Person;

public interface PersonService {

	public Person addPerson(Person p);

	public Person deletePerson(int id);

	public List<Person> getAll();

	public Person updatePerson(Person p);

	public Person getById(int id);

}
