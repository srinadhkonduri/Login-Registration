package com.demo.authapp.AuthApp.service;

// src/main/java/com/example/services/UserService.java

import com.demo.authapp.AuthApp.models.User;
import com.demo.authapp.AuthApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    public User registerUser(User user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User findUserById(Long id) {
        // Use Optional to handle the possibility of a missing user
        Optional<User> userOptional = userRepository.findById(id);
        // Use orElseThrow to throw an exception if user not found
        return userOptional.orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        }
    }