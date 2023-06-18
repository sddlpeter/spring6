package com.powernode.biz;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void generate() {
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("正在生成订单...");
    }

    public void cancel() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("正在取消订单...");
    }
}
