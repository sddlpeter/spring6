package com.powernode.spring6.service;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void save() {
        System.out.println("用户信息已经被保存...");
    }
}
