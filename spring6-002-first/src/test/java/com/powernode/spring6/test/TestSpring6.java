package com.powernode.spring6.test;

import com.powernode.spring6.bean.User;
import com.powernode.spring6.bean.Vip;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Target;

public class TestSpring6 {
    @Test
    public void testLog4j2() {
        Logger logger = LoggerFactory.getLogger(User.class);
        logger.info("这是一条日志消息...");

    }

    @Test
    public void testCreateObject() throws Exception {
        Class<?> clazz = Class.forName("com.powernode.spring6.bean.User");
        Object o = clazz.newInstance();
        System.out.println(o);
    }

    @Test
    public void testBeanFactory() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml", "beans.xml");
        Vip vip = beanFactory.getBean("vipBean", Vip.class);
        System.out.println(vip);
    }

    @Test
    public void testFirstProgram() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml", "beans.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println(user);

    }
}
