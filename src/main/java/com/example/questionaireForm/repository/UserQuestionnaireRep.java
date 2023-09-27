package com.example.questionaireForm.repository;

import com.example.questionaireForm.entity.User;
import com.example.questionaireForm.entity.UserQuestionnaire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserQuestionnaireRep extends JpaRepository<UserQuestionnaire, Long> {
    List<UserQuestionnaire> findByUser(User user);
}
