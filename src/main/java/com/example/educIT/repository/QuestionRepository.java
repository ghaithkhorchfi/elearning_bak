package com.example.educIT.repository;

import com.example.educIT.model.Choice;
import com.example.educIT.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
