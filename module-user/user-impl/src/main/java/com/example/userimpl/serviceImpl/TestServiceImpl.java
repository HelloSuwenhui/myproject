package com.example.userimpl.serviceImpl;

import com.example.userInterface.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class TestServiceImpl implements TestService {
    @Override
    @PostMapping(value = "test")
    public String test() {
        return "suwenhui";
    }
}
