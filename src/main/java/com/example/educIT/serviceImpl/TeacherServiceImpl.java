package com.example.educIT.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educIT.model.Teacher;
import com.example.educIT.model.User;
import com.example.educIT.repository.UserRepo;
import com.example.educIT.service.TeacherService;
@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public Teacher addTeacher(Teacher a) {
		// TODO Auto-generated method stub
		return this.userRepo.save(a);
	}

	@Override
	public void deleteTeacher(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getById(long id) {
		// TODO Auto-generated method stub
		Optional<User>user= this.userRepo.findById(id);
		return user.isPresent()?user.get():null;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return this.userRepo.findAll();
	}

	@Override
	public Teacher updateTeacher(Teacher a) {
		// TODO Auto-generated method stub
		return this.userRepo.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		this.userRepo.deleteById(id);
		
	}

}
