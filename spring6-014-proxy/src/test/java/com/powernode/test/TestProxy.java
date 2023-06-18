package com.powernode.test;

import com.powernode.mall.service.OrderService;
import com.powernode.mall.service.impl.OrderServiceImpl;
import com.powernode.mall.service.impl.OrderServiceImplInherit;
import com.powernode.mall.service.impl.OrderServiceProxy;
import org.junit.Test;

import java.lang.annotation.Target;

public class TestProxy {
    @Test
    public void testProxy() {
        OrderService target = new OrderServiceImpl();
        OrderService proxy = new OrderServiceProxy(target);
        proxy.generate();
        proxy.detail();
        proxy.modify();
    }

    @Test
    public void testServiceInherit() {
        OrderService orderService = new OrderServiceImplInherit();
        orderService.generate();
        orderService.modify();
        orderService.detail();
    }

    @Test
    public void testService() {
        OrderService orderService = new OrderServiceImpl();
        orderService.generate();
        orderService.detail();
        orderService.modify();
    }
}
