package com.powernode.bank.test;

import com.powernode.bank.Spring6Config;
import com.powernode.bank.pojo.Account;
import com.powernode.bank.service.AccountService;
import com.powernode.bank.service.impl.IsolationService1;
import com.powernode.bank.service.impl.IsolationService2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIsolation {
    @Test
    public void testXml() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.transfer("act-001", "act-002", 10000.0);
    }

    @Test
    public void testIsolation3() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        IsolationService2 isolation2 = applicationContext.getBean("isolation2", IsolationService2.class);
        Account account = new Account("act-007", 1000.0);
        isolation2.save(account);
    }

    @Test
    public void testAnnotation() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.transfer("act-001", "act-002", 1000);
        System.out.println("transfer completed...");
    }

    @Test
    public void testIsolation1() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        IsolationService1 isolation1 = applicationContext.getBean("isolation1", IsolationService1.class);
        isolation1.getByActno("act-004");
    }

    @Test
    public void testIsolation2() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        IsolationService2 isolation2 = applicationContext.getBean("isolation2", IsolationService2.class);
        Account account = new Account("act-004", 1000.0);
        isolation2.save(account);
    }
}
