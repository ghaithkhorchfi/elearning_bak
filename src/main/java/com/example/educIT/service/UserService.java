package com.example.educIT.service;

import java.util.List;

import com.example.educIT.model.User;

public interface UserService {
	public User addUser(User a);
	public void  deleteUser(Long id);
	public User getById(long id);
	public List<User>getAllUser();
	public User update(User a);

}
