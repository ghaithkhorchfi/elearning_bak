package com.example.educIT.service;

import java.util.List;

import com.example.educIT.model.Teacher;
import com.example.educIT.model.User;

public interface TeacherService {
	public Teacher addTeacher(Teacher a);
	public void  deleteTeacher(Long id);
	public User getById(long id);
	public List<User>getAllUser();
	public Teacher updateTeacher(Teacher a);

}
