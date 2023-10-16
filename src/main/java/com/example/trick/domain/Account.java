package com.example.trick.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Entity
public class Account {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}
