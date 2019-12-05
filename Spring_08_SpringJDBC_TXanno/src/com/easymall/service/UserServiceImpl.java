package com.easymall.service;


import com.easymall.dao.UserDao;
import com.easymall.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao = null;

    @Override
    @Transactional
    public void addUser(User user) throws IOException {
        userDao.addUser(user);
//        throw new IOException();
    }

    @Override
    public User queryUser(int id) {
        return userDao.queryUser(id);
    }
}
