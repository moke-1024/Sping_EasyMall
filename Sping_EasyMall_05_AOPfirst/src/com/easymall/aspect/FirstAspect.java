package com.easymall.aspect;

import org.springframework.stereotype.Component;

@Component
public class FirstAspect {
    public void before(){
        System.out.println("before.....");
    }
}
