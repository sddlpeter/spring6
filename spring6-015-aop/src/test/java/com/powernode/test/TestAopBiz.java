package com.powernode.test;

import com.powernode.biz.*;
import com.powernode.spring6.service.Spring6Configuration;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class TestAopBiz {
    @Test
    public void testSecurity() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        ProductService productService = applicationContext.getBean("productService", ProductService.class);
        userService.getUser();
        userService.saveUser();
        userService.modifyUser();
        userService.deleteUser();
        productService.getProduct();
        productService.saveProduct();
        productService.deleteProduct();
        productService.modifyProduct();
    }

    @Test
    public void testBiz() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        orderService.generate();
        accountService.transfer();

    }
}
