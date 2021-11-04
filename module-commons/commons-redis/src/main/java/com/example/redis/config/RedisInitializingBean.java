package com.example.redis.config;

import com.example.redis.util.RedisUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisInitializingBean implements BeanFactoryAware, InitializingBean {
    private BeanFactory beanFactory;
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public void afterPropertiesSet() throws Exception {
        RedisTemplate template = beanFactory.getBean(RedisTemplate.class);
        RedisUtils.setRedisTemplate(template);
    }
}
