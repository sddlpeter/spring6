package com.powernode.spring6.bean;

import java.util.Date;

public class Student {
    private Date birth;
    public Student() {
        System.out.println("student 的无参数构造方法执行了...");
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "birth=" + birth +
                '}';
    }
}
