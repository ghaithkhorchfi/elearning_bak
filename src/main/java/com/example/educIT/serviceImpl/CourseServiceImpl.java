package com.example.educIT.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educIT.model.Course;
import com.example.educIT.model.Student;
import com.example.educIT.model.User;
import com.example.educIT.repository.CourseRepo;
import com.example.educIT.repository.UserRepo;
import com.example.educIT.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	CourseRepo courseRepo;
	@Autowired
	UserRepo userRepo;

	@Override
	public Course addCourse(Course a) {
		// TODO Auto-generated method stub
		return this.courseRepo.save(a);
	}

	@Override
	public void deleteCourse(Long id) {
		// TODO Auto-generated method stub
		this.courseRepo.deleteById(id);
		
	}

	@Override
	public Course getById(long id) {
		// TODO Auto-generated method stub
		Optional<Course>course= this.courseRepo.findById(id);
		return course.isPresent()?course.get():null;
	}

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return this.courseRepo.findAll();
	}

	@Override
	public Course update(Course a) {
		// TODO Auto-generated method stub
		return this.courseRepo.save(a);
	}

	@Override
	public Course abon(Course c, Long id) {
		// TODO Auto-generated method stub
		Optional<User> e= userRepo.findById(id);
		c.abon((Student)e.get());
		return this.courseRepo.save(c) ;
	}

}
