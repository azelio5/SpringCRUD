package com.anvar.crud.mvc.service;

import com.anvar.crud.mvc.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User readUser(long id);

    User deleteUser(long parseUnsignedInt);

    void createOrUpdateUser(User user);

    void updateUser(User user);
}
