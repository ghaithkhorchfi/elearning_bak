package com.example.educIT.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity

public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="course_Id")
	private Long Id;
	@Column
	private String name;
	@Column
	private String detail;
	@Column
	private String link;
	@ManyToOne
	//@JsonBackReference
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
	private Teacher teach;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name="inscription",
	joinColumns =@JoinColumn(name="id"),
	inverseJoinColumns = @JoinColumn(name="stud_id")
	)
	@JsonIgnore
	private List<Student>stud=new ArrayList<>();
	
	

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



	public Course(Long id, String name, String detail, String link, Teacher teach, List<Student> stud) {
		super();
		Id = id;
		this.name = name;
		this.detail = detail;
		this.link = link;
		this.teach = teach;
		this.stud = stud;
	}





	public Long getId() {
		return Id;
	}





	public void setId(Long id) {
		Id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getDetail() {
		return detail;
	}





	public void setDetail(String detail) {
		this.detail = detail;
	}





	public String getLink() {
		return link;
	}





	public void setLink(String link) {
		this.link = link;
	}





	public Teacher getTeach() {
		return teach;
	}





	public void setTeach(Teacher teach) {
		this.teach = teach;
	}





	public List<Student> getStud() {
		return stud;
	}





	public void setStud(List<Student> stud) {
		this.stud = stud;
	}

	@Override
	public String toString() {
		return "Course [Id=" + Id + ", name=" + name + ", detail=" + detail + ", link=" + link + ", teacher=" + teach
				+ "]";
	}
	

}
