package com.powernode.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimerInvocationHandler implements InvocationHandler {
    private Object target;

    public TimerInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long begin = System.currentTimeMillis();
        Object returnVal = method.invoke(target, args);
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end - begin) + "毫秒");
        return returnVal;
    }
}
