package com.example.userimpl.serviceImpl;

import com.example.userInterface.po.Person;
import com.example.userInterface.service.TestService;
import com.example.userimpl.mapper.PersonMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class TestServiceImpl implements TestService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    @PostMapping(value = "test")
    public Person test() {
        return personMapper.queryById(1);
    }
}
