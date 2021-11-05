package com.example.userInterface.service;

import com.example.userInterface.po.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "permissions", path = "/permissions")
public interface PermissionsService {

    @PostMapping(value = "test")
    User test();
}
