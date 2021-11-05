package com.example.web.controller;

import com.example.userInterface.po.User;
import com.example.userInterface.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class TestController {
    @Autowired
    private UserService userService;

    @PostMapping("test")
    public User test() {
        return userService.test();
    }
}

