package com.powernode.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class MyAspect {

    @Pointcut("execution(* * (..))")
    public void pointCut(){}

    @Around("pointCut()")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知开始...");
        proceedingJoinPoint.proceed();
        System.out.println("环绕通知结束.");
    }

    @Before("pointCut()")
    public void beforeAdvice() {
        System.out.println("前置通知");
    }

    @AfterReturning("pointCut()")
    public void afterReturningAdvice() {
        System.out.println("后置通知");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowingAdvice() {
        System.out.println("异常通知");
    }


    @After("pointCut()")
    public void afterAdvice() {
        System.out.println("最终通知");
    }
}
