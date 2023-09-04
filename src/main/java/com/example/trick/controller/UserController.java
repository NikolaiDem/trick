package com.example.trick.controller;

import com.example.trick.dao.UserRepository;
import com.example.trick.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired //инжект через поле
    private UserRepository userRepository;

    @GetMapping("/getUser/{userName}") //неправильное именование эндпоинта
    public User getUser(@PathVariable("userName") String userName) {
        return userRepository.createUser(userName);
    }
}
