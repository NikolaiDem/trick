package com.example.trick.controller;

import com.example.trick.dao.UserRepository;
import com.example.trick.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{userName}")
    public User getUser(@PathVariable("userName") String userName) {
        log.debug("PUT user/{userName}");
        return userRepository.createUser(userName);
    }

    @PostMapping("/user")
    public User postUser(String userName) {
        log.debug("POST user");
        return userRepository.updateUser(userName);
    }

    @PutMapping("/user/{userName}")
    public User putUser(@PathVariable String userName) {
        return userRepository.createUser(userName);
    }


    @GetMapping("/getUser/country/{country}")
    public User findUsersFromCountry(@PathVariable String country) {
        log.debug("GET getUser/country/{country}");
        return userRepository.findByCountry(country);
    }
}
