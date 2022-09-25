package com.atguigu.spring.repository;

public class UserDaoImpl implements UserDao {

    @Override
    public void addUser() {
        System.out.println("saved user! ");
    }
}
