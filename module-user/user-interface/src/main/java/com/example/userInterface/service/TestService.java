package com.example.userInterface.service;

import com.example.userInterface.po.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "user", path = "/user")
public interface TestService {

    @PostMapping(value = "test")
    Person test();
}
