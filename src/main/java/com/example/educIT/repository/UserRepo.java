package com.example.educIT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.educIT.model.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
