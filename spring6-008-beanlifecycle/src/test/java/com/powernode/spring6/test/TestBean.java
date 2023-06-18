package com.powernode.spring6.test;

import com.powernode.spring6.bean.Order;
import com.powernode.spring6.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void testBeanRegister() {
        Order order = new Order();
        System.out.println(order);

        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        defaultListableBeanFactory.registerSingleton("orderBean", order);

        Order orderBean = defaultListableBeanFactory.getBean("orderBean", Order.class);
        System.out.println(orderBean);
    }

    @Test
    public void testBeanLifecycle(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println("4. 使用bean并打印");
        System.out.println(userBean);
        applicationContext.close();
    }
}
