package com.powernode.spring6.beans;

import java.util.Properties;

public class MyConnection {
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "MyConnection{" +
                "properties=" + properties +
                '}';
    }
}
