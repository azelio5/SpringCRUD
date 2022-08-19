package com.anvar.crud.mvc.model;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Transactional
@Entity
@Table(name = "users")
public class User {

    @Id
    private long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}