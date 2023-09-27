package com.example.questionaireForm.service;

import com.example.questionaireForm.entity.Question;
import com.example.questionaireForm.entity.Questionnaire;
import com.example.questionaireForm.entity.Question;
import com.example.questionaireForm.entity.Questionnaire;

import java.util.List;

public interface QuestionService {
    Question createQuestion(String text, Questionnaire questionnaire);

    List<Question> getQuestionsByQuestionnaire(Questionnaire questionnaire);

    Question getQuestionById(Long id);
}
