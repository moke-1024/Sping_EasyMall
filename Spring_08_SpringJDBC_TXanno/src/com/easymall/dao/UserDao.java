package com.easymall.dao;


import com.easymall.domain.User;

public interface UserDao {
    public void addUser(User user);
    public User queryUser(int id);
}
