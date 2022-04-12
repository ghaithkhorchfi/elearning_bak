package com.example.educIT.service;

import java.util.List;

import com.example.educIT.model.Course;

public interface CourseService {
	public Course addUser(Course a);
	public void  deleteUser(Long id);
	public Course getById(long id);
	public List<Course>getAllUser();
	public Course update(Course a);

}
