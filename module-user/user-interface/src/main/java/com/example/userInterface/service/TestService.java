package com.example.userInterface.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "user", path = "/user")
public interface TestService {

    @PostMapping(value = "test")
    String test();
}
