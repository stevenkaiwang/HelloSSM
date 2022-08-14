package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mappers.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParamTest {

//    @Test
//    public void testGetUserById(){
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User user = mapper.getUserById(5);
//        System.out.println(user);
//        sqlSession.close();
//    }
//
//    @Test
//    public void getUserByUsername(){
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User user = mapper.getUserByUsername("root");
//        System.out.println(user);
//        sqlSession.close();
//    }
//
//
//    @Test
//    public void checkLogin(){
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User user = mapper.checkLogin("root", "123");
//        System.out.println(user);
//        sqlSession.close();
//    }
//
//    @Test
//    public void checkLoginByMap(){
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        Map<String ,Object> map = new HashMap<>();
//        map.put("username", "admin");
//        map.put("password", "123456");
//        User user = mapper.checkLoginByMap(map);
//        System.out.println(user);
//        sqlSession.close();
//    }
//
//    @Test
//    public void checkLoginByUser(){
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User user = new User();
//        user.setUsername("admin");
//        user.setPassword("123456");
//        user = mapper.CheckLoginByUser(user);
//        System.out.println(user);
//        sqlSession.close();
//    }
//
//    @Test
//    public void testGetAllUser(){
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> allUser = mapper.getAllUser();
//        for (User user: allUser) {
//            System.out.println(user);
//        }
//        // .forEach(element -> {System.out.println(element)})但是System.out.println的参数和传递的参数element 的类型完全匹配，
//        // 所以这样的时候就可以简化为：.forEach（System.out::println)
//        allUser.forEach(System.out::println);
//        sqlSession.close();
//    }
//
//    @Test
//    public void testGetCount(){
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        int count = mapper.getCount();
//        System.out.println("count=" + count);
//        sqlSession.close();
//    }
//
//    @Test
//    public void testGetUserToMap(){
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        Map<String, Object> userToMap;
//        userToMap = mapper.getUserToMap(5);
//        System.out.println(userToMap);
//        sqlSession.close();
//    }
//
//    @Test
//    public void testGetAllUserToList(){
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<Map<String, Object>> allUser = mapper.getAllUserToList();
//        for (Map user: allUser) {
//            System.out.println(user);
//        }
//        sqlSession.close();
//    }
//
//    @Test
//    public void testGetAllUserToMap(){
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        Map<String, Object> allUserToMap = mapper.getAllUserToMap();;
//        System.out.println(allUserToMap);
//        sqlSession.close();
//    }

//    @Test
//    public void testGetAllUserLike()
//    {
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> allUsers = mapper.getAllUserLike("w");
//        allUsers.forEach(System.out::println);
//        sqlSession.close();
//    }


//    @Test
//    public void testDeleteUsers()
//    {
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        mapper.deleteUsers("8");
////        System.out.println("count=" + count);
//        sqlSession.close();
//    }

//    @Test
//    public void getAllUserFromDynamicTable()
//    {
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> allUsers = mapper.getAllUserFromDynamicTable("t_user");
//        allUsers.forEach(System.out::println);
//        sqlSession.close();
//    }

    @Test
    public void insertUserGetKey(){
        SqlSession sqlSession = SqlSessionUtil.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null,"wk","123",22,"男","mail@qq.com");
        mapper.insertUserGetKey(user);
        System.out.println(user);
        sqlSession.close();
    }

}
