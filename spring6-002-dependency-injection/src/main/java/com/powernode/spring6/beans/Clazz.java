package com.powernode.spring6.beans;

public class Clazz {
    private String name;
    public Clazz() {

    }

    public Clazz(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "name='" + name + '\'' +
                '}';
    }
}
