package com.slayerd.dao;

import com.slayerd.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    //根据id查询用户
    User getUser(int id);
    //添加用户
    int insertUser(User user);
    //修改用户
    int updateUser(int id);
    //删除用户
    int deleteUser(int id);
    //模糊查询
    List<User> getUserLikeList(String value);
}
