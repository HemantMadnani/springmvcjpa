package co.in.springmvcjpa.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import co.in.springmvcjpa.model.Person;
import co.in.springmvcjpa.service.PersonService;

@RestController
public class HomeController {

	@Autowired
	private PersonService personService;

	@RequestMapping(value = "/")
	public ModelAndView test(final HttpServletResponse response) {

		System.err.println("hi how");

		final Person person = new Person();
		person.setFname("Hemant");
		person.setLname("M");

		personService.addPerson(person);
		return new ModelAndView("home");
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Person>> listAllPersons() {

		System.out.println(personService.getAll());
		return new ResponseEntity<>(personService.getAll(), HttpStatus.OK);
	}

}
