package com.powernode.spring6.test;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.powernode.spring6.beans.*;
import com.powernode.spring6.beans.Math;
import com.powernode.spring6.service.UserService;
import org.junit.Assume;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependencyInjection {

    @Test
    public void testProperties2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-properties.xml");
        MyDataSource datasource = applicationContext.getBean("dataSource", MyDataSource.class);
        System.out.println(datasource);
    }


    @Test
    public void testAutowire() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.save();
    }

    @Test
    public void testUtil() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-util.xml");

        MyDataSource1 dataSource1 = applicationContext.getBean("dataSource1", MyDataSource1.class);
        System.out.println(dataSource1);

        MyDataSource2 dataSource2 = applicationContext.getBean("dataSource2", MyDataSource2.class);
        System.out.println(dataSource2);
    }

    @Test
    public void testCname() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-c.xml");
        MyTime myTime = applicationContext.getBean("myTimeBean", MyTime.class);
        System.out.println(myTime);
    }

    @Test
    public void testPName() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-p.xml");
        Object customerBean = applicationContext.getBean("customerBean");
        System.out.println(customerBean);
    }

    @Test
    public void testMath() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-special.xml");
        Math math = applicationContext.getBean("mathBean", Math.class);
        System.out.println(math);
    }


    @Test
    public void testNull() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-null.xml");
        Vip vip = applicationContext.getBean("vipBean", Vip.class);
        System.out.println(vip);
    }

    @Test
    public void testProperties() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-datasource.xml");
        MyConnection properties = applicationContext.getBean("properties", MyConnection.class);
        System.out.println(properties);
    }

    @Test
    public void testCollection() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-collection.xml");
        People people = applicationContext.getBean("people", People.class);
        System.out.println(people);
    }

    @Test
    public void testArray2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-array.xml");
        Order order = applicationContext.getBean("order", Order.class);
        System.out.println(order);
    }

    @Test
    public void testArray() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-array-simple.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }

    @Test
    public void testCascade() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-cascade.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }


    @Test
    public void testAllSimpleType() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-all-simple-type.xml");
        A a = applicationContext.getBean("a", A.class);
        System.out.println(a);
    }

    @Test
    public void testDataSource() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-datasource.xml");
        MyDataSource dataSource = applicationContext.getBean("dataSource", MyDataSource.class);
        System.out.println(dataSource);
    }

    @Test
    public void testSimpleType() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-simple-type.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println(user);

        BeanUtils beanUtil;
    }

    @Test
    public void testConstructor() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService= applicationContext.getBean("userServiceBean", UserService.class);
        userService.delete();
    }

    @Test
    public void testInjection() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService= applicationContext.getBean("userServiceBean", UserService.class);
        userService.save();
    }
}
