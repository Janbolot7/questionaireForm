package com.example.questionaireForm.service;

import com.example.questionaireForm.entity.Questionnaire;
import com.example.questionaireForm.enums.TypeAnswer;
import com.example.questionaireForm.entity.Questionnaire;
import com.example.questionaireForm.enums.TypeAnswer;

import java.util.List;

public interface QuestionnaireService {

    Questionnaire createQuestionnaire(String title, TypeAnswer type);

    List<Questionnaire> getAllQuestionnaires();

    Questionnaire getQuestionnaireById(Long id);

    void delete(Long id);

    Questionnaire update(Long id, String title, TypeAnswer newType);
}
