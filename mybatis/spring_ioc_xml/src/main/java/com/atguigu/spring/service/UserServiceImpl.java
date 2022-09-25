package com.atguigu.spring.service;


import com.atguigu.spring.repository.UserDao;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser() {
        System.out.println("service invoke dao to add user.");
        userDao.addUser();
    }
}
