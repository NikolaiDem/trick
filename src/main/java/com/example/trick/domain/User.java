package com.example.trick.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class User {

    @Id
    @Column(name = "id", nullable = false)
    private String id;
    private String name;

    @OneToMany
    private List<Account> accountList;

}
