package com.easymall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Component
public class UserServiceImplJavaProxy {
    @Autowired
    @Qualifier("userServiceImpl")
    private  UserServiceImpl userServiceImpl = null;

    @Bean("userService")
    public UserService gteProxy(){
        UserService proxy = (UserService) Proxy.newProxyInstance(
                userServiceImpl.getClass().getClassLoader(),
                userServiceImpl.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        try{
                            System.out.println("记录日志");
                            System.out.println("检查权限");
                            System.out.println("开启事务");
                            Object retObj = method.invoke(userServiceImpl,args);
                            System.out.println("提交事务");
                            return retObj;
                        }catch (Exception e){
                            System.out.println("回滚事务");
                            throw e;
                        }
                    }
                }
        );
        return proxy;
    }
}
