package com.example.educIT.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.educIT.model.Course;
import com.example.educIT.service.CourseService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/courses")
public class CourseController {
	@Autowired
	private CourseService courseservice;
	@PostMapping
	public Course addCourse(@RequestBody Course c ) {
		return this.courseservice.addCourse(c);
	}
	@GetMapping("")
	public List<Course> getAllCourse(){
		return this.courseservice.getAllCourse();}
	@PutMapping("/{id}")
	public Course update(@PathVariable Long id,@RequestBody Course c) {
		return this.courseservice.update(c);
		
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		this.courseservice.deleteCourse(id);
		
	}
	@GetMapping("/{id}")
	public Course getById(@PathVariable Long id) {
		return this.courseservice.getById(id);
	}
	@PutMapping("/abon/{id}")
	public Course abon(@RequestBody Course c,@PathVariable Long id) {
		return this.courseservice.abon(c, id);
		
		
	}
	


}
