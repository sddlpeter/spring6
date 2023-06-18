package com.powernode.cjlib;

import com.powernode.proxy.jdk.TimerInvocationHandler;
import net.sf.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new TimerMethodInterceptor());

        UserService userServiceProxy = (UserService) enhancer.create();

        userServiceProxy.login();
        userServiceProxy.logout();
    }
}
