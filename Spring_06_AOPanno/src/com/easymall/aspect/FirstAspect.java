package com.easymall.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.junit.Test;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class FirstAspect {
    @Pointcut("execution(* com.easymall.service..*.*(..))")
    public void mx(){

    }

    @Before("mx()")
    public void before(){
        System.out.println("before.....");
    }

    @Around("mx()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("around before...");
        Object p = jp.proceed();
        System.out.println("around after...");
    }
}
