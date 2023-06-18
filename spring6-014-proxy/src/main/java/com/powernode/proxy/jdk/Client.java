package com.powernode.proxy.jdk;

import com.powernode.mall.service.OrderService;
import com.powernode.proxy.jdk.impl.OrderServiceImpl;
import com.powernode.proxy.util.ProxyUtil;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        OrderService target = new OrderServiceImpl();
//        OrderService orderServiceProxy = (OrderService) Proxy.newProxyInstance(
//                target.getClass().getClassLoader(),
//                target.getClass().getInterfaces(),
//                new TimerInvocationHandler(target));
        OrderService orderServiceProxy = (OrderService) ProxyUtil.newProxyInstance(target);
        orderServiceProxy.generate();
        orderServiceProxy.detail();
        orderServiceProxy.modify();
    }
}
