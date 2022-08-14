package com.atguigu.mybatis.mappers;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    User getUserById(@Param("id") int id);
    User getUserByUsername(@Param("username") String username);

    User checkLogin(@Param("username") String username, @Param("password") String password);

    /**
     * map集合做为参数，不用使用@Param注解，在xml中直接使用其Key就可以
     *     <select id="checkLoginByMap" resultType="User" >
     *         select * from t_user where username = #{username} and password = #{password}
     *     </select>
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String, Object> map);

    User CheckLoginByUser(User user);

    List<User> getAllUser();

    int getCount();

    Map<String, Object> getUserToMap(@Param("id") int id);
    List<Map<String, Object>> getAllUserToList();

    @MapKey("id")
    Map<String, Object> getAllUserToMap();

    List<User> getAllUserLike(@Param("keyword") String keyword);

    void deleteUsers(@Param("ids") String ids);

    List<User> getAllUserFromDynamicTable(@Param("tablename") String tablename);

    void insertUserGetKey(User user);


}
