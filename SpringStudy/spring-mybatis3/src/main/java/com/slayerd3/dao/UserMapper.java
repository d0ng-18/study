package com.slayerd3.dao;

import com.slayerd3.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUsers();

    int addUser(User user);

    int deleteUser(int id);
}
