package com.example.questionaireForm.service;

import com.example.questionaireForm.entity.Answer;
import com.example.questionaireForm.entity.Question;

import java.util.List;

public interface AnswerService {


    Answer createAnswer(String text, Long question);

    List<Answer> getAnswersByQuestion(Question question);

    Answer getAnswerById(Long id);
}
