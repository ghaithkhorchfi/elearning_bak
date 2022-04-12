package com.example.educIT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.educIT.model.Course;

public interface CourseRepo extends JpaRepository<Course, Long> {

}
