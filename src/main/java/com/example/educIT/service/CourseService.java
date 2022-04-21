package com.example.educIT.service;

import java.util.List;

import com.example.educIT.model.Course;

public interface CourseService {
	public Course addCourse(Course a);
	public void  deleteCourse(Long id);
	public Course getById(long id);
	public List<Course>getAllCourse();
	public Course update(Course a);
	public Course abon(Course c ,Long id);

}
