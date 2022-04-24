package com.example.educIT.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educIT.model.Student;
import com.example.educIT.model.User;
import com.example.educIT.repository.UserRepo;
import com.example.educIT.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private UserRepo userRepo;
	public Student addStudent(Student a) {
		return this.userRepo.save(a);		
	}
	public void  deleteStudent(Long id) {
		this.userRepo.deleteById(id);
	}
	public Student getById(long id) {
		Optional<User>user= this.userRepo.findById(id);
		return user.isPresent()?(Student)user.get():null;
	}
	public List<User>getAllUser(){
		return this.userRepo.findAll();
	}
	@Override
	public Student updateStudent(Student a) {
		return this.userRepo.save(a);
	}

}
