package com.example.educIT.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("student")
public class Student extends User {
	@ManyToMany(mappedBy = "stud",fetch = FetchType.EAGER)
	private List<Course>Courses;
	
	

	public Student(Long id, String name, String email, String password, List<Course> courses) {
		super(id, name, email, password);
		Courses = courses;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long id, String name, String email, String password) {
		super(id, name, email, password);
		// TODO Auto-generated constructor stub
	}

	public List<Course> getCourses() {
		return Courses;
	}

	public void setCourses(List<Course> courses) {
		Courses = courses;
	}



	
	

}
