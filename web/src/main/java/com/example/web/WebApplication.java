package com.example.web;

import com.example.redis.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;
import org.springframework.data.redis.core.RedisTemplate;

@EnableFeignClients(basePackages = "com.example.userInterface.service") //basePackages必须指定 否则 eureka的实现类注入会失败
@EnableDiscoveryClient
@SpringBootApplication
//@Import(com.example.redis.util.RedisUtils.class)
public class WebApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

    @Autowired
    RedisUtils redisUtils;

    @Override
    public void run(String... args) {
        RedisTemplate redisTemplate = redisUtils.getRedisTemplate();
        System.out.println(redisTemplate);
        redisTemplate.opsForValue().set("a", "haha");
    }
}
