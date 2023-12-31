package com.example.questionaireForm.service.impl;

import com.example.questionaireForm.entity.Question;
import com.example.questionaireForm.entity.Questionnaire;
import com.example.questionaireForm.repository.QuestionRep;
import com.example.questionaireForm.service.QuestionService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionRep questionRep;

    @Override
    public Question createQuestion(String text, Questionnaire questionnaire) {
        Question question = new Question();
        question.setText(text);
        question.setQuestionnaire(questionnaire);
        return questionRep.save(question);
    }
    @Override
    public List<Question> getQuestionsByQuestionnaire(Questionnaire questionnaire) {
        return questionRep.findByQuestionnaire(questionnaire);
    }
    public Question getQuestionById(Long id) {
        return questionRep.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Question not found with id: " + id));
    }
}
