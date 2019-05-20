package co.in.springmvcjpa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.in.springmvcjpa.dao.PersonDao;
import co.in.springmvcjpa.model.Person;
import co.in.springmvcjpa.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;

	@Override
	@Transactional
	public Person addPerson(final Person p) {

		return personDao.save(p);
	}

	@Override
	@Transactional
	public Person deletePerson(final int id) {

		final Optional<Person> p = personDao.findById(id);
		if (p.isPresent()) {
			personDao.delete(p.get());
			return p.get();
		}
		return null;

	}

	@Override
	@Transactional
	public List<Person> getAll() {

		return personDao.findAll();
	}

	@Override
	@Transactional
	public Person updatePerson(final Person p) {

		return personDao.save(p);
	}

	@Override
	@Transactional
	public Person getById(final int id) {

		final Optional<Person> person = personDao.findById(id);
		return person.isPresent() ? person.get() : null;
	}

}
