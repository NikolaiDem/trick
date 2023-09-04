package com.example.trick.dao;

import com.example.trick.domain.User;

public interface AccountRepository {

    User createAccount(String accountNumber);

}
