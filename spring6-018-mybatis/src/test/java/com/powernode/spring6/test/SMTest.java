package com.powernode.spring6.test;

import com.powernode.bank.mapper.AccountMapper;
import com.powernode.bank.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SMTest {
    @Test
    public void testSM() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        // AccountMapper accountMapper = applicationContext.getBean("AccountMapper", AccountMapper.class);
    }
}
