package com.payflow.user_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "app user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(unique = true)
    private String email;

    private String password;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    //getter setter
}
