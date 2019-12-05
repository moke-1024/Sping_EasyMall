package com.easymall.web;


import com.easymall.domain.User;
import com.easymall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class UserServlet {

    @Autowired
    private UserService userService = null;

    public void addUser(User user){
        try {
            userService.addUser(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public User queryUser(int id){
        return userService.queryUser(id);
    }
}
