package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mappers.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class ParamterTest {

//    @Test
//    public void testUpdate(){
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        mapper.updateUser();
//        sqlSession.close();
//    }
//
//    @Test
//    public void TestDelect(){
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        mapper.deleteUser();
//        sqlSession.close();
//    }

    @Test
    public void TestGetUserById(){
        SqlSession sqlSession = SqlSessionUtil.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void TestgetAllUser(){
        SqlSession sqlSession = SqlSessionUtil.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        for (User user : mapper.getAllUser()) {
            System.out.println(user);
        }

    }

}
