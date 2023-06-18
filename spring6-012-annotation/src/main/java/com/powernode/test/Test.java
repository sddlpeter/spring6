package com.powernode.test;

import com.powernode.annotation.Component;
import org.springframework.stereotype.Service;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Object> beanMap = new HashMap<>();

        String packageName = "com.powernode.bean";
        String path = packageName.replaceAll("\\.", "/");
        URL url = ClassLoader.getSystemClassLoader().getResource(path);
        System.out.println(url);
        File file = new File(url.getPath());
        File[] files = file.listFiles();

        Arrays.stream(files).forEach(f -> {
            System.out.println(f);
            String className = packageName + "." + f.getName().split("\\.")[0];
            System.out.println(className);

            try {
                Class<?> clazz = Class.forName(className);
                if (clazz.isAnnotationPresent(Service.class)) {
                    Object bean = clazz.newInstance();
                    Service component = clazz.getAnnotation(Service.class);
                    String beanId = component.value();
                    beanMap.put(beanId, bean);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        });

        System.out.println(beanMap);
    }
}
