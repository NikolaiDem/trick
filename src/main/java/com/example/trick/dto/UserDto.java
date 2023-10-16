package com.example.trick.dto;

import com.example.trick.domain.Account;
import jakarta.persistence.Entity;

import java.util.List;

public class UserDto {

    private String id;

    private List<Account> accountList;

}
