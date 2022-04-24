package com.example.educIT.Controllers;


import com.example.educIT.model.Question;
import com.example.educIT.repository.ChoiceRepository;
import com.example.educIT.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/questions")
public class QuestionController {
    @Autowired
    private ChoiceRepository choiceRepository;
    @Autowired
    private QuestionRepository questionRepository;





    @PostMapping("/add")
    public ResponseEntity<Question> addQuestion(@RequestBody Question question) {
        Question newQuestion = questionRepository.save(question);
        return new ResponseEntity<>(newQuestion, HttpStatus.CREATED);
    }


    @GetMapping("/findAll")
    public List<Question> findAllQuestions() {
        return questionRepository.findAll();
    }

    @PutMapping("/update")
    public ResponseEntity<Question> updateEmployee(@RequestBody Question question) {
        Question updatedQuestion = questionRepository.save(question);
        return new ResponseEntity<>(updatedQuestion, HttpStatus.OK);
    }

}
