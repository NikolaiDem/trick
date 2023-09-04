package com.example.trick.dao;

import static org.junit.jupiter.api.Assertions.*;

import com.example.trick.domain.User;
import org.junit.jupiter.api.Test;

class AccountRepositoryImplTest {

    private UserRepositoryImpl userRepository;

    @Test
    public void test() {
        User user = userRepository.createUser("");
        //нет проверок
    }
}