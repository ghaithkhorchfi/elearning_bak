package com.example.educIT.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("teacher")
public class Teacher extends User {
	@Column(name = "tech_course")
	@OneToMany(mappedBy = "teach")
	private List<Course>courses= new ArrayList<>();

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(Long id, String name, String email, String password) {
		super(id, name, email, password);
		// TODO Auto-generated constructor stub
	}

	public Teacher(Long id, String name, String email, String password, List<Course> courses) {
		super(id, name, email, password);
		this.courses = courses;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}


	
	

}
