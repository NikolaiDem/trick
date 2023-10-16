package com.example.trick.dao;

import com.example.trick.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public User createUser(String userName) {
        return null;
    }


    @Override
    public User updateUser(String userName) {
        return null;
    }


    @Override
    public User findByCountry(String country) {
        return null;
    }
}
