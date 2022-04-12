package com.example.educIT.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

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
	private Teacher teach;
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Student>stud=new ArrayList<>();
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(Long id, String name, String detail, Teacher teacher, String link) {
		super();
		Id = id;
		this.name = name;
		this.detail = detail;
		this.teach = teacher;
		this.link=link;
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
	public Teacher getTeacher() {
		return teach;
	}
	public void setTeacher(Teacher teacher) {
		this.teach = teacher;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	@Override
	public String toString() {
		return "Course [Id=" + Id + ", name=" + name + ", detail=" + detail + ", link=" + link + ", teacher=" + teach
				+ "]";
	}
	

}
