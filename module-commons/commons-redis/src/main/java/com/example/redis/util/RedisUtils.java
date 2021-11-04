package com.example.redis.util;

import org.springframework.data.redis.core.RedisTemplate;

public class RedisUtils {
    private volatile static RedisTemplate redisTemplate;

    public RedisUtils() {
    }

    public static void setRedisTemplate(RedisTemplate template) {
        if (redisTemplate == null) {
            synchronized (RedisUtils.class) {
                if (redisTemplate == null) {
                    redisTemplate = template;
                }
            }
        }
    }
}
