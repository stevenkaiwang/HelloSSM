package com.atguigu.service;

import com.atguigu.com.atguigu.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser() {
        System.out.println("service invoke dao to add user.");
        userDao.addUser();
    }
}
