package com.atguigu.service;

import com.atguigu.com.atguigu.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl2 implements UserService {

    @Autowired
    private UserDao userDao;

    @Override

    public void addUser() {
        System.out.println("service2 invoke dao to add user.");
        userDao.addUser();
    }
}
