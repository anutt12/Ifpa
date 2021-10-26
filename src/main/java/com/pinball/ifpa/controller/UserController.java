package com.pinball.ifpa.controller;

import com.pinball.ifpa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/list")
    public List<User> listUsers() {return userService.listUsers();}

    @PostMapping("/signup")
    public User createUser(@RequestBody User newUser) {return userService.createUser(newUser);}

    @GetMapping("/user/{email}")
    public User getUserByEmail(@PathVariable String email) {return userService.findUserByEmail(email);}

    @GetMapping("/user/{name}")
    public User getUserByName(@PathVariable String firstName, String lastName) {return userService.getUserByName(firstName, lastName);}

    
}
