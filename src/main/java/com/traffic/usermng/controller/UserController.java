package com.traffic.usermng.controller;

import com.traffic.usermng.entity.User;
import com.traffic.usermng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String defaultd() {
        return "userService.registerUser(username, password)";
    }

    @GetMapping("/register")
    public User registerUser(@RequestParam String username, @RequestParam String password) {
        return userService.registerUser(username, password);
    }
}