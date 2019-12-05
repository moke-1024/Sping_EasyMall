package com.easymall.service;

import com.easymall.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao = null;

    @Override
    public void regist() {
        userDao.addUser();
    }

    @Override
    public void query() {
        userDao.queryUser();

    }
}
