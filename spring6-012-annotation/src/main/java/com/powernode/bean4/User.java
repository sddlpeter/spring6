package com.powernode.bean4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    private int age;

    public User() {
    }

    public User(@Value("wang wu") String name, @Value("22") int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Value("wang wu1")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
