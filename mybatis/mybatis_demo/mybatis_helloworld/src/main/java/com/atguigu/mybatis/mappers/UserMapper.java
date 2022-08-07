package com.atguigu.mybatis.mappers;
import com.atguigu.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    /*
    add user
     */
    int insertUser();
    /*
    update user
    */
    void updateUser();

    void deleteUser();

    User getUserById();

    List<User> getAllUser();

}
