package com.powernode.biz;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionAspect {

    // @Around("execution(* * (..))")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {

        try {
            System.out.println("开启事务");
            long begin = System.currentTimeMillis();
            proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            System.out.println("总共耗时" + (end - begin) + "毫秒");
            System.out.println("提交事务");
        } catch (Throwable e) {
            System.out.println("回滚事务");
        }


    }
}
