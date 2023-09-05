package com.example.trick.dao;

import com.example.trick.domain.User;

public interface UserRepository {

    User createUser(String userName);

    User updateUser(String userName);

    User findByCountry(String country);
}
