package com.example.service;

import org.springframework.stereotype.Service;
import com.example.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add(String name) {
        userRepository.save(name);
    }

    public List<String> getAllUsers() {
        return userRepository.findAll();
    }
}
