package com.example.userimpl.serviceImpl;

import com.example.userInterface.po.User;
import com.example.userInterface.service.RoleService;
import com.example.userInterface.service.UserService;
import com.example.userimpl.mapper.PersonMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
@Slf4j
public class RoleServiceImpl implements RoleService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    @PostMapping(value = "test")
    public User test() {
        return personMapper.queryById(1);
    }
}
