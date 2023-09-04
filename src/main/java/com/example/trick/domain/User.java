package com.example.trick.domain;

import jakarta.persistence.Entity;
import java.util.List;

@Entity
public class User {

    private String id;

    private List<Account> accountList;

}
