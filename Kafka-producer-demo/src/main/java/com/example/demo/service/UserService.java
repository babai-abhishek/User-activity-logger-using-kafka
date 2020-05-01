package com.example.demo.service;

import com.example.demo.repository.UserRepository;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);
        return "User Added";
    }
}
