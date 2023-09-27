package com.example.questionaireForm.repository;

import com.example.questionaireForm.entity.Questionnaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionnaireRep extends JpaRepository<Questionnaire,Long> {
}
