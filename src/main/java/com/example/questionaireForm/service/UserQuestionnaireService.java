package com.example.questionaireForm.service;

import com.example.questionaireForm.entity.Questionnaire;
import com.example.questionaireForm.entity.User;
import com.example.questionaireForm.entity.UserQuestionnaire;
import com.example.questionaireForm.entity.Questionnaire;
import com.example.questionaireForm.entity.User;
import com.example.questionaireForm.entity.UserQuestionnaire;

import java.util.List;

public interface UserQuestionnaireService {
    UserQuestionnaire createUserQuestionnaire(User user, Questionnaire questionnaire);

    List<UserQuestionnaire> getUserQuestionnairesByUser(User user);

    UserQuestionnaire getUserQuestionnaireById(Long id);
}
