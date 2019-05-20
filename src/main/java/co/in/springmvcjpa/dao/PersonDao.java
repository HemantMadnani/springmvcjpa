package co.in.springmvcjpa.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.in.springmvcjpa.model.Person;

public interface PersonDao extends JpaRepository<Person, Integer> {

	Optional<Person> findById(int id);

}
