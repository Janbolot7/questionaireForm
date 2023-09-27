package com.example.questionaireForm.controller;



import com.example.questionaireForm.entity.Answer;
import com.example.questionaireForm.entity.Question;
import com.example.questionaireForm.service.AnswerService;
import com.example.questionaireForm.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/answers")
public class AnswerController {
    @Autowired
    private AnswerService answerService;
    @Autowired
    private QuestionService questionServiceImpl;

    @PostMapping
    public ResponseEntity<?> createAnswer(@RequestParam String text, @RequestParam Long question) {
        Answer answer= answerService.createAnswer(text, question);
        return ResponseEntity.ok(answer);
    }

    @GetMapping("/question/{questionId}")
    public ResponseEntity<?> getAnswersByQuestion(@PathVariable Long questionId) {
        Question question = questionServiceImpl.getQuestionById(questionId);
        List<Answer> answers = answerService.getAnswersByQuestion(question);
        return ResponseEntity.ok(answers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAnswerById(@PathVariable Long id) {
        Answer answer = answerService.getAnswerById(id);
        return ResponseEntity.ok(answer);
    }

}




