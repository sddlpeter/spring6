package com.powernode.test;

import com.powernode.service.UserService;
import com.powernode.spring6.config.Spring6Configuration;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringConfigClass {
    @Test
    public void testConfigClass() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Spring6Configuration.class);
        UserService userService = annotationConfigApplicationContext.getBean("userService", UserService.class);
        userService.save();
    }
}
