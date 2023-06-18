package com.powernode.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class YourAspect {

    @Around("execution(* * (..))")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("YourAspect环绕通知开始");
        proceedingJoinPoint.proceed();
        System.out.println("YourAspect环绕通知结束");
    }

    @Before("execution(* * (..))")
    public void beforeAdvice() {
        System.out.println("YourAspect前置通知");
    }

    @AfterReturning("execution(* * (..))")
    public void afterReturningAdvice() {
        System.out.println("YourAspect后置通知");
    }

    @AfterThrowing("execution(* * (..))")
    public void afterThrowingAdvice() {
        System.out.println("YourAspect异常通知");
    }

    @After("execution(* * (..))")
    public void afterAdvice() {
        System.out.println("YourAspect最终通知");
    }
}
