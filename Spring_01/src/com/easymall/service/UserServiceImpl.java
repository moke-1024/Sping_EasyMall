package com.easymall.service;

import com.easymall.dao.UserDao;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
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
