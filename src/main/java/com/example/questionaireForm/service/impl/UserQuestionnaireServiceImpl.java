package com.example.questionaireForm.service.impl;

import com.example.questionaireForm.entity.Questionnaire;
import com.example.questionaireForm.entity.User;
import com.example.questionaireForm.entity.UserQuestionnaire;
import com.example.questionaireForm.repository.UserQuestionnaireRep;
import com.example.questionaireForm.service.UserQuestionnaireService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserQuestionnaireServiceImpl implements UserQuestionnaireService {
    @Autowired
    private UserQuestionnaireRep userQuestionnaireRep;
    @Override
    public UserQuestionnaire createUserQuestionnaire(User user, Questionnaire questionnaire) {
        UserQuestionnaire userQuestionnaire = new UserQuestionnaire();
        userQuestionnaire.setUser(user);
        userQuestionnaire.setQuestionnaire(questionnaire);
        return userQuestionnaireRep.save(userQuestionnaire);
    }
    @Override
    public List<UserQuestionnaire> getUserQuestionnairesByUser(User user) {
        return userQuestionnaireRep.findByUser(user);
    }
    public UserQuestionnaire getUserQuestionnaireById(Long id) {
        return userQuestionnaireRep.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("UserQuestionnaire not found with id: " + id));
    }

}
