package com.slayerd.dao;

import com.slayerd.pojo.User;
import org.apache.ibatis.type.Alias;

@Alias("mapper")
public interface UserMapper {
    User getUser(int id);
}
