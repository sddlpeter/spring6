package com.powernode.bank.test;

import com.powernode.bank.pojo.Account;
import com.powernode.bank.service.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankTest {
    @Test
    public void testPropaganda() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        Account account = new Account("act-003", 1000.0);
        accountService.save(account);
    }

    @Test
    public void testTransfer() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        try {
            accountService.transfer("act-001", "act-002", 10000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
