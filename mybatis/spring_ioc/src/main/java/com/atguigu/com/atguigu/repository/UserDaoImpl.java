package com.atguigu.com.atguigu.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void addUser() {
        System.out.println("saved user! ");
    }
}
