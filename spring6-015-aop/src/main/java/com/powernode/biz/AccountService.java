package com.powernode.biz;


import org.springframework.stereotype.Component;

@Component
public class AccountService {
    public void transfer() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("正在进行银行账户转账...");
    }

    public void withdraw() {
        System.out.println("正在进行取款操作...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
