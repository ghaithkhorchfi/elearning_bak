package com.example.educIT.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.educIT.model.User;
import com.example.educIT.repository.UserRepo;
import com.example.educIT.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;
	public User addUser(User a) {
		return this.userRepo.save(a);		
	}
	public void  deleteUser(Long id) {
		this.userRepo.deleteById(id);
	}
	public User getById(long id) {
		Optional<User>user= this.userRepo.findById(id);
		return user.isPresent()?user.get():null;
	}
	public List<User>getAllUser(){
		return this.userRepo.findAll();
	}
	public User update(User a) {
		return this.userRepo.save(a);
	}

}
