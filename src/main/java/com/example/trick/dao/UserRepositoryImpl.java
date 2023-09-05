package com.example.trick.dao;

import com.example.trick.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    //кольцевая зависимость
    @Autowired
    private AccountRepository accountRepository; //Autowired над полем неправильно

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
