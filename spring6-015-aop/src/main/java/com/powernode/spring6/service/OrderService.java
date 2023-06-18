package com.powernode.spring6.service;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void generate() {
        System.out.println("订单已经生成...");
        // throw new RuntimeException("模拟异常...");
    }
}
