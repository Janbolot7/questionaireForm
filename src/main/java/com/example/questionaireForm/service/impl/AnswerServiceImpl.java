package com.example.questionaireForm.service.impl;

import com.example.questionaireForm.entity.Answer;
import com.example.questionaireForm.entity.Question;
import com.example.questionaireForm.repository.AnswerRep;
import com.example.questionaireForm.repository.QuestionRep;
import com.example.questionaireForm.service.AnswerService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    private AnswerRep answerRep;
    @Autowired
    private QuestionRep questionRep;



    @Override
    public Answer createAnswer(String text, Long question) {
        Question question1 = questionRep.findById(question).orElseThrow();
        Answer answer = new Answer();
        answer.setText(text);
        answer.setQuestion(question1);
        return answerRep.save(answer);
    }
    @Override
    public List<Answer> getAnswersByQuestion(Question question) {
        return answerRep.findByQuestion(question);
    }
    @Override
    public Answer getAnswerById(Long id) {
        return answerRep.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Answer not found with id: " + id));
    }
}
