package co.in.springmvcjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "person_id")
	private int id;
	@Column(name = "fname")
	private String fname;
	@Column(name = "lname")
	private String lname;

	/**
	 * @return the id
	 */
	public int getId() {

		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final int id) {

		this.id = id;
	}

	/**
	 * @return the fname
	 */
	public String getFname() {

		return fname;
	}

	/**
	 * @param fname
	 *            the fname to set
	 */
	public void setFname(final String fname) {

		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {

		return lname;
	}

	/**
	 * @param lname
	 *            the lname to set
	 */
	public void setLname(final String lname) {

		this.lname = lname;
	}

}
