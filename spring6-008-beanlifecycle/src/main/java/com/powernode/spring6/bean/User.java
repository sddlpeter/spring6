package com.powernode.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class User implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {
    private String name;

    public User() {
        System.out.println("1. 实例化bean");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2. bean属性赋值");
    }

    public void initBean() {
        System.out.println("3. 初始化bean");
    }

    public void destroyBean() {
        System.out.println("5. 销毁bean");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("   * Bean赋值之后执行：BeanNameAware..." + name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("   * 初始化之前执行：initializing bean - afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("   * 销毁之前执行: disposable Bean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }
}
