package com.anvar.crud.mvc.dao;

import com.anvar.crud.mvc.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(User user);

    User readUser(long id);

    User deleteUser(long id);
}