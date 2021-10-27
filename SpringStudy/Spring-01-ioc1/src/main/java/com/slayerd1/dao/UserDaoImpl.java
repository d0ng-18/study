package com.slayerd1.dao;

import com.slayerd1.pojo.User;

public class UserDaoImpl implements UserDao{
    @Override
    public User getUser() {
        System.out.println("第一个Dao接口实现");
        return null;
    }
}
