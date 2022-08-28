package com.atguigu.test;

import com.atguigu.com.atguigu.repository.UserDao;
import com.atguigu.controller.UserController;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOCByAnnotation {

    @Test
    public void testIOCByAnnotation(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = ac.getBean(UserController.class);
        System.out.println(userController);
        UserService userService = ac.getBean(UserService.class);
        System.out.println(userService);
        UserDao userDao = ac.getBean(UserDao.class);
        System.out.println(userDao);
    }

    @Test
    public void testAutowired() {
        ApplicationContext ac  = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = ac.getBean(UserController.class);
        userController.addUser();
    }

}


