package com.example.trick.service;

import com.example.trick.dao.UserRepository;
import com.example.trick.domain.User;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Lazy
    private UserRepository userRepository;

    public void updateUser(User user) {
        if (user.getName().isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty");
        }
    }

}
