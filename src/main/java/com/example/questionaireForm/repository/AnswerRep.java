package com.example.questionaireForm.repository;

import com.example.questionaireForm.entity.Answer;
import com.example.questionaireForm.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRep extends JpaRepository<Answer, Long> {
    List<Answer> findByQuestion(Question question);
}
