package com.powernode.spring6.bean;

public class User {
    int id = 1;
    String name = "zhang san";

    public User() {
        System.out.println("User 的无参数构造方法执行...");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
