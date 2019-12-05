package com.easymall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("userService")
public class UserServiceImplStaticProxy implements UserService {
    @Autowired
    @Qualifier("userServiceImpl")
    private  UserServiceImpl userServiceImpl = null;

    @Override
    public void regist() {
        try{
            System.out.println("记录日志。。");
            System.out.println("检测权限。。");
            System.out.println("开启事务。。");
            userServiceImpl.regist();
            System.out.println("提交事务");
        }catch (Exception e){
            System.out.println("回滚事务。。");
        }
    }

    @Override
    public void query() {
        try{
            System.out.println("记录日志。。");
            System.out.println("检测权限。。");
            System.out.println("开启事务。。");
            userServiceImpl.query();
            System.out.println("提交事务");
        }catch (Exception e){
            System.out.println("回滚事务。。");
        }
    }
}
