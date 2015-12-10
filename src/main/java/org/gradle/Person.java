package org.gradle;

import java.util.Date;

import org.gradle.pets.Animal;

public class Person {
	private final String name;
	private Animal cat;
	private Date dob;
	
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Animal getCat() {
		return cat;
	}

	public void setCat(Animal cat) {
		this.cat = cat;
	}

	public Person() {
		name = "Richard";
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
