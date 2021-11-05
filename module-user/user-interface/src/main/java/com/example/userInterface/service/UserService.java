package com.example.userInterface.service;

import com.example.userInterface.po.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "user", path = "/user")
public interface UserService {

    @PostMapping(value = "test")
    User test();
}
