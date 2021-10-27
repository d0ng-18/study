package com.slayerd1.service;

import com.slayerd1.dao.UserDao;
import com.slayerd1.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}


