package com.easymall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Component
public class UserServiceImplCglibProxy {
    @Autowired
    @Qualifier("userServiceImpl")
    private  UserServiceImpl userServiceImpl = null;

    @Bean("userService")
    public UserService gteProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setInterfaces(userServiceImpl.getClass().getInterfaces());
        enhancer.setSuperclass(userServiceImpl.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                try {
                    System.out.println("记录日志");
                    System.out.println("检查权限");
                    System.out.println("开启事务");
                    Object invoke = method.invoke(userServiceImpl, objects);
                    System.out.println("提交事务");
                    return invoke;
                }catch (Exception e){
                    System.out.println("回滚事务");
                    throw e;
                }

            }
        }
    );
        UserService proxy = (UserService) enhancer.create();
        return proxy;
    }
}
