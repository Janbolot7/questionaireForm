package com.example.questionaireForm.service.impl;

import com.example.questionaireForm.entity.Questionnaire;
import com.example.questionaireForm.enums.TypeAnswer;
import com.example.questionaireForm.repository.QuestionnaireRep;
import com.example.questionaireForm.service.QuestionnaireService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@Transactional
public class QuestionnaireServiceImpl implements QuestionnaireService {
    @Autowired
    private QuestionnaireRep questionnaireRep;
    @Override
    public Questionnaire createQuestionnaire(String title, TypeAnswer type) {
        Questionnaire questionnaire = new Questionnaire();
        questionnaire.setTitle(title);
        questionnaire.setTypeAnswer(type);
        return questionnaireRep.save(questionnaire);
    }
    @Override
    public List<Questionnaire> getAllQuestionnaires() {
        return questionnaireRep.findAll();
    }
    @Override
    public Questionnaire getQuestionnaireById(Long id) {
        return questionnaireRep.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Questionnaire not found with id: " + id));
    }

    @Override
    public void delete(Long id) {
        questionnaireRep.deleteById(id);
    }

    @Override
    public Questionnaire update(Long id, String title, TypeAnswer newType) {
        Questionnaire questionnaire = questionnaireRep.findById(id).orElseThrow(() -> new NoSuchElementException("Lol"));
        questionnaire.setTitle(title);
        questionnaire.setTypeAnswer(newType);
        return questionnaire;
    }
}
