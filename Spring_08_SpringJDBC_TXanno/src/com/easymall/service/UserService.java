package com.easymall.service;

import com.easymall.domain.User;
import java.io.IOException;

public interface UserService {
    public void addUser(User user) throws IOException;
    public User queryUser(int id);
}
