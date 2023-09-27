package com.example.questionaireForm.service;

import com.example.questionaireForm.entity.User;
import com.example.questionaireForm.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    User updateUser(Long id, String newName);

    void deleteUser(Long id);
}
