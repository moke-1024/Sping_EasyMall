package com.easymall.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MysqlUserDao implements UserDao {
    @Override
    public void addUser() {
        System.out.println("mysql增加用户...");
    }

    @Override
    public void queryUser() {
        System.out.println("mysql查询用户...");
    }
}
