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

import com.example.educIT.model.Student;
import com.example.educIT.model.User;
import com.example.educIT.service.StudentService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/students")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping
	public Student addStudent(@RequestBody Student a) {
		return this.studentService.addStudent(a);
	}
	@GetMapping
	public List<User> getAllStudent(){
		return this.studentService.getAllUser();
	}
	@PutMapping("/{id}")
	public Student update(@PathVariable Long id, Student a) {
		return this.studentService.updateStudent(a);
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		this.studentService.deleteStudent(id);
		
	}
	@GetMapping("/{id}")
	public Student getById(@PathVariable Long id) {
		return this.studentService.getById(id);
	}
	

}
