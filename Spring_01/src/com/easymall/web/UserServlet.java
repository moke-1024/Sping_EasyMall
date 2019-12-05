package com.easymall.web;


import com.easymall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserServlet{
    @Autowired
    private UserService userService =null;

    public void regist() {
        userService.regist();
    }
    public void query() {
        userService.query();
    }
}
