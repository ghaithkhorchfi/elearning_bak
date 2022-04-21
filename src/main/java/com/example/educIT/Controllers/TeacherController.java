package com.example.educIT.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.educIT.model.Teacher;
import com.example.educIT.model.User;
import com.example.educIT.service.TeacherService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/teachers")
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	@PostMapping
	public Teacher add(@RequestBody User a) {
		Teacher t=new Teacher(a);
		t.setName(a.getName());
		t.setEmail(a.getEmail());
		t.setPassword(a.getPassword());
		t.setRole(a.getRole());
		return this.teacherService.addTeacher(t);
		
	}
	@GetMapping
	public List<User> getAllTeacher(){
		return this.teacherService.getAllUser();
	}
	@PutMapping("/{id}")
	public Teacher update(@PathVariable Long id, @RequestBody Teacher a) {
		return this.teacherService.updateTeacher(a);
		
	}
	@GetMapping("/{id}")
	public User getById(@PathVariable Long id) {
		return this.teacherService.getById(id);
		
	}

	
	
}
