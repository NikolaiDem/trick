package com.example.trick.service;

import com.example.trick.dao.UserRepository;
import com.example.trick.domain.User;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Lazy //ее работает, потому что userRepository сам Lazy не является
    private UserRepository userRepository;

    public void updateUser(User user) {

    }

}
