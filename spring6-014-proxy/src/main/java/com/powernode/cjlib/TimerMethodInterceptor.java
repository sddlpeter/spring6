package com.powernode.cjlib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TimerMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object target, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long begin = System.currentTimeMillis();
        Object returnVal = methodProxy.invokeSuper(target, objects);
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end - begin) + "毫秒");
        return returnVal;
    }
}
