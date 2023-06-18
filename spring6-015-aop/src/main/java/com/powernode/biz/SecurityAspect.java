package com.powernode.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {

    @Pointcut("execution(* com.powernode.biz..save* (..))")
    public void savePointcut(){}

    @Pointcut("execution(* com.powernode.biz..delete* (..))")
    public void deletePointcut(){}

    @Pointcut("execution(* com.powernode.biz..modify* (..))")
    public void modifyPointcut(){}

    @Before("savePointcut() || deletePointcut()||modifyPointcut()")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("xxx操作员正在操作" + joinPoint.getSignature().getName() + "方法");
    }
}
