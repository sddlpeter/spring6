package com.powernode.test;

import com.powernode.spring6.service.OrderService;
import com.powernode.spring6.service.Spring6Configuration;
import com.powernode.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Target;

public class TestAOP {

    @Test
    public void testClassConfig() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Spring6Configuration.class);
        OrderService orderService = annotationConfigApplicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }

    @Test
    public void testAop() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aspectj-aop-annotation.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }

    @Test
    public void testUserService() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aspectj-aop-annotation.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.save();
    }
}
