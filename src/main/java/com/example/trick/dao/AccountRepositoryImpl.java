package com.example.trick.dao;

import com.example.trick.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryImpl implements AccountRepository {

    //кольцевая зависимость
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createAccount(String accountNumber) {
        return null;
    }
}
