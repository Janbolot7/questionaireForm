package com.example.questionaireForm.repository;

import com.example.questionaireForm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRep extends JpaRepository<User, Long> {
}
