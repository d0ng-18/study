package com.slayerd10.dao;

import com.slayerd10.pojo.User;
import org.apache.ibatis.type.Alias;

@Alias("mapper")
public interface UserMapper {
    User getUser(int id);
}
