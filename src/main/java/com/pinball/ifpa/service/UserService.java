package com.pinball.ifpa.service;

import com.pinball.ifpa.model.User;

import java.util.List;

public interface UserService {

    public List<User> listUsers();

    public User createUser(User newUser);

    public User findUserByEmail(String email);

    public User findUserByName(String name);
}
