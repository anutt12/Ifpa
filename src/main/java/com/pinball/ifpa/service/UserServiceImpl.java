package com.pinball.ifpa.service;

import com.pinball.ifpa.model.User;
import com.pinball.ifpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> listUsers() {return userRepository.findAll();}

    @Override
    public User createUser(User newUser) {return userRepository.save(newUser);}

    @Override
    public User findUserByEmail(String email) {return userRepository.findByEmail(email);}

    @Override
    public User findUserByName(String name) {return userRepository.findUserByName(name);}
}
