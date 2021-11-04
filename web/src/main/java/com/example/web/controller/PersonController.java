package com.example.web.controller;

import com.example.userInterface.po.Person;
import com.example.userInterface.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class PersonController {
    @Autowired
    private TestService testService;

    @PostMapping("test")
    public Person test() {
        return testService.test();
    }
}

