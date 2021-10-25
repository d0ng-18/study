package com.slayerd.dao;

import com.slayerd.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //根据id查询用户
    @Select("select * from user")
    List<User> getUsers();

}
