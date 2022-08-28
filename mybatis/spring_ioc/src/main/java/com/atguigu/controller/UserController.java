package com.atguigu.controller;

import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
//    @Qualifier("userServiceImpl2")
    private UserService userService;

    public void addUser(){
        userService.addUser();
    }

}
