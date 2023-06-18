package com.powernode.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestChoose {
    @Test
    public void testSpringChoose() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-choose.xml");

    }
}