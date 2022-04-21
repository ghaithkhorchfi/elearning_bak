package com.example.educIT.service;

import java.util.List;

import com.example.educIT.model.Student;
import com.example.educIT.model.User;

public interface StudentService {
	public Student addStudent(Student a);
	public void  deleteStudent(Long id);
	public Student getById(long id);
	public List<User>getAllUser();
	public Student updateStudent(Student a);

}
